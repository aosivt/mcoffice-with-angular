import { PropertyForConnectionToService } from './propoty-for-connection-to-service';

import {map} from 'rxjs/operators';

import { RxStomp } from '@stomp/rx-stomp';

const stompConfig = {
    // Typically login, passcode and vhost
    // Adjust these for your broker
    // connectHeaders: {
    //   login: "guest",
    //   passcode: "guest"
    // },
    // Broker URL, should start with ws:// or wss:// - adjust for your broker setup
    brokerURL: PropertyForConnectionToService.getSocketURI(),
    // Keep it off for production, it can be quit verbose
    // Skip this key to disable
    debug: (str) => {
      console.log('STOMP: ' + str);
    },
    // If disconnected, it will retry after 200ms
    reconnectDelay: 5000,

  };

export abstract class AbstractSocketService {
    protected webSocketEndPoint: string = PropertyForConnectionToService.getSocketURI();

    protected userName = Date.now().toString();

    protected rxStomp: RxStomp;

    constructor() {
        this.initializeWebSocketConnection();
    }
    public abstract sendMessage(message);
    public abstract onMessageReceived(message);
    public initializeWebSocketConnection() {
        console.log('init websocket');
        const this_ = this;
        this.rxStomp = new RxStomp();
        this.rxStomp.configure(stompConfig);
        this.rxStomp.activate();
        const rxJsSubscription =
        this.rxStomp.watch('/user/security/user')
                    .pipe(map( (message) => {
            console.log(message.body);
            return JSON.parse(message.body);
          })).subscribe( (payload) => {
            this_.onMessageReceived(payload);
            console.log(payload);
          });
    }
}
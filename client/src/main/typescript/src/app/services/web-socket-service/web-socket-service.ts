import { Injectable } from '@angular/core';

import { AbstractSocketService } from '../abstract-socket-service';

import { JsonRpcRequest } from '../json-rpc/interfaces/json-rpc-request';
import { JsonRpcResponse } from '../json-rpc/interfaces/json-rpc-response';

import { isBoolean } from 'util';
import { PropertyForConnectionToService } from '../propoty-for-connection-to-service';

@Injectable()
export class WebSocketService extends AbstractSocketService {

    private _isCheckAuth = null;

    private _isPostAuth = true;

    constructor() {
        super();
        this.checkAuth();
    }

    public sendMessage(message: string) {
        // this.stompClient.send('/app/json-rpc-request/authentication', {}, JSON.stringify(message));
    }

    public authArrayJsonRpc(request: JsonRpcRequest[]) {
        this.rxStomp.publish({destination: '/app/json-rpc-request/user', body: JSON.stringify(request)});
        // this.stompClient.send('/app/json-rpc-request/user', {}, JSON.stringify(request));
    }
    public checkAuth() {
        this.rxStomp.publish({destination: '/app/json-rpc-request/check-authentication'});
    }

    public onMessageReceived(message: JsonRpcResponse) {

        if (message.result !== null && isBoolean(message.result)) {
            this._isCheckAuth = message.result;
        } else if (message.result === null) {
            this._isCheckAuth = false;
        }

        this.checkReceivedAuth();
        this._isPostAuth = false;
        console.log('Message recieved from server :: ' + message);
    }

    private checkReceivedAuth() {
        if (!this.isCheckAuth) {
            window.open(PropertyForConnectionToService.getSecurityPage(), '_self') ;
        }
    }
    get isCheckAuth() {
        return this._isCheckAuth;
    }
    get isPostAuth() {
        return this._isPostAuth;
    }
}

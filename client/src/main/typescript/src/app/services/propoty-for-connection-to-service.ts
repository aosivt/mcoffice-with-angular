import { Injectable } from '@angular/core';

/**
 * Singeltone свойства подключения к сервису
 */
@Injectable()
export class PropertyForConnectionToService {
    
    public static HOST_URI      = 'mbackoffice.nizinkin.local';
    public static HOST_URI_SECURITY_SERVICE      = 'mbackoffice.nizinkin.local';
    public static PORT_URI      = '8444';
    public static NAME_SERVICE  = '/';
    public static PROTOCOL_URI  = 'https';
    public static PROTOCOL_SOCKET_URI  = 'wss';
    public static NAME_SOCKET_SERVICE = 'ws';

    public static NAME_SOCKET_SECURITY_SERVICE = 'ws-security/websocket';
    public static PORT_URI_SECURITY_SERVICE = '8443';

    /**
     * Возращает строку подключения к сервису
     * @return  {@link string} возращаемый тип значения
     */
    public static getURI(): string {

        return  PropertyForConnectionToService.PROTOCOL_URI + '://' +
                PropertyForConnectionToService.HOST_URI     + ':'   +
                PropertyForConnectionToService.PORT_URI     +
                PropertyForConnectionToService.NAME_SERVICE ;
    }

    public static getSocketURI(): string {
        return  PropertyForConnectionToService.PROTOCOL_SOCKET_URI + '://' +
                PropertyForConnectionToService.HOST_URI     + ':'   +
                PropertyForConnectionToService.PORT_URI_SECURITY_SERVICE     +
                PropertyForConnectionToService.NAME_SERVICE +
                PropertyForConnectionToService.NAME_SOCKET_SECURITY_SERVICE ;
    }
    public static getSecurityPage(): string {
        return  PropertyForConnectionToService.PROTOCOL_URI + '://' +
                PropertyForConnectionToService.HOST_URI_SECURITY_SERVICE     + ':'   +
                PropertyForConnectionToService.PORT_URI_SECURITY_SERVICE     ;
    }
}

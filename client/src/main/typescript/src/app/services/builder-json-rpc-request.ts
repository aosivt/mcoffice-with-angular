import { JsonRpcRequest } from './interfaces/security/json-rpc-request';
import { Guid } from 'guid-typescript';

export class BuilderJsonRpcRequest {
    private _jsonRpcRequest: JsonRpcRequest;
    private _id: Guid;
    private _method: string;
    private _params: {};
    private _jsonrpc: string = '2.0';

    private constructor() {}

    static builder() {
        return new BuilderJsonRpcRequest() ;
    }

    public setMethod(method: string): BuilderJsonRpcRequest {
        this._method = method;
        return this;
    }

    public setParam(params: {}): BuilderJsonRpcRequest {
        this._params = params;
        return this;
    }

    public setJsonRpcVersion(version: string): BuilderJsonRpcRequest {
        this._jsonrpc = version;
        return this;
    }

    public build(): JsonRpcRequest {
        this._id = Guid.create();
        this._jsonRpcRequest = { id: this._id.toString(),
                                 params: this._params,
                                 method: this._method,
                                 jsonrpc: this._jsonrpc
                               };

        return this._jsonRpcRequest;
    }
}

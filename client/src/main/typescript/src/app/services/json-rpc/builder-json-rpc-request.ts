import { Guid } from 'guid-typescript';

import { JsonRpcRequest } from './interfaces/json-rpc-request';

import { ConvertHelper } from 'src/app/utils/conver-helper';

export class BuilderJsonRpcRequest {
    private _jsonRpcRequest: JsonRpcRequest;
    private _id: Guid;
    private _method: string;
    private _params: Map<string, {}> = new Map();
    private _objectParams: {};
    private _jsonrpc: string = '2.0';

    private constructor() {}

    static builder() {
        return new BuilderJsonRpcRequest() ;
    }

    public build(): JsonRpcRequest {
        this._id = Guid.create();
        this._jsonRpcRequest = this.getJsonRpcRequest();
        return this._jsonRpcRequest;
    }

    public setMethod(method: string): BuilderJsonRpcRequest {
        this._method = method;
        return this;
    }

    public setParam(params: Map<string, {}>): BuilderJsonRpcRequest {
        this._params = params;
        return this;
    }
    public addParam(nameMethodParam: string, data: {}): BuilderJsonRpcRequest {
        this._params.set(nameMethodParam, data);
        return this;
    }
    public addObjectParam(data: {}): BuilderJsonRpcRequest {
        this._objectParams = data;
        return this;
    }
    public setJsonRpcVersion(version: string): BuilderJsonRpcRequest {
        this._jsonrpc = version;
        return this;
    }

    private getJsonRpcRequest(): JsonRpcRequest {
        return this._objectParams === null ?
                this.createJsonRpcRequstByObjectParam() :
                this.createJsonRpcRequst();
    }

    private createJsonRpcRequst(): JsonRpcRequest {
        return {    id: this._id.toString(),
                    params: this.toJsonParams(),
                    method: this._method,
                    jsonrpc: this._jsonrpc
                };
    }
    private createJsonRpcRequstByObjectParam(): JsonRpcRequest {
        return {    id: this._id.toString(),
                    params: this._objectParams,
                    method: this._method,
                    jsonrpc: this._jsonrpc
                };
    }

    private toJsonParams() {
        return ConvertHelper.mapToObject(this._params);
    }
}


import { JSON_RPC_ERROR_TYPE } from '../enum/json-rpc-error-type';

export interface JsonRpcResponceErrorType {
    code: JSON_RPC_ERROR_TYPE;
    message: string;
    data: {};
}

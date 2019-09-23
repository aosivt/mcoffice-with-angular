import { ReadOnlyMap } from 'src/app/utils/interfaces/read-only-map';
import { JSON_RPC_ERROR_TYPE } from './enum/json-rpc-error-type';
import { JsonRpcResponceErrorType } from './interfaces/json-rpc-response-error-type';

export class JsonRpcErrorType {

    static types: ReadOnlyMap<JSON_RPC_ERROR_TYPE, JsonRpcResponceErrorType> = new Map([
        [ JSON_RPC_ERROR_TYPE.OK,
            { code: JSON_RPC_ERROR_TYPE.OK, data: null, message: 'ok'}],
        [ JSON_RPC_ERROR_TYPE.PARSE_ERROR,
            {code: JSON_RPC_ERROR_TYPE.PARSE_ERROR, data: null, message: 'JSON parse error'}],
        [ JSON_RPC_ERROR_TYPE.INVALID_REQUEST,
            {code: JSON_RPC_ERROR_TYPE.INVALID_REQUEST, data: null, message: 'invalid request'}],
        [ JSON_RPC_ERROR_TYPE.METHOD_NOT_FOUND,
            { code: JSON_RPC_ERROR_TYPE.METHOD_NOT_FOUND, data: null, message: 'method not found'}],
        [ JSON_RPC_ERROR_TYPE.METHOD_PARAMS_INVALID,
            { code: JSON_RPC_ERROR_TYPE.METHOD_PARAMS_INVALID, data: null, message: 'method parameters invalid'}],
        [ JSON_RPC_ERROR_TYPE.INTERNAL_ERROR,
            { code: JSON_RPC_ERROR_TYPE.INTERNAL_ERROR, data: null, message: 'internal error'}],
        [ JSON_RPC_ERROR_TYPE.ERROR_NOT_HANDLED,
            { code: JSON_RPC_ERROR_TYPE.ERROR_NOT_HANDLED, data: null, message: 'error not handled'}],
        [ JSON_RPC_ERROR_TYPE.BULK_ERROR,
            { code: JSON_RPC_ERROR_TYPE.BULK_ERROR, data: null, message: 'bulk error'}],
        [ JSON_RPC_ERROR_TYPE.CUSTOM_SERVER_ERROR_UPPER,
            { code: JSON_RPC_ERROR_TYPE.CUSTOM_SERVER_ERROR_UPPER, data: null, message: 'custom server error upper'}],
        [ JSON_RPC_ERROR_TYPE.CUSTOM_SERVER_ERROR_LOWER,
            { code: JSON_RPC_ERROR_TYPE.CUSTOM_SERVER_ERROR_LOWER, data: null, message: 'custom server error lower'}]
    ]);

    public static getErrorTypes(): ReadOnlyMap<JSON_RPC_ERROR_TYPE, JsonRpcResponceErrorType> {
        return this.types;
    }
    public static getErrorType(type: JSON_RPC_ERROR_TYPE): JsonRpcResponceErrorType {
        return this.types.get(type);
    }
    public static getErrorTypeByCode(code: number): JsonRpcResponceErrorType {
        return this.types.get(JSON_RPC_ERROR_TYPE[JSON_RPC_ERROR_TYPE[code]]);
    }
}

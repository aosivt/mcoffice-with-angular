export enum JSON_RPC_ERROR_TYPE {
    OK = 0,
    PARSE_ERROR = -32700,
    INVALID_REQUEST = -32600,
    METHOD_NOT_FOUND = -32601,
    METHOD_PARAMS_INVALID = -32602,
    INTERNAL_ERROR = -32603,
    ERROR_NOT_HANDLED = -32001,
    BULK_ERROR = -32002,
    CUSTOM_SERVER_ERROR_UPPER = -32000,
    CUSTOM_SERVER_ERROR_LOWER = -32099
}

export interface JsonError {
    code: JSON_RPC_ERROR_TYPE;
    message: string;
    data: {};
}

const OK: JsonError = {
    code: JSON_RPC_ERROR_TYPE.OK, data: null, message: 'ok'};
const PARSE_ERROR: JsonError = {
    code: JSON_RPC_ERROR_TYPE.PARSE_ERROR, data: null, message: 'JSON parse error'};
const INVALID_REQUEST: JsonError = {
    code: JSON_RPC_ERROR_TYPE.INVALID_REQUEST, data: null, message: 'invalid request'};
const METHOD_NOT_FOUND: JsonError = {
    code: JSON_RPC_ERROR_TYPE.METHOD_NOT_FOUND, data: null, message: 'method not found'};
const METHOD_PARAMS_INVALID: JsonError = {
    code: JSON_RPC_ERROR_TYPE.METHOD_PARAMS_INVALID, data: null, message: 'method parameters invalid'};
const INTERNAL_ERROR: JsonError = {
    code: JSON_RPC_ERROR_TYPE.INTERNAL_ERROR, data: null, message: 'internal error'};
const ERROR_NOT_HANDLED: JsonError = {
    code: JSON_RPC_ERROR_TYPE.ERROR_NOT_HANDLED, data: null, message: 'error not handled'};
const BULK_ERROR: JsonError = {
    code: JSON_RPC_ERROR_TYPE.BULK_ERROR, data: null, message: 'bulk error'};
const CUSTOM_SERVER_ERROR_UPPER: JsonError = {
    code: JSON_RPC_ERROR_TYPE.CUSTOM_SERVER_ERROR_UPPER, data: null, message: 'custom server error upper'};
const CUSTOM_SERVER_ERROR_LOWER: JsonError = {
    code: JSON_RPC_ERROR_TYPE.CUSTOM_SERVER_ERROR_LOWER, data: null, message: 'custom server error lower'};

export class JsonRpcError {}

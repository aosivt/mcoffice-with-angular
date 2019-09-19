export interface JsonRpcRequest {
    jsonrpc: string;
    method: string;
    params: {};
    id: string;
}

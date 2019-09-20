
export interface JsonRpcError {
    id: string;
    jsonrpc: string;
    error: {
        code: string;
        data: {};
        message: string;
    };
}

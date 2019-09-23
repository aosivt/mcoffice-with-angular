export interface JsonRpcError {
    id: string;
    jsonrpc: string;
    error: {
        code: number;
        data: {};
        message: string;
    };
}

package com.lukaszstyk.AddNumbers;

public class RandomOrgResponse {

    String jsonrpc;
    RequestResult result;

    public RandomOrgResponse(String jsonrpc, RequestResult result) {
        this.jsonrpc = jsonrpc;
        this.result = result;
    }

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public RequestResult getResult() {
        return result;
    }

    public void setResult(RequestResult result) {
        this.result = result;
    }
}

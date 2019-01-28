package com.gxchain.client.jsonrpc.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.gxchain.client.jsonrpc.JsonRpcResponseDeserializer;

/**
 * @Title: JsonRpcResponse
 * @Description: jsonRpc 响应
 * @Author: mingyi
 * @created 2018年4月11日 下午6:01:55
 */
@JsonDeserialize(using = JsonRpcResponseDeserializer.class)
public class JsonRpcResponse extends JsonRpcMessage {
	
    /**
     * 响应结果 
     */
	private String result;
	
	/**
	 * jsonRpc响应错误信息
	 */
	private JsonRpcError error;
	
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
    public JsonRpcError getError() {
        return error;
    }
    public void setError(JsonRpcError error) {
        this.error = error;
    }
	
}
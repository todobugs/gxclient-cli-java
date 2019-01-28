package com.gxchain.client.jsonrpc.domain;

import java.util.List;

/**
 * @Title: JsonRpcRequest
 * @Description: jsonRpc 请求
 * @Author: mingyi
 * @created 2018年4月11日 下午6:00:33 
 * @param <T>
 */
public class JsonRpcRequest<T> extends JsonRpcMessage {

    /**
     * 请求方法
     */
	private String method;
	/**
	 * 请求参数
	 */
	private List<T> params;
	
    public String getMethod() {
        return method;
    }
    public void setMethod(String method) {
        this.method = method;
    }
    public List<T> getParams() {
        return params;
    }
    public void setParams(List<T> params) {
        this.params = params;
    }
}
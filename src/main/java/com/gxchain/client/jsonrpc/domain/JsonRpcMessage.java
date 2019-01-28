package com.gxchain.client.jsonrpc.domain;

/**
 * @Title: JsonRpcMessage
 * @Description: jsonRpc消息抽象类
 * @Author: mingyi
 * @created 2018年4月11日 下午5:59:02
 */
public abstract class JsonRpcMessage {
	
    /**
     * jsonrpc 信息体
     */
	private String jsonrpc;
	
	/**
	 * 消息id
	 */
	private String id;
	
    public String getJsonrpc() {
        return jsonrpc;
    }
    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
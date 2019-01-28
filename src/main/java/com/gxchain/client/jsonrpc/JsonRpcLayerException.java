package com.gxchain.client.jsonrpc;

/**This is an abstract superclass for all exceptions thrown by the underlying communication
 * infrastructure (<i>i.e.</i> the HTTP layer + the JSON-RPC layer).*/

import com.gxchain.client.common.Errors;

/**
 * @Title: JsonRpcLayerException
 * @Description: 通信异常类定义
 * @Author: mingyi
 * @created 2018年4月10日 下午10:23:15
 */
public class JsonRpcLayerException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * 通信异常错误码
	 */
	private int code;
	
	
	public JsonRpcLayerException(Errors error) {
		this(error, "");
	}

	public JsonRpcLayerException(Errors error, String additionalMsg) {
		super(error.getDescription() + additionalMsg);
		code = error.getCode();
	}
	
	public JsonRpcLayerException(Errors error, Exception cause) {
		super(error.getDescription(), cause);
		code = error.getCode();
	}

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
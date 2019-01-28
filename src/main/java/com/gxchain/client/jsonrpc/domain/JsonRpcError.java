package com.gxchain.client.jsonrpc.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @Title: JsonRpcError
 * @Description: jsonRcp 错误定义
 * @Author: mingyi
 * @created 2018年4月11日 下午5:58:10
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class JsonRpcError {
	
    /**
     * 错误码
     */
	private Integer code;
	/**
	 * 错误信息
	 */
	private String message;
	
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
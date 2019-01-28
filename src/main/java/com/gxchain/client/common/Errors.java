package com.gxchain.client.common;

/**An enumeration specifying the error codes &amp; messages used by btcd-cli4j.*/
/**
 * @Title: Errors
 * @Description: 错误码枚举定义
 * @Author: mingyi
 * @created 2018年4月10日 下午10:10:11
 */
public enum Errors {

	IO_UNKNOWN(1001001, "The operation failed due to an unknown IO exception."),
	PARSE_JSON_UNKNOWN(1001002, "An unknown exception occurred while parsing/generating JSON content."),
	PARSE_JSON_MALFORMED(1001003, "Unable to parse the specified JSON content (malformed syntax detected)."),
	MAP_JSON_UNKNOWN(1001004, "An unknown exception ocurred while mapping the JSON content.");

    /**
     * 错误码 code
     */
	private final int code;
	
	/**
	 * 错误码信息描述
	 */
	private final String message;

	/**
	 * @Description: 私有构造方法
	 * @param code
	 * @param message
	 */
	Errors(int code,String message) {
	    this.code = code;
	    this.message = message;
	}

	/**
	  * @Description: 格式化展示错误信息
	  * @return
	  * @throws 
	  * @author mingyi    
	  * @created 2018年4月10日 下午10:12:40
	 */
	public String getDescription() {
		return String.format("Error #%s: %s", code, message);
	}

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
package com.gxchain.client.common;

import java.math.BigDecimal;
import java.util.Random;

/**A set of universally accepted, component-agnostic constants.*/

/**
 * @Title: Constants
 * @Description: 一组常见常量定义
 * @Author: mingyi
 * @created 2018年4月10日 下午10:04:18
 */
public final class Constants {


	public static final String JSON_RPC_VERSION = "2.0";

	public static final String URL = "http://ip:port/";

	public static final BigDecimal divide_value = new BigDecimal(100000);

/*
	https://node1.gxb.io/rpc
	https://node4.gxb.io/rpc
	https://node5.gxb.io/rpc
	https://node8.gxb.io/rpc
	https://node11.gxb.io/rpc
	https://node15.gxb.io/rpc
	https://node16.gxb.io/rpc
	https://node17.gxb.io/rpc
	https://node18.gxb.io/rpc*/

	public static String[] nodeList = new String[]{"https://node1.gxb.io/rpc","https://node5.gxb.io/rpc","https://node8.gxb.io/rpc","https://node11.gxb.io/rpc","https://node15.gxb.io/rpc","https://node16.gxb.io/rpc","https://node17.gxb.io/rpc"};

	/**
	 * 公信宝公共访问节点
	 */
	public static String getGxcRpcNode(){
		Random random = new Random();
		return nodeList[random.nextInt(nodeList.length)];
	}
}
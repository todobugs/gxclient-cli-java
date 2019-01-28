# gxclient-java
gxclient 客户端多语言之Java

1、本项目提供gxchain command line 的Java版本接口调用，主要为方便开发者使用，使开发者更专注与业务开发。

2、使用时，用户需启动cli_wallet,并将启动的地址配置到程序中com.gxchain.client.common.Constants#URL

3、项目主要结构说明：

    3.1、api: cli接口定义
    3.2、control：测试验证请求（所有请求都是单独验证，针对需要解锁钱包的操作，请先执行解锁操作）
    3.3、domain：解析对象
    3.4、enums：枚举
  

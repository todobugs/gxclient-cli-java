package com.gxchain.client.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: 配置类
 * @Author: mingyi
 * @Date: 2019-01-15 23:15
 * @package: com.gxchain.client.common
 * @name: GxcConfig
 */
@Configuration
public class GxcConfig {

    /**
      * @Description: 实例化restTemplate
      * @Method:
      * @Param:
      * @return:
      * @throws:
      * @Author: mingyi
      * @Date:   2019-01-15 23:15
      */
    @Bean
    public RestTemplate restTemplate(){
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(3000);
        requestFactory.setReadTimeout(3000);

        RestTemplate restTemplate = new RestTemplate(requestFactory);
        return restTemplate;
    }
    
}

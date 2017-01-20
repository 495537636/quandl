package com.loving.quandl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * MultipartConfiguration.java
 * Description: 上传文件配置
 * Author: lmg
 * Date: 2017年1月20日 下午2:00:30
 */
@Configuration
public class MultipartConfiguration {

	@Bean(name = "multipartResolver")
    public CommonsMultipartResolver multipartConfigElement() {
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		//设置上传大小10M，默认单位是Byte字节 1024 * 1024 * 10
		resolver.setMaxUploadSize(1024 * 1024 * 10);
		resolver.setDefaultEncoding("UTF-8");
        return resolver;
    }
	
}

package com.study.cloud.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DataSourceProperties.class)
public class MybatisDataSource {
	@Autowired
	private DataSourceProperties dataSourceProperties;
	//mybaits mapper xml搜索路径
	private final static String mapperLocations="classpath:cloud/simple/service/dao/*.xml";

    public void printDataSourceProperties() {
        System.out.println(dataSourceProperties);
    }
}

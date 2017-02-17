package com.loving.quandl.config;

import java.io.IOException;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@ComponentScan("com.loving.quandl")
public class QuandlConfig {
	
	/**
     * 配置数据源
     * @return
     */
    @Bean(name = "dataSource")
    public ComboPooledDataSource getDataSource() {
        try {
			ComboPooledDataSource dataSource = new ComboPooledDataSource();
            dataSource.setJdbcUrl("jdbc:mysql://123.57.79.107:5219/loving");
            dataSource.setDriverClass("com.mysql.jdbc.Driver");
            dataSource.setUser("admin");
            dataSource.setPassword("admin110");
            dataSource.setMaxPoolSize(100);
            return dataSource;
        } catch (Exception e) {
            return null;
        }
    }
    
    /**
     * 配置sqlSessionFactory
     */
    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean getSqlSessionFactory() {
    	SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
    	sessionFactoryBean.setDataSource(getDataSource());
    	PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
    	try {
    		//扫描指定路径下的mapper文件
    		Resource[] resources = resolver.getResources("classpath:com/loving/quandl/mapper/*.xml");
			sessionFactoryBean.setMapperLocations(resources);
		} catch (IOException e) {
			e.printStackTrace();
		}
    	return sessionFactoryBean;
    }
    
    /**
     * 配置DAO接口所在包名，Spring会自动查找其下的类
     */
    @Bean
    public MapperScannerConfigurer settingMapperScannerConfigurer() {
    	MapperScannerConfigurer mapperConfigurer = new MapperScannerConfigurer();
    	mapperConfigurer.setBasePackage("com.loving.quandl.dao");
    	mapperConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
    	return mapperConfigurer;
    }
    
    /**
     * 配置事务管理
     */
    @Bean(name = "transactionManager")
    public DataSourceTransactionManager getDataSourceTransactionManager() {
    	DataSourceTransactionManager manager = new DataSourceTransactionManager();
    	manager.setDataSource(getDataSource());
    	return manager;
    }
    
}

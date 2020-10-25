package com.pengxh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 第一步：先将整个文件用Configuration标志，标识该类是Spring的核心配置
 * <p>
 * 第二步：将component-scan注解，采用@ComponentScan方式注解，参数为最外层包名
 * 源配置如下：
 * <context:component-scan base-package="com.pengxh"/>
 * <p>
 * 第三步：编写方法，并将方法返回值采用@Bean注解，参数参考Bean id
 * <p>
 * 第四步：将property-placeholder注解，采用@PropertySource方式注解，参数为location的值
 * 源配置如下：
 * <context:property-placeholder location="classpath:jdbc.properties"/>
 * properties的基础属性采用@Value方式注解
 * <p>
 * 引申：可以将配置文件分为多个，然后采用Import方式导入到核心配置
 */
@Configuration
@ComponentScan("com.pengxh")
@Import({DataSourceConfiguration.class})
public class SpringConfiguration {

}

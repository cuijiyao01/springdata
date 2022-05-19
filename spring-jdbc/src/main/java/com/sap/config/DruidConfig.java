package com.sap.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author i531869
 * @Date 2020/6/3 16:02
 * @Version 1.0
 */
@Configuration
public class DruidConfig {

  @ConfigurationProperties(prefix = "spring.datasource")
  @Bean
  public DataSource druid() {
    return new DruidDataSource();
  }

  /**
   * 配置Druid的监控
   * 1.配置一个管理后台的Servlet
   * @return
   */
  @Bean
  public ServletRegistrationBean statViewServlet(){
    ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
    Map<String,String> initParams = new HashMap<>();
    initParams.put("loginUsername","admin");
    initParams.put("loginPassword","123456");
    //默认就是允许所有访问
    initParams.put("allow","");
    initParams.put("deny","192.168.15.21");
    servletRegistrationBean.setInitParameters(initParams);
    return servletRegistrationBean;
  }

  /**
   * 2.配置web监控的filter
   * @return
   */
  @Bean
  public FilterRegistrationBean filterRegistrationBean(){
    FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
    Map<String,String> initParams = new HashMap<>();
    initParams.put("exclusions","*.js,*.css,/druid/*");
    filterRegistrationBean.setInitParameters(initParams);
    filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
    return filterRegistrationBean;
  }
}

package com.sap.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * @Author i531869
 * @Date 2020/6/3 17:02
 * @Version 1.0
 */
@org.springframework.context.annotation.Configuration
public class MyBatisConfig {
  @Bean
  public ConfigurationCustomizer configurationCustomizer(){
    return new ConfigurationCustomizer() {
      @Override
      public void customize(Configuration configuration) {
        configuration.setMapUnderscoreToCamelCase(true);
      }
    };
  }
}

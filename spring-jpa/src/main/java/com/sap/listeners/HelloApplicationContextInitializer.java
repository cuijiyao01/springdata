package com.sap.listeners;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author i531869
 * @Date 2020/6/5 11:09
 * @Version 1.0
 */
public class HelloApplicationContextInitializer implements
    ApplicationContextInitializer<ConfigurableApplicationContext> {
  @Override
  public void initialize(ConfigurableApplicationContext applicationContext) {
    System.out.println("ApplicationContextInitializer...initialize..."+applicationContext);
  }
}

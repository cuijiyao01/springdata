package com.sap.listeners;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @Author i531869
 * @Date 2020/6/5 11:10
 * @Version 1.0
 */
public class HelloSpringApplicationRunListener implements SpringApplicationRunListener {
  //必须有的构造器
  public HelloSpringApplicationRunListener(SpringApplication application, String[] args){
  }
  @Override
  public void starting() {
    System.out.println("SpringApplicationRunListener...starting...");
  }
  @Override
  public void environmentPrepared(ConfigurableEnvironment environment) {
    Object o = environment.getSystemProperties().get("os.name");
    System.out.println("SpringApplicationRunListener...environmentPrepared.."+o);
  }
  @Override
  public void contextPrepared(ConfigurableApplicationContext context) {
    System.out.println("SpringApplicationRunListener...contextPrepared...");
  }
  @Override
  public void contextLoaded(ConfigurableApplicationContext context) {
    System.out.println("SpringApplicationRunListener...contextLoaded...");
  }
  @Override
  public void failed(ConfigurableApplicationContext context, Throwable exception) {
    System.out.println("SpringApplicationRunListener...failed...");
  }
}

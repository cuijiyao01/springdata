package com.sap.listeners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @Author i531869
 * @Date 2020/6/5 11:11
 * @Version 1.0
 */
@Component
public class HelloApplicationRunner implements ApplicationRunner {
  @Override
  public void run(ApplicationArguments args) throws Exception {
    System.out.println("ApplicationRunner...run....");
  }
}

package com.sap.listeners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author i531869
 * @Date 2020/6/5 11:12
 * @Version 1.0
 */
@Component
public class HelloCommandLineRunner implements CommandLineRunner {
  @Override
  public void run(String... args) throws Exception {
    System.out.println("CommandLineRunner...run..."+ Arrays.asList(args));
  }
}

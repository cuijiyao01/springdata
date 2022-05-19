package com.sap.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author i531869
 * @Date 6/11/21 2:28 PM
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Plate<T> {
  private T item;

  public static void main(String[] args) {
    Plate<? extends Fruit> plate = new Plate<Apple>(new Apple());
    Plate<? super Fruit> plate1 = new Plate<Food>();
    plate1.setItem(new Fruit());
    plate1.setItem(new Apple());
    List<String> strings = Arrays.asList("apple","cherry","peach");
    // strings.stream().peek()
    // Stream.of(1,2,3,1,2,5,6,7,8,0,0,1,2,3,1).distinct().filter(e -> e >5).forEach(e -> System.out.println(e));
    // try {
    //   int i = 1 / 0;
    // } catch (Exception e) {
    //   throw e;
    // }
    System.out.println("能继续运行下去");
  }
}

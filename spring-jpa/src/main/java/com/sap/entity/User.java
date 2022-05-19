package com.sap.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author i531869
 * @Date 2020/6/4 16:31
 * @Version 1.0
 */
@Getter
@Setter
@ToString(callSuper = true)
@Entity //告诉jpa这是一个实体类,和数据表映射的类
@Table(name = "user") //映射的表名
public class User {
  @Id //主键标识
  @GeneratedValue(strategy = GenerationType.IDENTITY) //自动生成主键
  private Integer id;

  @Column(name = "last_name")
  private String name;

  @Column
  private String email;
}

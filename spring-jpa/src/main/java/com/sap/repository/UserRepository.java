package com.sap.repository;

import com.sap.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author i531869
 * @Date 2020/6/4 16:38
 * @Version 1.0
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}

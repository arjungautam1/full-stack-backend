package com.codewitharjun.fullstack.repository;
/* Created by Arjun Gautam */

import com.codewitharjun.fullstack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

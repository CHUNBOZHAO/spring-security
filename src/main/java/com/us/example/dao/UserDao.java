package com.us.example.dao;

import com.us.example.domain.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    SysUser findByUserName(String username);
}

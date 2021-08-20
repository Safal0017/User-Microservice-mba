package com.upgrad.user.usermicroservice.dao;

import com.upgrad.user.usermicroservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {

}

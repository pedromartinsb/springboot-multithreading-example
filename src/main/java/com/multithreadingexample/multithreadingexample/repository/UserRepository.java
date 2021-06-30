package com.multithreadingexample.multithreadingexample.repository;

import com.multithreadingexample.multithreadingexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}

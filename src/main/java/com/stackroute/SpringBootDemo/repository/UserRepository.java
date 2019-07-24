package com.stackroute.SpringBootDemo.repository;

import com.stackroute.SpringBootDemo.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface UserRepository extends JpaRepository <User ,Integer> {
}

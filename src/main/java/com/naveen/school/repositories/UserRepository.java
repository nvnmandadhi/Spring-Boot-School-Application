package com.naveen.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.school.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

package com.boot.jpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.boot.jpa.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}

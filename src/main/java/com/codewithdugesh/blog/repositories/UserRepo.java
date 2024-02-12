package com.codewithdugesh.blog.repositories;

import com.codewithdugesh.blog.enitities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

}

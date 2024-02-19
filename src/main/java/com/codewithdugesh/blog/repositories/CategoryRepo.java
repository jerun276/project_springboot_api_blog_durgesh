package com.codewithdugesh.blog.repositories;

import com.codewithdugesh.blog.enitities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}

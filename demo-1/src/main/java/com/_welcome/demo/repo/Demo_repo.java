package com._welcome.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com._welcome.demo.entity.Demo_Entity;


@Repository
public interface Demo_repo extends JpaRepository<Demo_Entity, Integer> {

}

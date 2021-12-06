package com.usbank.cloudEnable.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usbank.cloudEnable.model.Application;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {

}

package com.dbs.equity.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.equity.portfolio.entity.UserEntity;

public interface SummaryRepository extends JpaRepository<UserEntity, String> {

}

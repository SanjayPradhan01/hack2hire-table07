package com.dbs.equity.portfolio.repository;

import com.dbs.equity.portfolio.entity.PortfolioTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioTransactionRepository extends JpaRepository<PortfolioTransactionEntity, String> {
}

package com.dbs.equity.portfolio.dao;

import com.dbs.equity.portfolio.entity.PortfolioTransactionEntity;

import java.util.List;

public interface PortfolioTransactionDao {
    public List<PortfolioTransactionEntity> findAll();
}

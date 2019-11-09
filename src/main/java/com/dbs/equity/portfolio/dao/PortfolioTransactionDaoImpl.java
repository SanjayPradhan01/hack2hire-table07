package com.dbs.equity.portfolio.dao;

import com.dbs.equity.portfolio.entity.PortfolioTransactionEntity;
import com.dbs.equity.portfolio.repository.PortfolioTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PortfolioTransactionDaoImpl implements PortfolioTransactionDao  {

    @Autowired
    public PortfolioTransactionRepository portfolioTransactionRepository;

    public List<PortfolioTransactionEntity> findAll(){
        return portfolioTransactionRepository.findAll();
    }
}

package com.dbs.equity.portfolio.service;

import com.dbs.equity.portfolio.dao.PortfolioTransactionDao;
import com.dbs.equity.portfolio.entity.PortfolioTransactionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioTransactionService {
    @Autowired
    public PortfolioTransactionDao portfolioTransactionDao;

    public List<PortfolioTransactionEntity> retriveTrasactions(){
        return portfolioTransactionDao.findAll();
    }
}

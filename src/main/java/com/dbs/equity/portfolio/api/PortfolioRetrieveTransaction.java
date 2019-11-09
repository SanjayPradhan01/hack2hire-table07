package com.dbs.equity.portfolio.api;

import com.dbs.equity.portfolio.entity.PortfolioTransactionEntity;
import com.dbs.equity.portfolio.service.PortfolioTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/retrieve")
public class PortfolioRetrieveTransaction {
    @Autowired
    public PortfolioTransactionService portfolioTransactionService;

    @GetMapping("/")
    public List<PortfolioTransactionEntity> retrieveTransaction(){
        // checking
      return portfolioTransactionService.retriveTrasactions();
    }

}

package com.dbs.equity.portfolio.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dbs.equity.portfolio.service.PortfolioTransactionService;

public class Export {
	
@Autowired
public PortfolioTransactionService portfolioTransactionService;

/**
 * Handle request to download an Excel document
 */
@RequestMapping(value = "/download", method = RequestMethod.GET)
public String download(Model model) {
    model.addAllAttributes(portfolioTransactionService.retriveTrasactions());
    return "";
}

}

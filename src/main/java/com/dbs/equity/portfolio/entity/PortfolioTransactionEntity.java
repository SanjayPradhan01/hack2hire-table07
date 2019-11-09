package com.dbs.equity.portfolio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.util.Currency;

@Entity
@Table(name = "DBSPortfolioTransaction")
public class PortfolioTransactionEntity {
    @Id
    @Column(name = "exchangeName")
    private String exchangeName;
    @Column(name = "externalsourceId")
    private String externalSourceId;
    @Column(name = "ISIN")
    private String isin;
    @Column(name = "stockname")
    private String stockName;
    @Column(name = "Quantity")
    private Integer quantity;
    @Column(name = "Operation")
    private String operation;
    @Column(name = "price")
    private double price;
    @Column
    private Integer isIntraDay;
    @Column
    private String sourceSystem;
    @Column
    private java.sql.Date creationDate;
    @Column
    private Currency currency;

    public String getExchangeName() {
        return exchangeName;
    }

    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    public String getExternalSourceId() {
        return externalSourceId;
    }

    public void setExternalSourceId(String externalSourceId) {
        this.externalSourceId = externalSourceId;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getIsIntraDay() {
        return isIntraDay;
    }

    public void setIsIntraDay(Integer isIntraDay) {
        this.isIntraDay = isIntraDay;
    }

    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}

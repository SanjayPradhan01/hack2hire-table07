package com.dbs.equity.portfolio.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DBS_PORTFOLIO_SUMMARY")
public class PortfolioSummaryEntity {
	
	   @Id
	   private Integer id;
	   private String exchangename; 		
	   private String isin;        		
	   private String stockname;    		
	   private Double averagecmp;  		
	   private Double realizedprofitloss;  
	   private Double unrealizedprofitloss;
	   private Double currentcmp;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the exchangename
	 */
	public String getExchangename() {
		return exchangename;
	}
	/**
	 * @param exchangename the exchangename to set
	 */
	public void setExchangename(String exchangename) {
		this.exchangename = exchangename;
	}
	/**
	 * @return the isin
	 */
	public String getIsin() {
		return isin;
	}
	/**
	 * @param isin the isin to set
	 */
	public void setIsin(String isin) {
		this.isin = isin;
	}
	/**
	 * @return the stockname
	 */
	public String getStockname() {
		return stockname;
	}
	/**
	 * @param stockname the stockname to set
	 */
	public void setStockname(String stockname) {
		this.stockname = stockname;
	}
	/**
	 * @return the averagecmp
	 */
	public Double getAveragecmp() {
		return averagecmp;
	}
	/**
	 * @param averagecmp the averagecmp to set
	 */
	public void setAveragecmp(Double averagecmp) {
		this.averagecmp = averagecmp;
	}
	/**
	 * @return the realizedprofitloss
	 */
	public Double getRealizedprofitloss() {
		return realizedprofitloss;
	}
	/**
	 * @param realizedprofitloss the realizedprofitloss to set
	 */
	public void setRealizedprofitloss(Double realizedprofitloss) {
		this.realizedprofitloss = realizedprofitloss;
	}
	/**
	 * @return the unrealizedprofitloss
	 */
	public Double getUnrealizedprofitloss() {
		return unrealizedprofitloss;
	}
	/**
	 * @param unrealizedprofitloss the unrealizedprofitloss to set
	 */
	public void setUnrealizedprofitloss(Double unrealizedprofitloss) {
		this.unrealizedprofitloss = unrealizedprofitloss;
	}
	/**
	 * @return the currentcmp
	 */
	public Double getCurrentcmp() {
		return currentcmp;
	}
	/**
	 * @param currentcmp the currentcmp to set
	 */
	public void setCurrentcmp(Double currentcmp) {
		this.currentcmp = currentcmp;
	}
	   
}

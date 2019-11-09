package com.dbs.equity.portfolio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dbs.equity.portfolio.model.SummaryModel;

@Service
public class SummaryService {
	
	public List<SummaryModel> getSummaryList(){
		List<SummaryModel>  list = new ArrayList<SummaryModel>();
		SummaryModel model = new SummaryModel();
		model.setAveragecmp("11.00");
		model.setCurrentcmp("100.50");
		model.setExchangename("BSE");
		model.setIsin("ISISINFY");
		model.setRealizedprofitloss("45.25");
		model.setStockname("Infosys");
		model.setUnrealizedprofitloss("15.52");
		list.add(model);
		return list;
		
	}
	
	

}

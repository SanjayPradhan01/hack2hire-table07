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
		
		SummaryModel model1 = new SummaryModel();
		model1.setAveragecmp("1100");
		model1.setCurrentcmp("1442");
		model1.setExchangename("BSE");
		model1.setIsin("INRELIND");
		model1.setRealizedprofitloss("7603666");
		model1.setStockname("Reliance");
		model1.setUnrealizedprofitloss("1803366");
		list.add(model1);
		
		SummaryModel model2 = new SummaryModel();
		model2.setAveragecmp("69");
		model2.setCurrentcmp("68.2");
		model2.setExchangename("BSE");
		model2.setIsin("INYESBAN");
		model2.setRealizedprofitloss("206100");
		model2.setStockname("YesBank");
		model2.setUnrealizedprofitloss("900");
		list.add(model2);
		
		
		SummaryModel model3 = new SummaryModel();
		model3.setAveragecmp("199");
		model3.setCurrentcmp("220.2");
		model3.setExchangename("BSE");
		model3.setIsin("ININFTEL");
		model3.setRealizedprofitloss("44040");
		model3.setStockname("InfraTel");
		model3.setUnrealizedprofitloss("4240");
		list.add(model3);		
		
		
		SummaryModel model4 = new SummaryModel();
		model4.setAveragecmp("567");
		model4.setCurrentcmp("609.05");
		model4.setExchangename("BSE");
		model4.setIsin("INUPLLTD");
		model4.setRealizedprofitloss("397709.65");
		model4.setStockname("UPL");
		model4.setUnrealizedprofitloss("27458.65");
		list.add(model4);
		
		SummaryModel model5 = new SummaryModel();
		model5.setAveragecmp("4450");
		model5.setCurrentcmp("4193.15");
		model5.setExchangename("BSE");
		model5.setIsin("INBAJFIN");
		model5.setRealizedprofitloss("36530722.8");
		model5.setStockname("BajajFinance");
		model5.setUnrealizedprofitloss("-2237677.2");
		list.add(model5);
		
		SummaryModel model6 = new SummaryModel();
		model6.setAveragecmp("4450");
		model6.setCurrentcmp("4193.15");
		model6.setExchangename("BSE");
		model6.setIsin("INBAJFIN");
		model6.setRealizedprofitloss("36530722.8");
		model6.setStockname("BajajFinance");
		model6.setUnrealizedprofitloss("-2237677.2");
		list.add(model6);
		
		SummaryModel model7 = new SummaryModel();
		model7.setAveragecmp("6700");
		model7.setCurrentcmp("8778");
		model7.setExchangename("BSE");
		model7.setIsin("INBAFINSIV");
		model7.setRealizedprofitloss("7162848");
		model7.setStockname("BajajFinServ");
		model7.setUnrealizedprofitloss("1695948");
		list.add(model6);		
		
		return list;
		
	}
	
	

}

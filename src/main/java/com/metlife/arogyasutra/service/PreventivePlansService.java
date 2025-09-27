package com.metlife.arogyasutra.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.metlife.arogyasutra.constant.ApplicationConstant;
import com.metlife.arogyasutra.repository.ArogyaSutraRepository;
import com.metlife.arogyasutra.util.DataSourceConfig;

@Component
public class PreventivePlansService {

	private ArogyaSutraRepository repo;
	private DataSource dataSource;

	@Autowired
	public String preventivePlansService(DataSource dataSource) {
		this.dataSource = dataSource;
		return "hello";
	}

	public String preventivePlanSuggestion(String id)
	{
		String result = "";
		boolean diabetic = false;
		boolean heartProb = false;
		JdbcTemplate temp = new JdbcTemplate(this.dataSource);
		Map<String, Object> riskMap = new HashMap<>();
		riskMap = temp.queryForMap(ApplicationConstant.QUERYFORRISKSCORES+id);
		
		float diabetsRiskScore = (float) riskMap.get("riskScoreDiabetes1yr");
		float heatRiskScore = (float) riskMap.get("riskScoreDiabetes1yr");
		if((diabetsRiskScore - 0) < (diabetsRiskScore - 1)){
			
		}
		else {
			diabetic = true;
		}
		if((heatRiskScore - 0) < (heatRiskScore - 1)){
			
		}
		else {
			heartProb = true;
		}
		
		
		if(diabetic)
		{
			result = "diabetic";
		}
		else if(heartProb)
		{
			result = "heartprob";
		}
		else if(diabetic&&heartProb)
		{
			result = "diabetic and heartprob";
		}
		else {
			result = "normal";
		}
		
		
		
		return result;
	}

}

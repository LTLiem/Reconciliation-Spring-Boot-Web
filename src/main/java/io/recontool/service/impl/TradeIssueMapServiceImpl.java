package io.recontool.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.recontool.repository.TradeIssueMapRepository;
import io.recontool.service.TradeIssueMapService;
import io.recontool.model.TradeIssueMap;


@Service("TradeIssueMapService")
public class TradeIssueMapServiceImpl implements TradeIssueMapService {

	@Autowired
	private TradeIssueMapRepository tradeIssueMapRepository;
	
	public void createTradeIssueMap(TradeIssueMap tradeIssue) {
		tradeIssueMapRepository.save(tradeIssue);
	}

	public void deleteTradeIssueMap(TradeIssueMap tradeIssue) {
		tradeIssueMapRepository.delete(tradeIssue);
	}

	public void updateTradeIssueMap(TradeIssueMap tradeIssue) {
		tradeIssueMapRepository.save(tradeIssue);
	}
	

}

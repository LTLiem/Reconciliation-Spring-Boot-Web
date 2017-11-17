package io.recontool.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.recontool.repository.TradeRepository;
import io.recontool.service.TradeService;
import io.recontool.model.Trade;

@Service("TradeService")
public class TradeServiceImpl implements TradeService {
	
	@Autowired
	private TradeRepository tradeRepository;

	public void createTrade(Trade trade) {
		tradeRepository.save(trade);
	}

	public void deleteTrade(Trade trade) {
		tradeRepository.delete(trade);		
	}
	
	public void updateTrade(Trade trade) {
		tradeRepository.save(trade);
	}
	
	public List<Trade> getAllTrade() {
		List<Trade> tradeList = new ArrayList<Trade>();
		tradeRepository.findAll().forEach(tradeList::add);
		return tradeList;
	}

	public Trade getTradeByNb(int nb) {
		return tradeRepository.findOne(nb);
	}

	public List<Trade> getTradeByUserId(int userId) {
		return tradeRepository.findByUserId(userId);		
	}

}

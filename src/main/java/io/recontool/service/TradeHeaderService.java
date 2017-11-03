package io.recontool.service;

import java.util.List;

import io.recontool.model.TradeHeader;
import io.recontool.model.TradeHeaderKey;


public interface TradeHeaderService {
	
	public void createTradeHeader(TradeHeader tradeHeader);
	
	public void deleteTradeHeader(TradeHeader tradeHeader);
	
	public void updateTradeHeader(TradeHeader tradeHeader);
	
	public List<TradeHeader> getAllTradeHeader(); 
	
	public TradeHeader getTradeHeaderByFGT(TradeHeaderKey key);
	
}

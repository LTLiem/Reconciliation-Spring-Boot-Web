package io.recontool.repository;

import org.springframework.data.repository.CrudRepository;

import io.recontool.model.TradeHeader;
import io.recontool.model.TradeHeaderKey;

public interface TradeHeaderRepository extends CrudRepository<TradeHeader, TradeHeaderKey>{
	
	public TradeHeader findByTradeHeaderKey(TradeHeaderKey key);
	
}

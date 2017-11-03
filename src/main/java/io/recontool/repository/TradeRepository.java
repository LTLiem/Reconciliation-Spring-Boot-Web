package io.recontool.repository;

import org.springframework.data.repository.CrudRepository;

import io.recontool.model.Trade;

public interface TradeRepository extends CrudRepository<Trade, Integer> {
	
}

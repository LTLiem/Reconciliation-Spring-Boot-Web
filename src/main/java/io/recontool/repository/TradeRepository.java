package io.recontool.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import io.recontool.model.Trade;


public interface TradeRepository extends CrudRepository<Trade, Integer> {
	
	public List<Trade> findByUserId(int userId);
	
}

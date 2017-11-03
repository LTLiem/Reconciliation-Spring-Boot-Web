package io.recontool.repository;

import org.springframework.data.repository.CrudRepository;

import io.recontool.model.TradeIssueMap;
import io.recontool.model.TradeIssueMapKey;

public interface TradeIssueMapRepository extends CrudRepository<TradeIssueMap, TradeIssueMapKey> {

}

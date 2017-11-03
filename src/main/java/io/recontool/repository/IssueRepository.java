package io.recontool.repository;

import org.springframework.data.repository.CrudRepository;

import io.recontool.model.Issue;;

/**
 * 
 * @author Liem Le
 * ref:https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
 */
public interface IssueRepository extends CrudRepository<Issue, Integer> {
	
}

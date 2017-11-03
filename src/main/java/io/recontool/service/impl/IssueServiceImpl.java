package io.recontool.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.recontool.model.Issue;
import io.recontool.repository.IssueRepository;
import io.recontool.service.IssueService;


@Service("IssueService")
public class IssueServiceImpl implements IssueService {
	
	@Autowired
	private IssueRepository issueRepository;

	public void createIssue(Issue issue) {
		issueRepository.save(issue);		
	}

	public void deleteIssue(Issue issue) {
		issueRepository.delete(issue);		
	}

	public void updateIssue(Issue issue) {
		issueRepository.save(issue);		
	}

	public List<Issue> getAllIssue() {
		List<Issue> issueList = new ArrayList<Issue>();
		issueRepository.findAll().forEach(issueList::add);
		return issueList;
	}

	public Issue getIssueById(int id) {
		return issueRepository.findOne(id);
	}

}

package io.recontool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.recontool.model.User;
import io.recontool.service.IssueService;
import io.recontool.service.RoleService;
import io.recontool.service.TradeService;
import io.recontool.service.UserService;

@SpringBootApplication
public class ReconciliationSpringBootApplication implements ApplicationRunner {
	
	@Autowired
	private TradeService tradeService;
	
	@Autowired
	private IssueService issueService;
	
	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(ReconciliationSpringBootApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments arg0) throws Exception {	
		
		User user = (User) userService.getUserByName("LLE");
		System.out.println(user.getName());
		
		System.out.println(tradeService.getTradeByUserId(user.getUserId()).size());	
		System.out.println(issueService.getIssueByUserId(user.getUserId()).size());	
	}
}

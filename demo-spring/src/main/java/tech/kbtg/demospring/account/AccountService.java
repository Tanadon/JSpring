package tech.kbtg.demospring.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	@Autowired
	private AccountRepository accRepo;
	
	public long doSth(int id) {
		return accRepo.count();
	}
}

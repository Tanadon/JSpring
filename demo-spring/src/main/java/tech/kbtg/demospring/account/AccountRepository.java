package tech.kbtg.demospring.account;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository 
		extends CrudRepository<Account, Integer>{
	public List<Account> findByAccountNameAndAge(String name,int age);

}

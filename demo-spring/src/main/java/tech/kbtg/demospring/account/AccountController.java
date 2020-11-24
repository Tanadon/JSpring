package tech.kbtg.demospring.account;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	@Autowired
	private AccountRepository accountRepo;
	
	@GetMapping("/v1/account/{id}")
	public AccountResponse getByID(@PathVariable int id)
	{
		Optional<Account> acc =accountRepo.findById(id);
		AccountResponse ret = new AccountResponse();
		if(acc.isPresent())
		{
			ret.setId(id);
			ret.setName(acc.get().getAccountName());
			ret.setAge(acc.get().getAge());
			return ret;
		}
		throw new RuntimeException("Account not found with id ="+id);
	}
	@PostMapping(value="/v1/account")
	public AccountResponse post(@PathVariable int id)
	{
		Optional<Account> acc =accountRepo.findById(id);
		AccountResponse ret = new AccountResponse();
		if(acc.isPresent())
		{
			ret.setId(id);
			ret.setName(acc.get().getAccountName());
			ret.setAge(acc.get().getAge());
			return ret;
		}
		throw new RuntimeException("Account not found with id ="+id);
	}
	
}


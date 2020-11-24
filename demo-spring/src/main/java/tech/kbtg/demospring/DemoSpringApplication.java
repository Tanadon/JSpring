package tech.kbtg.demospring;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Profile;

import tech.kbtg.demospring.account.*;

@SpringBootApplication
public class DemoSpringApplication {
	
	@Autowired	
	private AccountRepository accountRepo;
	
	@Profile({"testing"})
	@PostConstruct
	public void initialDataforTest(	) {
		Account a1 = new Account();
		a1.setAccountId(22);
		a1.setAccountName("Hello World");
		a1.setAge(1000);
		accountRepo.save(a1);
	}
	

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoSpringApplication.class, args);
		for(String name :ctx.getBeanDefinitionNames())
		{
			System.out.println(name);
		}
		System.out.println(ctx.getBeanDefinitionCount());
	}
	
	

}

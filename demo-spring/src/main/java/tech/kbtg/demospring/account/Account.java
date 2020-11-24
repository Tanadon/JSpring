package tech.kbtg.demospring.account;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	//@Column(name="id", nullable=false)
	private Integer accountId;
	//@Column(name="name")
	private String accountName;
	private Integer age;
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}

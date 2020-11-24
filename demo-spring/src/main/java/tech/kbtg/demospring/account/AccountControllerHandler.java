package tech.kbtg.demospring.account;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AccountControllerHandler {
	@ExceptionHandler({RuntimeException.class})
	public ResponseEntity<DemoException> accountNotFound(RuntimeException ex)
	{
		DemoException de = new DemoException();
		de.setCode(1111);
		de.setMessage(ex.getMessage());
		return new ResponseEntity<>(de,HttpStatus.OK);
	}

}
class DemoException{
	private int code;
	private String message;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
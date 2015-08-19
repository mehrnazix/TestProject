
public class MyException extends Exception {
	String message;
	
	public MyException(String string) {
		this.message = string;
	}
	
	@Override
	public String getMessage() {
		return this.message + "reyhane";
	}
}

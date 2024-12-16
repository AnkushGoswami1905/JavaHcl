package Dec_9th;

public class InvalidAgeException extends Throwable{
	String message;
	public InvalidAgeException(String messsage) {
		this.message=messsage;
	}
}

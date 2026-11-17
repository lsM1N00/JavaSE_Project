package mylab.student.exception;


public class InvalidGradeException extends Exception {
	private String message;

	public InvalidGradeException(String message) {
		super(message);
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	

}

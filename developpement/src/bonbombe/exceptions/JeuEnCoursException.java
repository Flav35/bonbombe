package bonbombe.exceptions;
import java.lang.Exception;

/**
 * Exception de login existant
 */
public class JeuEnCoursException extends Exception {
	public JeuEnCoursException(String _message){
		super(_message);
	}
}
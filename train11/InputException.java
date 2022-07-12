package train11;

public class InputException extends Exception
{
	String s;
	InputException(String s){
		this.s=s;
	}
 public String toString() {
	 return "Mark entered is "+s+" please enter input less than 100 and greater than 0";
 }
}

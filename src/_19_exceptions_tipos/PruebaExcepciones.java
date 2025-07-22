package _19_exceptions_tipos;

public class PruebaExcepciones{
	public static void main(String[] args) {
		try {
//			throw new CheckedException();
		}catch(CheckedException e) {
			
		}
	}
}

class CheckedException extends Exception{

class CheckedHija1Exception extends CheckedException{}

class CheckedHija2Exception extends CheckedException{}





class UncheckedException extends RuntimeException {}

class UncheckedHija1Exception extends UncheckedException {}

class UncheckedHija2Exception extends UncheckedException {}

package _19_exceptions_tipos;

public class PruebaJavi {
	
	static void m() throws CheckedHija1Exception, CheckedHija2Exception, 
	CheckedException {}

	public static void main(String[] args) throws CheckedException{
	
	m();
	
	
	try {
		throw new CheckedHija1Exception();
	} catch (CheckedHija2Exception | CheckedHija1Exception e) {
		System.out.println("Hija");
	} catch (CheckedException e) {
		System.out.println("Madre");
	} finally {
		System.out.println("finally");
	}

	
}
}

	class CheckedException extends Exception {}
	class CheckedHija1Exception extends CheckedException {}
	class CheckedHija2Exception extends CheckedException {}
	class UncheckedException extends RuntimeException {}
	class UncheckedHija1Exception extends UncheckedException {}
	class UncheckedHija2Exception extends UncheckedException {}
	
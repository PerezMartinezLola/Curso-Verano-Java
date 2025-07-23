package _19_exceptions_tipos;

public class PruebaMigle {
	public static void m() {
	}
	
//	AAAAAAAAAAAAAAA
//	public static void m() throws CheckedHija1Exception, CheckedHija2Exception, CheckedException {
//	}

	public static void main(String[] args) throws CheckedException {
		
//		AAAAAAAAAAAAAAA
//		try {
//			try {
//				m();
//			} catch (CheckedHija1Exception e) {
//				e.printStackTrace();
//			} catch (CheckedHija2Exception e) {
//				e.printStackTrace();
//			} catch (CheckedException e) {
//				e.printStackTrace();
//			}
//		} catch (UncheckedException e) {
//		}

//		PUEDO: 
//		throw new UncheckedException();

//		NO PUEDO:
//		hay que lanzar la excepción (throws) O ponerla en try-catch
		try {
			throw new CheckedException();
		} catch (CheckedException e) {

		}

		try {
			m();
		} catch (UncheckedException e) {
		}

		try {
			throw new UncheckedException();
		} catch (UncheckedHija1Exception e) {
			System.out.println("Hija 1");
		} catch (UncheckedHija2Exception e) {
			System.out.println("Hija 2");
		} catch (UncheckedException e) {
			System.out.println("madre");
		}

		try {
		} catch (UncheckedHija1Exception | UncheckedHija2Exception e) {
			System.out.println("Hija");
		} catch (UncheckedException e) {
			System.out.println("Madre");
		}
		
//		try {
//			throw new CheckedHija1Exception();
//		} catch (CheckedHija2Exception | CheckedHija1Exception e) {
//			System.out.println("Hija");
//		} catch (CheckedException e) {
//			System.out.println("Madre");
//		} finally {
//			System.out.println("finally");
//		}
		
//		try {
//		    throw new CheckedHija1Exception();
//		} catch (CheckedHija1Exception e) {
//		    System.out.println("Hija 1");
//		} catch (CheckedHija2Exception e) {
//		    System.out.println("Hija 2");
//		} catch (CheckedException e) {
//		    System.out.println("Madre");
//		}
		
		
		

	}


		class CheckedException extends Exception {
		}
		
		class CheckedHija1Exception extends CheckedException {
		}
		
		class CheckedHija2Exception extends CheckedException {
		}
		
		class UncheckedException extends RuntimeException {
		}
		
		class UncheckedHija1Exception extends UncheckedException {
		}
		
		class UncheckedHija2Exception extends UncheckedException {
		}
}

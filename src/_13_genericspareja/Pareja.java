package _13_genericspareja;

public class Pareja <T, K> {
	private T p1;
	private K p2;
	
	
	
	public Pareja(T p1, K p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	
	public T getP1() {
		return p1;
	}

	public void setP1(T p1) {
		this.p1 = p1;
	}


	public K getP2() {
		return p2;
	}

	public void setP2(K p2) {
		this.p2 = p2;
	}


	@Override
	public String toString() {
		return "Pareja [p1= " + p1 + ", p2= " + p2 + "]";
	}


	
	
}

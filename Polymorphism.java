
public class Polymorphism {

	void order(String product) {
		System.out.println("Product");
		
	}
	void order(int cost) {
		System.out.println("cost");
	}
	void order(String product,int cost) {
		System.out.println("Product"+product+"cost"+cost);
	}
	public static void main(String[] args) {
		
      Polymorphism pm = new Polymorphism();
      pm.order(20000);
      pm.order("Mobile");
	}

}

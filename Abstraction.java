
abstract class Abstraction {
abstract void  walk();
public abstract class tom extends Abstraction{
	
	void walk() {
		System.out.println("Tom is Walking");
	}
	
}
	public static void main(String[] args) {
		tom tm =new tom();
		tm.walk();

	}

}

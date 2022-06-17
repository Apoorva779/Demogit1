
public class Encapsulation {

	private int rollno;
	private String name;
	public void setRollno(int rollno) {
		this.rollno=rollno;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Encapsulation en =new Encapsulation();
		en.setRollno(122);
		en.setName("Jerry");
		System.out.println(en.getRollno());
		System.out.println("name:"+en.getName());

	}
}



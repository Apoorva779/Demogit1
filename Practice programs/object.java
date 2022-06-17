public class object
{
    int id=104;
    double sal=25000;
    String name="Apoo";
     void display(){
    System.out.println("hello java");
}
    public static void main(String[] args) {
        object obj=new object();
        System.out.println(obj.name);
        System.out.println(obj.id);
        System.out.println(obj.sal);
        System.out.println("-----------");
obj.display();

    }
}

public class Constructor
{
    int age;
    String name;
    Constructor(){
        System.out.println("constructor Without Parameter");
    }
    public static void main(String[] args)
    {

        Constructor cn=new Constructor();
        cn.age=20;
        cn.name="Jerry";
        System.out.println(cn.age);
        System.out.println(cn.name);
    }
}

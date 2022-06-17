public class Constructor2
{
    int age;
    String name;
    Constructor2(int age, String name)
    {
       this.age=age;
       this.name=name;
    }
    public static void main(String[] args)
    {
        Constructor2 cn=new Constructor2(20,"TOM");
        System.out.println(cn.age);
        System.out.println(cn.name);

    }
}

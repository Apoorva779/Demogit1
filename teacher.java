 class teacher
{

  int id=789;
    void teach(){
        System.out.println("teaching subjects");
    }
}
    class student extends teacher {
  String name = "apoo";

    void listen() {
        System.out.println("listining class");
    }

}
class tusion extends teacher{
    void tusion(){
        System.out.println("tutioned to students");
    }
}


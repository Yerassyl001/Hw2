import StudInfo.*;
public class Main {

    public static void main(String[] args) {
      Student stu = new Student("Yerassyl",new Clas("11B"),new Academic_performance("excellent student"));
        System.out.println("Name: " + stu.name);
        System.out.println("Class: " + stu.mainClas());
        System.out.println("Academic_performance: " + stu.mainAcademic_performance());
    }
}


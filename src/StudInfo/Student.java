package StudInfo;

public class Student {
       public  Student(String name1 , Clas class1, Academic_performance academic_performance1){
            name = name1; clas = class1; academic_performance = academic_performance1;}
    public String name ="";
    public Clas clas = new Clas();
    public Academic_performance academic_performance = new Academic_performance();
    public String mainClas(){return clas.name;}
    public String mainAcademic_performance(){return academic_performance.name;}
}

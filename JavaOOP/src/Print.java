import model.Student;

public class Print {
    public static void main(String[] args){
        Student stu = new Student("刘帆",22,'男',"0919160216");
        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        System.out.println(stu.getSex());
        System.out.println(stu.getIdCardNum());
    }
}

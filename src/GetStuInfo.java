import info.Student;

public class GetStuInfo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("James");
        student.setAge(18);
        student.setGender("Male");
        student.setID_no("00125689");

        System.out.println("Name:" + student.getName());
        System.out.println("Age:" + student.getAge());
        System.out.println("Gender:" + student.getGender());
        System.out.println("ID_no:" + student.getID_no());
    }
}

public class Main {
    static public void main(String[] args) {
        Student student = new Student("qwe", "student", 22);
        student.walk();
        student.run();
        student.voice();
        student.learn();
        System.out.println(student.toString());
        Teacher teacher = new Teacher("qwe", "teacher", 33);
        teacher.walk();
        teacher.run();
        teacher.voice();
        teacher.teach();
        System.out.println(teacher.toString());
    }
}

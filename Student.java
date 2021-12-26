public class Student extends People{
    Student() {
        super();
    }

    Student(String nameW, String lastnameW, int ageW) {
        super(nameW, lastnameW, ageW);
    }

    void learn() {
        System.out.println(name + " learn");
    }
}

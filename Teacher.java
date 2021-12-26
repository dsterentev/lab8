public class Teacher extends People{
    Teacher() {
        super();
    }

    Teacher(String nameW, String lastnameW, int ageW) {
        super(nameW, lastnameW, ageW);
    }

    void teach() {
        System.out.println(name + " teach");
    }
}

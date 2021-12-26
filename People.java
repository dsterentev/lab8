public class People {
    protected String name;
    protected String lastname;
    protected int age;
    People() {
        name = "zxc";
        lastname = "zxc";
        age = 999999;
    }
    People(String nameW, String lastnameW, int ageW) {
        name = nameW;
        lastname = lastnameW;
        age = ageW;
    }
    @Override
    public String toString() {
        return "People{" + "name =' " + name + '\'' + ", lastname =' " + lastname + '\'' + ", age = " + age + '}';
    }
    void walk() {
        System.out.println(name + " walk");
    }
    void voice() {
        System.out.println(name + " voice");
    }
    void run() {
        System.out.println(name + " run");
    }
}

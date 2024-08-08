public class Person {
    int age = 16;

    public void printAge() {
        System.out.println("Age: " + age);
    }

    public void makeOlder() {
        age++;
    }

    public void makeYounger() {
        age--;
    }
}

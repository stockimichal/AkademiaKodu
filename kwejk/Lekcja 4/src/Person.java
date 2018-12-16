public class Person {
    /*
        Co zawiera, jakie dane ma Osoba-Person:
     */

    String name; // dla każdego pola zastanawiamy się jaki typ potrzebujemy
    String surname;
    private int age;
    String gender;

    public Person(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        setAge(age);
        this.gender = gender;
    }

    void printDescription(){
        System.out.println(age); //this.age
        System.out.println(surname); //this.surname
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0)
        this.age = age;
        else
            System.out.println("Wprowadzono niepoprawne dane");
    }

    public static void main(String[] args) {
        Person person = new Person("Adam", "Kowalski", -27, "Mężczyzna");
        person.setAge(-5);

        person.printDescription();

        Person anna = new Person("Joanna", "Nowak", 19, "Kobieta");

        anna.printDescription();

    }

}


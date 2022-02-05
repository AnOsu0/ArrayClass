package example1;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Maria","Nowak","12345678910");
        Person person2 = new Person("Karol","Mistrz","153749406362");
        Person person3 = new Person("Katarzyna","Polak","2345678123");
        Person person4 = new Person("Jan","Kowalski","345687201");


        PersonDatabase.add(person1);
        PersonDatabase.add(person2);
        PersonDatabase.add(person3);
        PersonDatabase.add(person4);

        PersonDatabase.remove(person2);
//        PersonDatabase.remove(person4);


        System.out.println(PersonDatabase.getInfo());
        System.out.println(PersonDatabase.get(1).toString());
        System.out.println("Ilosć elementów przechowywanyc w tablicy: " + PersonDatabase.size());
    }
}

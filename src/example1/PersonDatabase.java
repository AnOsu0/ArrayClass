package example1;

import java.util.Arrays;

public class PersonDatabase {
    private static int length = 1;
    private static Person[] persons = new Person[length];
    private static int personNumber = 0;


    public static void add(Person p) {
        if (p == null) {
            throw new NullPointerException("Obiekt nie może być nullem");
        } else if (personNumber == length) {
            length = length * 2;
            persons = Arrays.copyOf(persons, length);
        }
            persons[personNumber] = p;
            personNumber++;
    }

    public static void remove(Person p) {
        int equalNumber = -1;
        if (p == null) {
            throw new NullPointerException("Nie można wyszukać osoby która jest nullem");
        } else {
            for (int i = 0; i < persons.length; i++) {
                if (p.equals(persons[i])) {
                    equalNumber = i;
                }
            }
            if (equalNumber == -1) {
                System.out.println("Nie znaleziono takiej osoby");
            } else if (equalNumber == 0) {
                Person[] temp = new Person[length];
                System.arraycopy(persons, 1, temp, 0, length-1);
                persons = Arrays.copyOf(temp, temp.length);
            } else {
                Person[] temp = new Person[length];
                System.arraycopy(persons, 0, temp, 0, equalNumber);
                System.arraycopy(persons, equalNumber + 1, temp, equalNumber,
                        length - equalNumber-1);
                persons = Arrays.copyOf(temp, temp.length);
            }
        }
    }

    public static Person get (int index){
        return persons[index];
    }

    public static int size(){
        int size = 0;
        for (Person person : persons) {
            if (person != null){
                size++;
            }
        }
        return size;
    }


    public static String getInfo() {
        return Arrays.toString(persons) + "\n" + "długość tablicy to: " + persons.length;
    }

}

package by.it.liulis.lesson06;

public class DogHelper {

    public static void printAllNames(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            System.out.printf("%s ", dogs[i].getName());
        }
        System.out.println("");
    }

    public static double averageAge(Dog[] dogs) {

        int summ = 0;
        for (Dog dog : dogs) {
            summ += dog.getAge();
        }
        return ((double) summ) / dogs.length;
    }
}

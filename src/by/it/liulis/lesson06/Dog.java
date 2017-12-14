package by.it.liulis.lesson06;

public class Dog implements Comparable<Dog> {
    private String name;
    private int age;
    private int weight;
    private double power;

    public Dog() {
    }

    public Dog(String name, int age, int weight, double power) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.power = power;
    }

    public Dog[] initDogs(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog();
        }
        return dogs;
    }

    public Dog[] setAgeAlldogs(Dog[] dogs) {
        int age = 1;
        for (Dog dog : dogs) {
            dog.setAge(age);
            age++;
        }
        return dogs;
    }

    public Dog[] setAgeNamedogs(Dog[] dogs) {
        dogs[0].setName("Шарик");
        dogs[1].setName("Жучка");
        dogs[2].setName("Бобик");
        dogs[3].setName("Барбос");
        dogs[4].setName("Полкан");
        return dogs;
    }

    public boolean win(Dog o) {
        if (compareTo(o) == -1) {
            return true;
        } else
            return false;
    }

    private double countPover(Dog dog) {
        return (0.2 * (double) dog.getAge()) + (0.3 * (double) dog.getWeight()) + (0.5 * dog.getPower());
    }

    @Override
    public int compareTo(Dog o) {
        double thisDog = countPover(this);
        double otherDog = countPover(o);
        if (thisDog > otherDog) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        String str = String.format("Кличка: %s. Возраст: %d", this.name, this.age);
        return str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}

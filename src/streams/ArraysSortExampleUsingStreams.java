package streams;


import java.util.Arrays;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }

}

public class ArraysSortExampleUsingStreams {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        };

        Arrays.sort(people, (p1, p2) -> p1.age - p2.age);

        System.out.println("Sorted by age: " + Arrays.toString(people));
    }
}


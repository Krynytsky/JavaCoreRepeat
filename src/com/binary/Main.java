package com.binary;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
//        int [] arr = {1,2,4,5};
//        for(int i = 0; i<arr.length;i++){
//            System.out.print(arr[i]+",");
//        }

//        Person p1 = new Person("petro",25);
//        System.out.println(p1);

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("yurii", 26));
        persons.add(new Person("vika", 23));
        persons.add(new Person("timyr", 19));
        persons.add(new Person("oksana", 15));
        int i = persons.size();

        for (Person person : persons) {
            System.out.println(person);
        }

        String name = "yurii";

//        name = new String("vika");
        System.out.println(name);



//        Optional<Person> first = persons.stream()
//              .findAny();
//        System.out.println(first);
//        Person person1 = new Person();
//        person1.pupAge();


//     System.out.println(persons.listIterator());
    }
}




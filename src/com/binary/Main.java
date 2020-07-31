package com.binary;


import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
//        int [] arr = {1,2,4,5};
//        for(int i = 0; i<arr.length;i++){
//            System.out.print(arr[i]+",");
//        }

//        Person p1 = new Person("petro",25);
//        System.out.println(p1);

        Set<Person> persons = new HashSet<>();
        persons.add(new Person("yurii", 26));
//  ignored duplicates during the iteration, while we have equals() and hashCode() methods
        persons.add(new Person("yurii", 26));
        persons.add(new Person("pablo", 27));
//        possible to store null
        persons.add(new Person(null, 11));
        persons.add(new Person("vika", 23));
        persons.add(new Person("timyr", 19));
        persons.add(new Person("oksana", 15));
        persons.add(new Person("kris", 20));
        persons.add(new Person("emily", 26));

//        for (Person person : persons) {
//            System.out.println(person);
//      }

        Set<String> stringSet, sh;
        sh = new HashSet<>();
        sh.add("1");
        sh.add("3");
        sh.add("4");
        sh.add("6");
        sh.add("8");
        sh.add("0");
        sh.add("2");
        System.out.println(sh);

        stringSet = new TreeSet<>(sh);
        System.out.println(stringSet);
        System.out.println(sh);



//        String name = "yurii";

//        name = new String("vika");
//        System.out.println(name);



//        Optional<Person> first = persons.stream()
//              .findAny();
//        System.out.println(first);
//        Person person1 = new Person();
//        person1.pupAge();


     System.out.println(persons.iterator().toString());
    }
}




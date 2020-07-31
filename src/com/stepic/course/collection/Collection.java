package com.stepic.course.collection;

import java.util.*;

public class Collection {
    public static void main(String[] args) {

       List<GreekLetter> letterList = new ArrayList<>();
        letterList.add(new GreekLetter("Gamma", 3));
        letterList.add(new GreekLetter("Omega", 24));
        letterList.add(new GreekLetter("Alpha", 1));
//output all elements of the arraylist in one line
       System.out.println(letterList);

// for loop
        for (int i=0;i<letterList.size();i++){
            System.out.println(letterList.get(i));
        }

// collection method toArray()
        Object[] objArray = letterList.toArray();

//forEach
        for (Object object : objArray) {
            System.out.println(object);


        }
    }

    static class GreekLetter {

        final private String letter;
        final private Integer position;

        public GreekLetter(String letter, Integer position) {
            this.letter = letter;
            this.position = position;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof GreekLetter)) return false;
            GreekLetter that = (GreekLetter) o;
            return Objects.equals(letter, that.letter) &&
                    Objects.equals(position, that.position);
        }

        @Override
        public int hashCode() {
            return Objects.hash(letter, position);
        }

        @Override
        public String toString() {
            return "{" +
                    "letter='" + letter + '\'' +
                    ", position=" + position +
                    '}';
        }
    }
}

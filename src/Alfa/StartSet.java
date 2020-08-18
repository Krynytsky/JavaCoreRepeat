package Alfa;

import java.util.*;
import java.util.stream.Collectors;

public class StartSet {
    public static void main(String[] args) {
        Set<Employer> employers = new HashSet<>();
        employers.add(new Employer(13, "Hay", new Group(1, "Alfa")));
        employers.add(new Employer(13, "Hay", new Group(1, "Alfa")));
        employers.add(new Employer(13, "Hay", new Group(1, "Alfa")));
        employers.add(new Employer(13, "Hay", new Group(1, "Alfa")));
        employers.add(new Employer(25, "Brodjak", new Group(1, "Alfa")));
        employers.add(new Employer(2, "Purih", new Group(1, "Alfa")));
        employers.add(new Employer(13, "Hay", new Group(1, "Alfa")));
        employers.add(new Employer(4, "Chuhay", new Group(1, "Alfa")));
        employers.add(new Employer(2, "Vasjytik", new Group(1, "Alfa")));
        employers.add(new Employer(6, "Rogach", new Group(1, "Alfa")));
        employers.add(new Employer(7, "Mejvinskiy", new Group(1, "Alfa")));
        employers.add(new Employer(8, "Petrusik", new Group(1, "Alfa")));

        Set<Employer> barygas = new TreeSet<>();
        barygas.add(new Employer(289, "Brodjak", new Group(1, "colorado")));
        barygas.add(new Employer(2, "Purih", new Group(1, "colorado")));
        barygas.add(new Employer(33, "Ahay", new Group(1, "colorado")));
        barygas.add(new Employer(245, "Vistak", new Group(15, "colorado")));
//        employers.stream()
//                .sorted(Comparator.comparingInt(Employer::getId))
//                .forEach(System.out::println);
//        for (Object employer: employers){
//            System.out.println("=====" + employer);
//        barygas.stream().sorted(Comparator.comparing(Employer::getName))
//                .forEach(System.out::println);

employers.stream()
        .sorted(Comparator.comparingInt(Employer::getId))
        .forEach(System.out::println);

        }
    }

package Collections_List_Set;


import java.util.*;
import java.util.stream.Collectors;

public class StartList {
    public static void main(String[] args) {
        List<Employer> employers = new ArrayList<>();
        employers.add(new Employer(25, "Brodjak", new Group(1, "Collections_List_Set")));
        employers.add(new Employer(2, "Purih", new Group(1, "Collections_List_Set")));
        employers.add(new Employer(13, "Hay", new Group(1, "Collections_List_Set")));
        employers.add(new Employer(4, "Chuhay", new Group(1, "Collections_List_Set")));
        employers.add(new Employer(2, "Vasjytik", new Group(1, "Collections_List_Set")));
        employers.add(new Employer(6, "Rogach", new Group(1, "Collections_List_Set")));
        employers.add(new Employer(7, "Mejvinskiy", new Group(1, "Collections_List_Set")));
        employers.add(new Employer(8, "Petrusik", new Group(1, "Collections_List_Set")));

        List<Employer> barygas = new ArrayList<>();
        barygas.add(new Employer(289, "Brodjak", new Group(1, "colorado")));
        barygas.add(new Employer(2, "Purih", new Group(1, "colorado")));
        barygas.add(new Employer(33, "Ahay", new Group(1, "colorado")));
        barygas.add(new Employer(245, "Vistak", new Group(15, "colorado")));

//        for (Object employer : employers) {
//            System.out.println(employer);
//        }
//      Collection method indexOf() - return  actual index of the existing List employers starting from 0
        int index = employers.indexOf(new Employer(5, "Vasjytik", new Group(1, "Alfa")));
        System.out.println(index);

//      Collection method size() - return int value that shows size of the barygas List
        int sizeOfBarygasList = barygas.size();
        System.out.println(sizeOfBarygasList);

//      Collection method add(i,Object o) - add new Object in the employers List in position with specific index i
        employers.add(0, new Employer(9, "Xliborez", new Group(1, "Alfa")));

//      Collection method addAll(Collection<?extends Employer> collection) -add new collection
//      in position with specific index i
        employers.addAll(5, barygas);
        System.out.println("=================");
        employers.forEach(System.out::println);
        System.out.println("=================");

        employers.removeAll(barygas);
        employers.stream().sorted(Comparator.comparingInt(Employer::getId)).forEach(System.out::println);

//      collection method get()- get the value of employers List in concreate position
        Employer employer3 = employers.get(6);
        System.out.println("***" + employer3 + "***");
        System.out.println("===================");
//        Collections method sort() - implements Comparator with one method compare(
        Collections.sort(barygas, new Comparator<Employer>() {
            @Override
            public int compare(Employer t0, Employer t1) {
                return t0.getName().compareTo(t1.getName());
            }
        });
//        The same Collections method then above but using lambda expression
        Collections.sort(employers, (t0, t1) -> t0.getName().compareTo(t1.getName()));

        for (Object employer : employers) {
            System.out.println(employer);
        }
//        System.out.println("==================");
//        for (Object employer : barygas) {
//            System.out.println(employer);
//        }
//      Using stream to sort and iterate the barygas ArrayList
        barygas.stream()
//                Ussing lambda expression
                .sorted((o, o2) -> o2.getId() - o.getId())
                .filter((s) -> s.getId() > 100)
                .collect(Collectors.toList())
//                 using method referencies
                .forEach(System.out::println);



    }
}
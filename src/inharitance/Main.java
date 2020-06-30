package inharitance;

import com.sun.org.apache.xalan.internal.xsltc.dom.AdaptiveResultTreeImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Address address1 = new Address("Lviv", "Pryrodna", 79000);
        Address address2 = new Address("Sambir", "Ivasjyka", 81400);
        Address address3 =new Address("Lviv", "Vugovskogo", 79000);
        Address address4 = new Address("Drogobych", "Bichna", 44298);

        List<Employer> employerList = new ArrayList<>();
        employerList.add(new Employer(1,"Yurii",address1));
        employerList.add(new Employer(2,"Oksana",address2));
        employerList.add(new Employer(3,"Petro",address3));
        employerList.add(new Employer(4,"Vika",address4));

        for (Employer employer:employerList){
            System.out.println(employer);
        }
    }

}

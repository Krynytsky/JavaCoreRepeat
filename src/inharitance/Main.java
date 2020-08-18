package inharitance;

import com.sun.org.apache.xalan.internal.xsltc.dom.AdaptiveResultTreeImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Employer> employerList = new ArrayList<>();
        employerList.add(new Employer(1,"Yurii","Lviv","prurodnja",81400));
        employerList.add(new Employer(2,"Oksana","Sambir", "Ivasjyka", 81400));
        employerList.add(new Employer(3,"Petro","Lviv", "Vugovskogo", 79000));
        employerList.add(new Employer(4,"Vika","Drogobych", "Bichna", 44298));

        for (Employer employer:employerList){
            System.out.println(employer);
        }
    }

}

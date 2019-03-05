package cap05;

import model.Usuario;

import java.util.*;

public class Aula09 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Maria","Ana", "José");
        list.sort(Comparator.naturalOrder());


//        list.sort();
//        Collections.sort(list, Comparator.reverseOrder());
//        Collections.sort(list, Comparator.naturalOrder());
        list.forEach(System.out::println);
    }
}
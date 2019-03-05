package cap05;

import model.Usuario;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Aula06 {

    public static void main(String[] args) {
        Usuario u1 = new Usuario("Paulo Silveira", 150);
        Usuario u2 = new Usuario("Rodrigo Turine", 120);
        Usuario u3 = new Usuario("Gilherme Silveira", 190);

        List<Usuario> list = Arrays.asList(u1, u2, u3);
        System.out.println("--- Antes da  Ordenação ---");
        list.forEach( u->System.out.println(u.getNome()));

//      PARTE 01
//        Comparator<model.Usuario> comparator = new Comparator<model.Usuario>() {
//            @Override
//            public int compare(model.Usuario u1, model.Usuario u2) {
//                return u1.getNome().compareTo(u2.getNome());
//            }
//        };
//
//        Collections.sort(list, comparator);

//      PARTE 02
//        Comparator<model.Usuario> comparator =
//                (user1, user2) -> user1.getNome().compareTo(user2.getNome());
//        Collections.sort(list, comparator);

//      PARTE 03
        Collections.sort(list, ( user1,  user2) ->  user1.getNome().compareTo(user2.getNome()));

//      SAIDA
        System.out.println("--- Depois da  Ordenação ---");
        list.forEach( u->System.out.println(u.getNome()));

    }



}

package cap05;

import model.Usuario;

import java.util.Arrays;
import java.util.List;

public class Aula07 {

//  Ordenando com o List.sort (novo metodo default na interface List)
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Paulo Silveira", 150);
        Usuario u2 = new Usuario("Rodrigo Turine", 120);
        Usuario u3 = new Usuario("Gilherme Silveira", 190);

        List<Usuario> list = Arrays.asList(u1, u2, u3);
        System.out.println("--- Antes da  Ordenação ---");
        list.forEach(u -> System.out.println(u.getNome()));


        list.sort(( user1,  user2) ->  user1.getNome().compareTo(user2.getNome()));

        System.out.println("--- Depois da  Ordenação ---");
        list.forEach( u->System.out.println(u.getNome()));

    }
}

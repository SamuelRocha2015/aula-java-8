package cap05;

import model.Usuario;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class Aula08 {

    //  Ordenando o Comparator.comparing
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Paulo Silveira", 150);
        Usuario u2 = new Usuario("Rodrigo Turine", 120);
        Usuario u3 = new Usuario("Gilherme Silveira", 190);

        List<Usuario> list = Arrays.asList(u1, u2, u3);
        System.out.println("--- Antes da  Ordenação ---");
        list.forEach(u -> System.out.println(u.getNome()));

//      PARTE 01
        Comparator<Usuario> comparator = Comparator.comparing(u->u.getNome());
        list.sort(comparator);



//      PARTE 02 -> Chamando o comparing diretamente
//        list.sort(Comparator.comparing(u->u.getNome()));



//      PARTE 03 -> Fazendo o import static
        list.sort(comparing(u->u.getNome()));



        System.out.println("--- Depois da  Ordenação ---");
        list.forEach( u->System.out.println(u.getNome()));

    }

}

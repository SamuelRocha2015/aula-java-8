package cap04;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Aula05 {

    // Predicate e RemoveIf
    public static void main(String[] args) {
//      ENTRADA
        Usuario u1 = new Usuario("Paulo Silveira", 150);
        Usuario u2 = new Usuario("Rodrigo Turine", 120);
        Usuario u3 = new Usuario("Gilherme Silveira", 190);

        List<Usuario> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        System.out.println("Antes RemoveIF");
        list.forEach(u-> System.out.println(u.getNome()));

//      PARTE 01
//        Predicate<model.Usuario> predicado = new Predicate<model.Usuario>() {
//            @Override
//            public boolean test(model.Usuario usuario) {
//                if(usuario.getPontos() < 150) {
//                    return true;
//                }
//                return false;
//            }
//        };
//
//        list.removeIf(predicado);



//      PARTE 02

        list.removeIf(u -> u.getPontos()< 150);


//      SAIDA
        System.out.println("Apos RemoveIF");
        list.forEach(u-> System.out.println(u.getNome()));

    }
}

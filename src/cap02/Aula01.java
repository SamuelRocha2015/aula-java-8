package cap02;

import model.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Aula01 {

    public static void main(String[] args) {
        Usuario u1 = new Usuario("Paulo Silveira", 150);
        Usuario u2 = new Usuario("Rodrigo Turine", 120);
        Usuario u3 = new Usuario("Gilherme Silveira", 190);

        List<Usuario> list = Arrays.asList(u1, u2, u3);

//        PARTE 01
//        for (model.Usuario u : list) {
//            System.out.println(u.getNome());
//        }

//        PARTE 02
//        list.forEach(new cap02.Mostrador());


//      PARTE 03 --> Usando class anonima
//        list.forEach(new Consumer<model.Usuario>() {
//            @Override
//            public void accept(model.Usuario usuario) {
//                System.out.println(usuario.getNome());
//            }
//        });


//      PARTE 04 --> Usando Lambda 1
//        Consumer<model.Usuario> c = (model.Usuario u) -> {System.out.println(u.getNome());};
//        list.forEach(c);


//      PARTE 05 --> Usando Lambda 2
//        Consumer<model.Usuario> c =  u  -> {System.out.println(u.getNome());};
//        list.forEach(c);


//      PARTE 06 --> Usando Lambda 3
//        list.forEach(u  -> System.out.println(u.getNome()));

//      PARTE 07 --> Usando Lambda 4
        list.forEach(u -> u.tornaModerador());

    }
}


// PARTE 02
class Mostrador implements Consumer<Usuario> {
    @Override
    public void accept(Usuario usuario) {
        System.out.println(usuario.getNome());
    }
}
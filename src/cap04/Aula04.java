package cap04;

import model.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Aula04 {

    //Trabalhando a interface Consumer<T>

    public static void main(String[] args) {
        Usuario u1 = new Usuario("Paulo Silveira", 150);
        Usuario u2 = new Usuario("Rodrigo Turine", 120);
        Usuario u3 = new Usuario("Gilherme Silveira", 190);

        List<Usuario> list = Arrays.asList(u1, u2, u3);
        Consumer<Usuario> mostraMensagem = u -> System.out.println("antes de imprimir os nomes");
        Consumer<Usuario> imprimeNomes = u -> System.out.println(u.getNome());
        list.forEach(mostraMensagem.andThen(imprimeNomes));

    }

}

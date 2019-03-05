package cap04;

public class Aula03 {

//   Criando nossa propria interface Funcional
    public static void main(String[] args) {

//      PARTE 01
//        cap04.Validator<String> validaCep = new cap04.Validator<String>() {
//            @Override
//            public boolean valida(String valor) {
//                return valor.matches("[0-9]{5}-[0-9]{3}");
//            }
//        };
//        String cep = "54280-330";
//        boolean isCepValido = validaCep.valida(cep);
//        System.out.println(isCepValido);



//      PARTE 02
//        cap04.Validator<String> validaCep = valor -> {
//                return valor.matches("[0-9]{5}-[0-9]{3}");
//        };
//        String cep = "54280-330";
//        boolean isCepValido = validaCep.valida(cep);
//        System.out.println(isCepValido);


//        PARTE 03
//        cap04.Validator<String> validaCep = valor -> valor.matches("[0-9]{5}-[0-9]{3}");
//        String cep = "54280-330";
//        boolean isCepValido = validaCep.valida(cep);
//        System.out.println(isCepValido);

//      PARTE 04 ( Refactor )
        Validator<String> validaCep = valor -> valor.matches("[0-9]{5}-[0-9]{3}");
        System.out.println(validaCep.valida("54280-330"));

    }
}

//PARTE 01
//interface cap04.Validator<T>{
//    boolean valida(T t);
//}

//PARTE 05
@FunctionalInterface
interface Validator<T>{
    boolean valida(T t);
//    boolean outroMetodo();
}
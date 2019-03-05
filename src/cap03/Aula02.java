package cap03;

public class Aula02 {
    public static void main(String[] args) {
//      Exempls com Runnable

//      PARTE 01
//        Runnable r = new Runnable() {
//            public void run() {
//                for (int i = 0; i <= 100; i++) {
//                    System.out.println(i);
//                }
//            }
//        };
//        new Thread(r).start();


//      PARTE 02
//        Runnable r = () -> {
//            for (int i = 0; i <= 100; i++) {
//                System.out.println(i);
//            }
//        };
//        new Thread(r).start();


//      PARTE 03
        new Thread(()-> {
            for (int i = 0; i <= 100; i++) {
                System.out.println(i);
            }
        }).start();

    }
}
import  java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        System.out.println("fale qual o seu genero");
        String genero=e.nextLine();

        System.out.println("fale a sua altura em centimetros");
        int altura=e.nextInt();



        if (genero == "mulher" ){
            double pesoideal = 62+0.70 * (altura-153);
                    System.out.println("O peso ideal é " +pesoideal );


        }

    }
}
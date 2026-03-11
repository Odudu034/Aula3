//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner e=new Scanner(System.in);

        System.out.println("fale um numeroa aleatoria se for maior que 20 ira ser dividido por 2" );
        double num=e.nextDouble();

        if (num >= 20 ){
            double metade = num / 2;

            System.out.println("esse e o seu numero dividido pela metade "+metade);


        } else{
            System.out.printf("Seu numero e menos que 20!\n%.0f esse e o seu numero\n",num);

        }

        System.out.println("digite a sua idade");
        int idade= e.nextInt();

        if (idade >= 18 ){
            System.out.println("maior de idade!");

        }else{
            System.out.println("menor de idade");

        }



    }
}
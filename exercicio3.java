import  java.util.Scanner;

public class exercicio3 {
    public static void main(String[]args){

        Scanner e=new Scanner(System.in);

        double diferenca = 0;

        System.out.println("digite dois numeros! ");
        double num1= e.nextDouble();
        double num2= e.nextDouble();

        if (num1 == num2){

            System.out.println("vc colocu dois numeros iguais: "+num1);

        } else if (num1 > num2) {
            diferenca = num1 - num2;
            
        }else{
             diferenca = num2 - num1;

    }
        System.out.println("a diferença é: " +diferenca);
    }
}

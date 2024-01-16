import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);


        double n1,n2,n3,n4;

        int escolha=0;
        System.out.println("O que deseja fazer?\n1-Calcular notas\n2-Sair");
        escolha = ler.nextInt();

        while(escolha != 2){
            escolha = ler.nextInt();
            switch(escolha){
                case 1:

                    System.out.println("Digite as 4 notas!");

                    System.out.println("1-");
                    n1 = ler.nextDouble();

                    System.out.println("2-");
                    n2 = ler.nextDouble();

                    System.out.println("3-");
                    n3 = ler.nextDouble();

                    System.out.println("4-");
                    n4 = ler.nextDouble();

                    double media = (n1+n2+n3+n4) / 4;
                    System.out.println("Média do aluno: "+media);
                    try{

                        Thread.sleep(2000);
                    }
                    catch(InterruptedException e){
                        System.out.println(e);
                    }
                    System.out.println("Deseja Calcular novamente?\n---------------");
                    System.out.println("1-Calcular notas\n2-Sair");
                    break;
                case 2:

                    break;
                default:
                    System.out.println("Escolha inválida");
            }
        }

    }
}
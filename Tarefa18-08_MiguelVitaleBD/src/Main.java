import java.util.Scanner;

void main() {
    //variaveis
    int Escolha;
    Exercicio1 Ex1 = new Exercicio1();
    Exercicio2 Ex2 = new Exercicio2();
    Exercicio3 Ex3 = new Exercicio3();
    Exercicio4 Ex4 = new Exercicio4();
    Exercicio5 Ex5 = new Exercicio5();
    Exercicio6 Ex6 = new Exercicio6();
    Exercicio7 Ex7 = new Exercicio7();
    Scanner S = new Scanner(System.in);

    Escolha = -1;

     IO.println("Escolha um metodo: ");
     IO.println("1 - multiplo");
     IO.println("2 - senha");
     IO.println("3 - compras");
     IO.println("4 - temperaturas em SJC");
     IO.println("5 - Divisão de camelos");
     IO.println("6 - Calculo de viajem");
     IO.println("7 - Calculo de aluguel");



     Escolha = S.nextInt();

     switch (Escolha){
         case 1:
             Ex1.multiplo();
             break;

         case 2:
             Ex2.senha();
             break;

         case 3:
             Ex3.compras();
             break;

         case 4:
             Ex4.temperaturasSJC();
             break;

         case 5:
             Ex5.camelos();
             break;

         case 6:
             Ex6.viajem();
             break;

         case 7:
             Ex7.aluguel();
             break;


     }

         }
import java.util.Scanner;

public class Exercicio1 {

    public void multiplo(){
    int N1;
    int N2;
    Scanner S = new Scanner(System.in);

    IO.println("Digite o primeiro numero: ");
    N1 = S.nextInt();

    IO.println("digeite o segundo numero: ");
    N2 = S.nextInt();

    if (N1 % N2 == 0){
        IO.println("o primeiro numero é multiplo do segudndo.");
    }else{
        IO.println("o primeiro numero não é multiplo do segundo.");
    }

    }

}

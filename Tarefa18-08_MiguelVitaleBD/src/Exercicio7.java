import java.util.Scanner;

public class Exercicio7 {

    public void aluguel(){
        int Dias; double Km; double Diaria; double Limite; double Adicional; double Custo;
        Scanner S = new Scanner(System.in);


        IO.println("Digite a quantidade de dias: ");
        Dias = S.nextInt();

        IO.println("Digite a quilometragem: ");
        Km = S.nextDouble();

        IO.println("Digite o limite de quilômetros antes da cobrança adicional: ");
        Limite = S.nextDouble();

        IO.println("Digite o valor da diária: ");
        Diaria = S.nextDouble();

        IO.println("Digite o valor adicional por KM acima do limite: ");
        Adicional = S.nextDouble();

        Custo = Dias * Diaria;

        if(Km > Limite) Custo = Custo + ((Km - Limite) * Adicional);

        IO.println("Preço do aluguel: " + Custo);


    }

}

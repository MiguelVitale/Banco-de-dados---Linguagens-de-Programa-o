import java.util.Scanner;

public class Exercicio6 {
    public Exercicio6() {
    }

    public void viajem() {
        Scanner S = new Scanner(System.in);
        double Desconto = (double)0.0F;
        IO.println("digite a distância da viajem(em km): ");
        double Viajem = S.nextDouble();
        IO.println("digite o preço da gasolina: ");
        double Preco = S.nextDouble();
        double Custo = Viajem / (double)12.0F * Preco;
        if (Viajem > (double)500.0F) {
            Desconto = Custo - Custo * 0.05;
        }

        IO.println("Custo total da viajem: " + Custo);
        if (Viajem > (double)500.0F) {
            IO.println("Custo com desconto: " + Desconto);
        }

    }
}
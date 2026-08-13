import java.util.Scanner;

public class Exercicio6 {

    void main(){
        double Viajem; double Preco; double Custo; double Desconto;
        Scanner S = new Scanner(System.in);

        Desconto = 0;
        
        IO.println("digite a distância da viajem(em km): ");
        Viajem = S.nextDouble();
        
        IO.println("digite o preço da gasolina: ");
        Preco = S.nextDouble();

        Custo = (Viajem / 12) * Preco;
        
        if (Viajem > 500){
            Desconto = Custo - (Custo * 0.05);
        }

        IO.println("Custo total da viajem: " + Custo);
        if (Viajem > 500) IO.println("Custo com desconto: " + Desconto);
    }

}

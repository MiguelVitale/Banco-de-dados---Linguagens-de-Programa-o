import java.util.Scanner;

public class Exercicio3 {

    public void compras (){
        float PreArroz; float PreFeijao; float PreOleoSoja;
        float PreAcucar; float PreCafe; float PreMacarrao; float PreFarinhaMandioca; float PreFuba; float PreTomate;
        float PreSal;
        double PreTotal; double PreDesconto;
        Scanner S = new Scanner(System.in);

        PreDesconto = 0;

        IO.println("Digite o preço do arroz: ");
        PreArroz = S.nextFloat();

        IO.println("Digite o preço do feijão: ");
        PreFeijao = S.nextFloat();

        IO.println("Digite o preço do Oleo de soja: ");
        PreOleoSoja = S.nextFloat();

        IO.println("Digite o preço do açucar: ");
        PreAcucar = S.nextFloat();

        IO.println("Digite o preço do Café: ");
        PreCafe = S.nextFloat();

        IO.println("Digite o preço do macarrão: ");
        PreMacarrao = S.nextFloat();

        IO.println("Digite o preço da farinha de mandioca: ");
        PreFarinhaMandioca = S.nextFloat();

        IO.println("Digite o preço do fubá de milho: ");
        PreFuba = S.nextFloat();

        IO.println("Digite o preço do extrato de tomate: ");
        PreTomate = S.nextFloat();

        IO.println("Digite o preço do sal refinado: ");
        PreSal = S.nextFloat();

        PreTotal = PreAcucar + PreArroz + PreCafe + PreFarinhaMandioca + PreFeijao + PreFuba + PreMacarrao + PreOleoSoja + PreSal + PreTomate;

        if (PreTotal > 100.0){
            PreDesconto = PreTotal - (PreTotal * 0.10);
        }else{
            PreDesconto = 0;
        }

        IO.println("      ITEM          |  QNT  |  PREÇO");
        IO.println("Arroz               | 1,5Kg |  " + PreArroz );
        IO.println("Feijão carioca      |  2Kg  |  " + PreFeijao );
        IO.println("Oleo de soja        | 900ml |  " + PreOleoSoja );
        IO.println("Açúcar refinado     |  1Kg  |  " + PreArroz );
        IO.println("Café torrado        |  250g |  " + PreCafe );
        IO.println("Macarrão espaguete  |  500g |  " + PreMacarrao );
        IO.println("Farinha de mandioca |  1kg  |  " + PreFarinhaMandioca );
        IO.println("Fubá de milho       |  1kg  |  " + PreFuba );
        IO.println("Extrate de tomate   |  300g |  " + PreTomate );
        IO.println("Sal refinado        |  1Kg  |  " + PreSal );
        IO.println("");
        IO.println("Total: " + PreTotal);
        if (PreTotal > 100) IO.println("Total com desconto: " + PreDesconto);
    }

}

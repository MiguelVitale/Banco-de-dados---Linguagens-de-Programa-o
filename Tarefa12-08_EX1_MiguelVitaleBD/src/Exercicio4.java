import java.util.Scanner;

public class Exercicio4 {

void main(){
    double Mes1; double Mes2; double Mes3; double Mes4; double Mes5; double Mes6; double Mes7; double Mes8;
    double Mes9; double Mes10; double Mes11; double Mes12; double Media;
    Scanner S = new Scanner(System.in);

    IO.println("Digite a temperatura do mês 1: ");
    Mes1 = S.nextDouble();

    IO.println("Digite a temperatura do mês 2: ");
    Mes2 = S.nextDouble();

    IO.println("Digite a temperatura do mês 3: ");
    Mes3 = S.nextDouble();

    IO.println("Digite a temperatura do mês 4: ");
    Mes4 = S.nextDouble();

    IO.println("Digite a temperatura do mês 5: ");
    Mes5 = S.nextDouble();

    IO.println("Digite a temperatura do mês 6: ");
    Mes6 = S.nextDouble();

    IO.println("Digite a temperatura do mês 7: ");
    Mes7 = S.nextDouble();

    IO.println("Digite a temperatura do mês 8: ");
    Mes8 = S.nextDouble();

    IO.println("Digite a temperatura do mês 9: ");
    Mes9 = S.nextDouble();

    IO.println("Digite a temperatura do mês 10: ");
    Mes10 = S.nextDouble();

    IO.println("Digite a temperatura do mês 11: ");
    Mes11 = S.nextDouble();

    IO.println("Digite a temperatura do mês 12: ");
    Mes12 = S.nextDouble();

    Media = (Mes1 + Mes2 + Mes3 + Mes4 + Mes5 + Mes6 + Mes7 + Mes8 + Mes9 + Mes10 + Mes11 + Mes12) / 12 ;

    IO.println("Temperatura média de SJC: " + Media);

    if (Media < 18){
        IO.println("A temperatura está fria");
    }else{
        if(Media > 30){
            IO.println("A temperatura está quente");
        }else{
            IO.println("A temperatura está agradável");
        }
    }

    }

}

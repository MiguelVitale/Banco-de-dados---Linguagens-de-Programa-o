import java.util.Scanner;

public class Exercicio4 {

void main(){
    double Mes1; double Mes2; double Mes3; double Mes4; double Mes5; double Mes6; double Mes7; double Mes8;
    double Mes9; double Mes10; double Mes11; double Mes12;
    int Agradavel; int Frio;
    Scanner S = new Scanner(System.in);

    Frio = 0;
    Agradavel = 0;

    IO.println("Digite a temperatura do mês 1: ");
    Mes1 = S.nextDouble();

    if (Mes1 < 18) Frio += 1;
    else Agradavel += 1;

    IO.println("Digite a temperatura do mês 2: ");
    Mes2 = S.nextDouble();

    if (Mes2 < 18) Frio += 1;
    else Agradavel += 1;

    IO.println("Digite a temperatura do mês 3: ");
    Mes3 = S.nextDouble();

    if (Mes3 < 18) Frio += 1;
    else Agradavel += 1;

    IO.println("Digite a temperatura do mês 4: ");
    Mes4 = S.nextDouble();

    if (Mes4 < 18) Frio += 1;
    else Agradavel += 1;

    IO.println("Digite a temperatura do mês 5: ");
    Mes5 = S.nextDouble();

    if (Mes5 < 18) Frio += 1;
    else Agradavel += 1;

    IO.println("Digite a temperatura do mês 6: ");
    Mes6 = S.nextDouble();

    if (Mes6 < 18) Frio += 1;
    else Agradavel += 1;

    IO.println("Digite a temperatura do mês 7: ");
    Mes7 = S.nextDouble();

    if (Mes7 < 18) Frio += 1;
    else Agradavel += 1;

    IO.println("Digite a temperatura do mês 8: ");
    Mes8 = S.nextDouble();

    if (Mes8 < 18) Frio += 1;
    else Agradavel += 1;

    IO.println("Digite a temperatura do mês 9: ");
    Mes9 = S.nextDouble();

    if (Mes9 < 18) Frio += 1;
    else Agradavel += 1;

    IO.println("Digite a temperatura do mês 10: ");
    Mes10 = S.nextDouble();

    if (Mes10 < 18) Frio += 1;
    else Agradavel += 1;

    IO.println("Digite a temperatura do mês 11: ");
    Mes11 = S.nextDouble();

    if (Mes11 < 18) Frio += 1;
    else Agradavel += 1;

    IO.println("Digite a temperatura do mês 12: ");
    Mes12 = S.nextDouble();

    if (Mes12 < 18) Frio += 1;
    else Agradavel += 1;

    if (Frio >= Agradavel) IO.println("A temperatura em SJC está fria");
    else IO.println("A temperatura em SJC está agradável");



    }

}

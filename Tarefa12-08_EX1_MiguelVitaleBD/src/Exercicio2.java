import java.util.Scanner;

public class Exercicio2 {

    void main(){
    int Senha;
    int Tentativa;
    Scanner S = new Scanner(System.in);

    Senha = 1234;

    IO.println("digite a senha: ");
    Tentativa = S.nextInt();

    if(Senha == Tentativa){
        IO.println("Acesso permitido");
    }else{
        IO.println("Acesso negado");
    }

    }

}

public class Main {
    public static void main(String[] args) {
        //notas
        double  P1, E1, E2, SUB, X, API, EXF;
        //variaveis de calculo
        double M1, M2, M3, M4, M5, Max1, Max2;
        
        //inicialização de variaveis
        P1 = 4.0;
        E1 = 6.0;
        E2 = 7.5;
        SUB = 10.0;
        API = 8.7;
        X = 0.5;
        EXF = 0;

        //primeiro parentese
        M1 = (P1 * 0.5 + E1 * 0.2 + E2 * 0.3 + X + SUB * 0.15) * 0.5;
        //segundo parentese
        M2 = P1 * 0.5 + E1 * 0.2 + E2 * 0.3 + X + (SUB * 0.15) - 5.9;

        //primeiro MAX
        if (M2 > 0) {
            Max1 = M2;
        }else{
            Max1 = 0;
        }

        //terceiro parentese
        M3 = P1 * 0.5 + E1 * 0.2 + E2 * 0.3 + X + (SUB * 0.15) - 5.9;

        //divisao
        if (M3 != 0) {
            M4 = Max1 / M3;
        }else{
            M4 = 0;
        }

        //total sem contar o MAX
        M5 = M1 + (M4 * API * 0.5);

        //ultimo MAX
        if (M5 > EXF) {
            Max2 = M5;
        }else{
            Max2 = EXF;
        }

        System.out.println("Nota final: " + Max2);



    }
}
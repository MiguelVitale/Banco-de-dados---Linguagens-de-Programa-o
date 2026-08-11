Algoritmo "Tarefa_Nota_Miguel_Vitale_BD"
Var
   SUB, X, API, P1, E1, E2, EXF, M1, M2, M3, M4, M5, Max1, Max2: real

Inicio
   escreval("nota SUB")
   leia(SUB)
   escreval("nota X")
   leia(X)
   escreval("nota API")
   leia(API)
   escreval("nota P1")
   leia(P1)
   escreval("nota E1")
   leia(E1)
   escreval("nota E2")
   leia(E2)
   escreval("nota EXF")
   leia(EXF)

   M1 <- (P1 * 0.5 + E1 * 0.2 + E2 * 0.3 + X + SUB * 0.15) * 0.5
   M2 <- P1 * 0.5 + E1 * 0.2 + E2 * 0.3 + X + (SUB * 0.15) - 5.9

   se M2 > 0 entao
      Max1 <- M2
   senao
      Max1 <- 0
   fimse

   M3 <- P1 * 0.5 + E1 * 0.2 + E2 * 0.3 + X + (SUB * 0.15) - 5.9

   se M3 <> 0 entao
      M4 <- Max1 / M3
   senao
      M4 <- 0
   fimse


   M5 <- M1 + (M4 * API * 0.5)

   se  M5 > EXF entao
      Max2 <- M5
   senao
      Max2 <- EXF
   fimse

   escreval("-------")
   escreval("nota final: ", Max2)

Fimalgoritmo
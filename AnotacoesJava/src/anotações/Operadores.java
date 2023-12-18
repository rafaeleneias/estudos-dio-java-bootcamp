package anotações;
public class Operadores{
    public static void main(String[] args) {
    /* Operadores: 
     Operador de atribuição: =
     Operador aritmético: +(adição), -(subtração), *(multiplicação), /(divisão), %(resto da divisão).
     Operadores unários são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos 
     como incrementar, decrementar, inverter valores numéricos e booleanos.
     (+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;
     (-) Operador unário de valor negativo – nega um número ou expressão aritmética;
     (++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;
     (--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;
     (!) Operador unário lógico de negação – nega o valor de uma expressão booleana; */
    int numero = 1022;
    System.out.println(- numero);
    numero ++;
    System.out.println(numero);
    // numero ++ é a mesma coisa de numero + 1.
    int ano = 2010;
    System.out.println(++ ano);
    ano = 2010;
    System.out.println(-- ano);
    
    // O operador "!" inverte o valor de uma expressão booleana.
    boolean eh_verdade = true;
    System.out.println(!eh_verdade);

    /* O operador ternário é representado pelos símbolos "?" e ":", e devem ser pensados como uma condição if.
     Operadores relacionais avaliam a relação entre duas variáveis ou expressões:
     == : Igual
     >= : Maior ou igual
     <= : Menor ou igual
     > : Maior
     < : Menor
     != : Diferente de
     O operador de adição(+) realizado nas strings, realiza uma concatenação entre elas.
     Operadores lógicos criam expressões lógicas maiores a partir da junção de duas ou mais expressões:
     && : Operador lógico "E"(Os dois valores precisam ser verdadeiros)
     || : Operador lógico "Ou"(Algum dos valores precisa ser verdadeiro)
    */
    }
}
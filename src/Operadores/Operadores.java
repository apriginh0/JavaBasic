package Operadores;

public class Operadores {
    public static void main(String[] args){
        int numero = 5;
        int numero2 = numero * -1;

        System.out.println(numero);
        System.out.println(-numero + 10);
        System.out.println(numero2 + 10);
        System.out.println(numero2 * -1);
        System.out.println(++numero);
        System.out.println(--numero);

        boolean varible = true;
        System.out.println(!varible);
        varible = false;
        System.out.println(!varible);

        System.out.println("------------");

        // Operador ternário
        int a, b, c;

        a = 6;
        b = 6;
        c = 4;
        String resultado;

        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        System.out.println(resultado);

        String valor = (a!=b) ? "verdadeiro" : "falso";
        System.out.println(valor);

        int resposta = (a==c) ? 5 : 10;
        System.out.println(resposta);
    }
}

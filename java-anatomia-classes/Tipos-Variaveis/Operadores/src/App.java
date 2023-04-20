public class Operadores {
    public static void main(String[] args) {
        String concatenacao ="?";
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao); concatenacao = "31";
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+1+"1"+1;
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);


        //OPERADORES UNARIOS:
        int numero = 5;
        numero = - numero;
        System.out.println(numero);
        numero =  numero * -1;
        System.out.println(numero);

        //x repetição incremento ou decremento:
        numero = numero ++;
        numero = numero --;



    }
}

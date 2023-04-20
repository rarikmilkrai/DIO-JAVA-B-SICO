public class MinhaClasse {
public static void  main(String[] args) {

    String primeiroNome = "Rarikmilkrai";
    String segundoNome = "Souza";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
    
    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome){
    return primeiroNome.concat(" ").concat(segundoNome);
    
}
}

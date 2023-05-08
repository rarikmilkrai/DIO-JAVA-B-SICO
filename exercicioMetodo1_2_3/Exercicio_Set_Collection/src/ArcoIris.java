import java.util.*;

public class ArcoIris {
    public static void main(String[] args) {
        // Cria o conjunto com as cores do arco-íris
        Set<String> cores = new HashSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));

        // Exibe todas as cores uma abaixo da outra
        System.out.println("Cores do arco-íris:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        // Quantidade de cores que o arco-íris tem
        System.out.println("O arco-íris tem " + cores.size() + " cores.");

        // Exibe as cores em ordem alfabética
        System.out.println("Cores do arco-íris em ordem alfabética:");
        List<String> coresOrdenadas = new ArrayList<>(cores);
        Collections.sort(coresOrdenadas);
        for (String cor : coresOrdenadas) {
            System.out.println(cor);
        }

        // Exibe as cores na ordem inversa da que foi informada
        System.out.println("Cores do arco-íris em ordem inversa:");
        List<String> coresInversas = new ArrayList<>(cores);
        Collections.reverse(coresInversas);
        for (String cor : coresInversas) {
            System.out.println(cor);
        }

        // Exibe todas as cores que começam com a letra "v"
        System.out.println("Cores do arco-íris que começam com a letra \"v\":");
        for (String cor : cores) {
            if (cor.startsWith("v")) {
                System.out.println(cor);
            }
        }

        // Remove todas as cores que não começam com a letra "v"
        Iterator<String> iterator = cores.iterator();
        while (iterator.hasNext()) {
            String cor = iterator.next();
            if (!cor.startsWith("v")) {
                iterator.remove();
            }
        }

        // Limpa o conjunto
        cores.clear();

        // Confere se o conjunto está vazio
        System.out.println("O conjunto de cores está vazio? " + cores.isEmpty());
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrimeInvestigation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> respostas = new ArrayList<>();
        int numRespostasPositivas = 0;

        System.out.println("Responda as seguintes perguntas com 'sim' ou 'nao':");

        System.out.print("Telefonou para a vítima? ");
        String resposta = scanner.next();
        respostas.add(resposta);
        if (resposta.equalsIgnoreCase("sim")) {
            numRespostasPositivas++;
        }

        System.out.print("Esteve no local do crime? ");
        resposta = scanner.next();
        respostas.add(resposta);
        if (resposta.equalsIgnoreCase("sim")) {
            numRespostasPositivas++;
        }

        System.out.print("Mora perto da vítima? ");
        resposta = scanner.next();
        respostas.add(resposta);
        if (resposta.equalsIgnoreCase("sim")) {
            numRespostasPositivas++;
        }

        System.out.print("Devia para a vítima? ");
        resposta = scanner.next();
        respostas.add(resposta);
        if (resposta.equalsIgnoreCase("sim")) {
            numRespostasPositivas++;
        }

        System.out.print("Já trabalhou com a vítima? ");
        resposta = scanner.next();
        respostas.add(resposta);
        if (resposta.equalsIgnoreCase("sim")) {
            numRespostasPositivas++;
        }

        if (numRespostasPositivas == 2) {
            System.out.println("Suspeita");
        } else if (numRespostasPositivas >= 3 && numRespostasPositivas <= 4) {
            System.out.println("Cúmplice");
        } else if (numRespostasPositivas == 5) {
            System.out.println("Assassina");
        } else {
            System.out.println("Inocente");
        }

        System.out.println("Respostas:");
        for (int i = 0; i < respostas.size(); i++) {
            System.out.println((i+1) + ": " + respostas.get(i));
        }

        scanner.close();
    }

}

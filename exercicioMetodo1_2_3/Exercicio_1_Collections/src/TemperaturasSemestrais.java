import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TemperaturasSemestrais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();
        double soma = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Digite a temperatura média do mês " + i + ": ");
            double temperatura = scanner.nextDouble();
            temperaturas.add(temperatura);
            soma += temperatura;
        }

        double mediaSemestral = soma / 6;
        System.out.println("A média semestral das temperaturas é: " + mediaSemestral);

        System.out.println("Temperaturas acima da média semestral: ");
        for (int i = 0; i < 6; i++) {
            if (temperaturas.get(i) > mediaSemestral) {
                switch (i) {
                    case 0:
                        System.out.println("Janeiro - " + temperaturas.get(i));
                        break;
                    case 1:
                        System.out.println("Fevereiro - " + temperaturas.get(i));
                        break;
                    case 2:
                        System.out.println("Março - " + temperaturas.get(i));
                        break;
                    case 3:
                        System.out.println("Abril - " + temperaturas.get(i));
                        break;
                    case 4:
                        System.out.println("Maio - " + temperaturas.get(i));
                        break;
                    case 5:
                        System.out.println("Junho - " + temperaturas.get(i));
                        break;
                }
            }
        }
    }
}

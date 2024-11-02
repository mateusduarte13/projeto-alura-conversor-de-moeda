
 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Api Api = new Api();
        Api.Json();



        JsonReader jsonReader = new JsonReader();
        ConversionRates rates = jsonReader.readConversionRates("response.json");









        boolean opcoes = true;
        while(opcoes){ System.out.println("\n***conversor de Moedas***");
                System.out.println("1. Dólar para Peso Argentino");
                System.out.println("2. Peso Argentino para Dólar ");
                System.out.println("3. Dólar para Real");
                System.out.println("4. Real para Dólar");
                System.out.println("5. Dólar para Peso Colombiano");
                System.out.println("6. Peso Colombiano para Dólar");
                System.out.println("7 Sair");
                System.out.println("Escola uma opção: ");

            Scanner scanner = new Scanner(System.in);

            int escolha = scanner.nextInt();
                  switch(escolha){

                      case 1:
                       System.out.print("Digite o valor em Dólares: ");
                      double valorDolar = scanner.nextDouble();
                      double resultadoPesoArg = valorDolar * rates.getARS();
                      System.out.println("Valor em Peso Argentino: " + resultadoPesoArg);
                      break;

                      case 2:
                          System.out.print("Digite o valor em Pesos Argentinos: ");
                          double valorPesoArg = scanner.nextDouble();
                          double resultadoDolar = valorPesoArg / rates.getARS();;
                          System.out.println("Valor em Dólares: " + resultadoDolar);
                          break;
                      case 3:
                          System.out.print("Digite o valor em Dólares: ");
                          valorDolar = scanner.nextDouble();
                          double resultadoReal = valorDolar * rates.getBRL();;
                          System.out.println("Valor em Reais: " + resultadoReal);
                          break;
                      case 4:
                          System.out.print("Digite o valor em Reais: ");
                          double valorReal = scanner.nextDouble();
                          resultadoDolar = valorReal / rates.getBRL();
                          System.out.println("Valor em Dólares: " + resultadoDolar);
                          break;
                      case 5:
                          System.out.print("Digite o valor em Dólares: ");
                          valorDolar = scanner.nextDouble();
                          double resultadoPesoCol = valorDolar *  rates.getCOP();
                          System.out.println("Valor em Peso Colombiano: " + resultadoPesoCol);
                          break;

                      case 6:
                          System.out.print("Digite o valor em Pesos Colombianos: ");
                          double valorPesoCol = scanner.nextDouble();
                          resultadoDolar = valorPesoCol / rates.getCOP();
                          System.out.println("Valor em Dólares: " + resultadoDolar);
                          break;
                      case 7:
                          opcoes = false;
                          System.out.println("Saindo do programa.");
                          break;
                      default:
                          System.out.println("Opção inválida. Tente novamente.");
                  }
        }
    }
}

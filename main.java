import java.util.InputMismatchException; // Importa a exceção específica
import java.util.Scanner;

// Classe para as operações aritméticas (não precisa ser public se estiver no mesmo arquivo)
class calculoArit {
    public double soma(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            // Lança uma exceção para o caso de divisão por zero
            throw new IllegalArgumentException("Não pode dividir por 0!");
        }
        return a / b;
    }
}

// Classe principal da calculadora
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Cria uma instância da classe calculoArit para usar seus métodos
        calculoArit operacoes = new calculoArit();

        System.out.println("---- CALCULADORA SIMPLES EM JAVA ---- ");

        int opera;
        double n1, n2;
        double result = 0;
        boolean continuar = true;

        while (continuar) { // Loop principal para que a calculadora continue funcionando
            try {
                System.out.print("\nDIGITE O PRIMEIRO NUMERO: ");
                n1 = scanner.nextDouble(); // Lê o primeiro número

                System.out.print("DIGITE O SEGUNDO NUMERO: ");
                n2 = scanner.nextDouble(); // Lê o segundo número

                System.out.println("\nESCOLHA A OPERACAO:");
                System.out.println("1 - SOMA (+)");
                System.out.println("2 - SUBTRACAO (-)");
                System.out.println("3 - MULTIPLICACAO (*)");
                System.out.println("4 - DIVISAO (/)");
                System.out.println("5 - SAIR");
                System.out.print("ESCOLHA A OPERACAO QUE GOSTARIA DE EXECUTAR: ");
                opera = scanner.nextInt(); // Lê a opção da operação

                // Usa o switch para direcionar para a operação correta
                switch (opera) {
                    case 1:
                        // CORREÇÃO: Chamar o método através da instância 'operacoes'
                        result = operacoes.soma(n1, n2);
                        System.out.println("RESULTADO: " + n1 + " + " + n2 + " = " + result);
                        break; // Importante para sair do switch

                    case 2:
                        // CORREÇÃO: Implementar a subtração
                        result = operacoes.subtrair(n1, n2);
                        System.out.println("RESULTADO: " + n1 + " - " + n2 + " = " + result);
                        break;

                    case 3:
                        // CORREÇÃO: Implementar a multiplicação
                        result = operacoes.multiplicar(n1, n2);
                        System.out.println("RESULTADO: " + n1 + " * " + n2 + " = " + result);
                        break;

                    case 4:
                        // CORREÇÃO: Implementar a divisão
                        // O método 'dividir' já lida com a divisão por zero lançando uma exceção
                        result = operacoes.dividir(n1, n2);
                        System.out.println("RESULTADO: " + n1 + " / " + n2 + " = " + result);
                        break;

                    case 5:
                        System.out.println("Saindo da calculadora. Até mais!");
                        continuar = false; // Define a flag para sair do loop while
                        break; // Importante para sair do switch

                    default:
                        // Mensagem para opções inválidas
                        System.out.println("Operação inválida. Por favor, escolha um número entre 1 e 5.");
                        break;
                }
            } catch (InputMismatchException e) {
                // Captura exceções se o usuário digitar algo que não é um número
                System.out.println("Entrada inválida! Por favor, digite apenas números.");
                scanner.next(); // IMPORTANTE: Consome a entrada inválida para evitar loop infinito
            } catch (IllegalArgumentException e) {
                // Captura a exceção lançada pelo método 'dividir' (divisão por zero)
                System.out.println(e.getMessage());
            }
            // Não é necessário um 'else' aqui, o 'while(continuar)' controla o loop
        }
        scanner.close(); // Fecha o scanner ao sair do loop e do programa
    }
}import java.util.InputMismatchException; // Importa a exceção específica
import java.util.Scanner;

// Classe para as operações aritméticas (não precisa ser public se estiver no mesmo arquivo)
class calculoArit {
    public double soma(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            // Lança uma exceção para o caso de divisão por zero
            throw new IllegalArgumentException("Não pode dividir por 0!");
        }
        return a / b;
    }
}

// Classe principal da calculadora
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Cria uma instância da classe calculoArit para usar seus métodos
        calculoArit operacoes = new calculoArit();

        System.out.println("---- CALCULADORA SIMPLES EM JAVA ---- ");

        int opera;
        double n1, n2;
        double result = 0;
        boolean continuar = true;

        while (continuar) { // Loop principal para que a calculadora continue funcionando
            try {
                System.out.print("\nDIGITE O PRIMEIRO NUMERO: ");
                n1 = scanner.nextDouble(); // Lê o primeiro número

                System.out.print("DIGITE O SEGUNDO NUMERO: ");
                n2 = scanner.nextDouble(); // Lê o segundo número

                System.out.println("\nESCOLHA A OPERACAO:");
                System.out.println("1 - SOMA (+)");
                System.out.println("2 - SUBTRACAO (-)");
                System.out.println("3 - MULTIPLICACAO (*)");
                System.out.println("4 - DIVISAO (/)");
                System.out.println("5 - SAIR");
                System.out.print("ESCOLHA A OPERACAO QUE GOSTARIA DE EXECUTAR: ");
                opera = scanner.nextInt(); // Lê a opção da operação

                // Usa o switch para direcionar para a operação correta
                switch (opera) {
                    case 1:
                        // CORREÇÃO: Chamar o método através da instância 'operacoes'
                        result = operacoes.soma(n1, n2);
                        System.out.println("RESULTADO: " + n1 + " + " + n2 + " = " + result);
                        break; // Importante para sair do switch

                    case 2:
                        // CORREÇÃO: Implementar a subtração
                        result = operacoes.subtrair(n1, n2);
                        System.out.println("RESULTADO: " + n1 + " - " + n2 + " = " + result);
                        break;

                    case 3:
                        // CORREÇÃO: Implementar a multiplicação
                        result = operacoes.multiplicar(n1, n2);
                        System.out.println("RESULTADO: " + n1 + " * " + n2 + " = " + result);
                        break;

                    case 4:
                        // CORREÇÃO: Implementar a divisão
                        // O método 'dividir' já lida com a divisão por zero lançando uma exceção
                        result = operacoes.dividir(n1, n2);
                        System.out.println("RESULTADO: " + n1 + " / " + n2 + " = " + result);
                        break;

                    case 5:
                        System.out.println("Saindo da calculadora. Até mais!");
                        continuar = false; // Define a flag para sair do loop while
                        break; // Importante para sair do switch

                    default:
                        // Mensagem para opções inválidas
                        System.out.println("Operação inválida. Por favor, escolha um número entre 1 e 5.");
                        break;
                }
            } catch (InputMismatchException e) {
                // Captura exceções se o usuário digitar algo que não é um número
                System.out.println("Entrada inválida! Por favor, digite apenas números.");
                scanner.next(); // IMPORTANTE: Consome a entrada inválida para evitar loop infinito
            } catch (IllegalArgumentException e) {
                // Captura a exceção lançada pelo método 'dividir' (divisão por zero)
                System.out.println(e.getMessage());
            }
            // Não é necessário um 'else' aqui, o 'while(continuar)' controla o loop
        }
        scanner.close(); // Fecha o scanner ao sair do loop e do programa
    }
}

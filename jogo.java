import java.util.Scanner;

public class JogoJokenpo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] opcoes = {"pedra", "papel", "tesoura"};

        System.out.println("Bem-vindo ao Jogo de Jokenpô!");
        System.out.println("Escolha uma opção: pedra, papel ou tesoura.");

        while (true) {
            System.out.print("Sua escolha: ");
            String escolhaJogador = scanner.nextLine().toLowerCase();

            if (!escolhaValida(escolhaJogador)) {
                System.out.println("Escolha inválida. Por favor, escolha entre pedra, papel ou tesoura.");
                continue;
            }

            String escolhaComputador = opcoes[(int) (Math.random() * 3)];
            System.out.println("Computador escolheu: " + escolhaComputador);

            if (escolhaJogador.equals(escolhaComputador)) {
                System.out.println("Empate!");
            } else if ((escolhaJogador.equals("pedra") && escolhaComputador.equals("tesoura")) ||
                       (escolhaJogador.equals("papel") && escolhaComputador.equals("pedra")) ||
                       (escolhaJogador.equals("tesoura") && escolhaComputador.equals("papel"))) {
                System.out.println("Você venceu!");
            } else {
                System.out.println("Você perdeu!");
            }

            System.out.print("Deseja jogar novamente? (s/n): ");
            String jogarNovamente = scanner.nextLine();
            if (!jogarNovamente.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("Obrigado por jogar!");
        scanner.close();
    }

    private static boolean escolhaValida(String escolha) {
        return escolha.equals("pedra") || escolha.equals("papel") || escolha.equals("tesoura");
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorTarefas {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao GERENCIADOR LEGADO DE TAREFAS - Membro(Pedro) 3!");
        System.out.println("Este código não usa classes e métodos para simular um projeto antigo.");

        ArrayList<String> tarefas = new ArrayList<>();
        ArrayList<String> detalhes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String entrada = "";

        while (true) {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Excluir Tarefa");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            entrada = scanner.nextLine();

            if (entrada.equals("1")) {
                if (tarefas.isEmpty()) {
                    System.out.println("Nenhuma tarefa para excluir.");
                } else {
                    System.out.println("\n--- Excluir Tarefa ---");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + ". " + tarefas.get(i));
                    }
                    System.out.print("Digite o número da tarefa que deseja excluir: ");
                    try {
                        int indice = Integer.parseInt(scanner.nextLine());
                        if (indice >= 1 && indice <= tarefas.size()) {
                            String removida = tarefas.remove(indice - 1);
                            detalhes.remove(indice - 1);
                            System.out.println("Tarefa \"" + removida + "\" excluída com sucesso!");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida. Digite um número.");
                    }
                }
            } else if (entrada.equals("2")) {
                System.out.println("Saindo do programa. Até mais!");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
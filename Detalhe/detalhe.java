import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorTarefasMembro3EvertonEJoao {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao GERENCIADOR LEGADO DE TAREFAS - Membro(Pedro) 3!");
        System.out.println("Este código não usa classes e métodos para simular um projeto antigo.");

        ArrayList<String> tarefas = new ArrayList<>();
        ArrayList<String> detalhes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String entrada = "";

        while (true) {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Listar Tarefas");
            System.out.println("2. Adicionar Tarefa");
            System.out.println("3. Excluir Tarefa");
            System.out.println("4. Detalhes da Tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            entrada = scanner.nextLine();

            if (entrada.equals("1")) {
                System.out.println("\n--- Lista de Tarefas ---");
                if (tarefas.isEmpty()) {
                    System.out.println("Nenhuma tarefa cadastrada.");
                } else {
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + ". " + tarefas.get(i));
                    }
                }

            } else if (entrada.equals("2")) {
                System.out.print("Digite o título da tarefa: ");
                String novaTarefa = scanner.nextLine();
                if (!novaTarefa.trim().isEmpty()) {
                    System.out.print("Digite os detalhes da tarefa: ");
                    String descricao = scanner.nextLine();
                    tarefas.add(novaTarefa);
                    detalhes.add(descricao);
                    System.out.println("Tarefa adicionada com sucesso!");
                } else {
                    System.out.println("Tarefa inválida. Tente novamente.");
                }

            } else if (entrada.equals("3")) {
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

            } else if (entrada.equals("4")) {
                if (tarefas.isEmpty()) {
                    System.out.println("Nenhuma tarefa cadastrada para exibir detalhes.");
                } else {
                    System.out.println("\n--- Detalhes da Tarefa ---");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + ". " + tarefas.get(i));
                    }
                    System.out.print("Digite o número da tarefa que deseja ver os detalhes: ");
                    try {
                        int indice = Integer.parseInt(scanner.nextLine());
                        if (indice >= 1 && indice <= tarefas.size()) {
                            System.out.println("\nTarefa: " + tarefas.get(indice - 1));
                            System.out.println("Detalhes: " + detalhes.get(indice - 1));
                        } else {
                            System.out.println("Número inválido.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida. Digite um número.");
                    }
                }

            } else if (entrada.equals("5")) {
                System.out.println("Saindo do programa. Até mais!");
                break;

            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
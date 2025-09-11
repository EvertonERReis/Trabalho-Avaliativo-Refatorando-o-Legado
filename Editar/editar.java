import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorTarefas {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao GERENCIADOR SIMPLES DE TAREFAS!");
        System.out.println("Versão reduzida sem detalhes, adicionar, listar e excluir.");

        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String entrada = "";

        while (true) {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Editar Tarefa");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            entrada = scanner.nextLine();

            if (entrada.equals("1")) {
                if (tarefas.isEmpty()) {
                    System.out.println("Nenhuma tarefa cadastrada para editar.");
                } else {
                    System.out.println("\n--- Editar Tarefa ---");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + ". " + tarefas.get(i));
                    }
                    System.out.print("Digite o número da tarefa que deseja editar: ");
                    try {
                        int indice = Integer.parseInt(scanner.nextLine());
                        if (indice >= 1 && indice <= tarefas.size()) {
                            System.out.println("Tarefa atual: " + tarefas.get(indice - 1));
                            System.out.print("Novo título (ou deixe em branco para não alterar): ");
                            String novoTitulo = scanner.nextLine();
                            if (!novoTitulo.trim().isEmpty()) {
                                tarefas.set(indice - 1, novoTitulo);
                            }
                            System.out.println("Tarefa atualizada com sucesso!");
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

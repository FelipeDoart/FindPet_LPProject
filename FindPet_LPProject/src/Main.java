
import controller.*;

import java.util.Scanner;;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AdotantesController controller = new AdotantesController();
        AdminController adminController = new AdminController();
        FormularioController form = new FormularioController();
        AnimalController anim = new AnimalController();
        CatalogoController cata = new CatalogoController();

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("======================");
            System.out.println("\nBem Vindo ao FindPet!");
            System.out.println("======================");
            System.out.println("1 - Quero adotar!");
            System.out.println("2 - Quero ser voluntário!");
            System.out.println("3 - Login Administrativo");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("\n--- Cadastro Adotantes ---");
                    System.out.print("Nome: ");
                    String nome1 = sc.nextLine();
                    System.out.print("Email: ");
                    String email1 = sc.nextLine();
                    System.out.print("Telefone (opcional): ");
                    String tel1 = sc.nextLine();
                    controller.cadastrarPessoaComum(nome1, email1, tel1);
                    break;
                case 2:
                    System.out.println("\n--- Cadastro Voluntário ---");
                    System.out.print("Nome: ");
                    String nome2 = sc.nextLine();
                    System.out.print("Email: ");
                    String email2 = sc.nextLine();
                    System.out.print("Telefone (OBRIGATÓRIO): ");
                    String tel2 = sc.nextLine();
                    controller.cadastrarVoluntario(nome2, email2, tel2);
                    break;

                case 3:
                    System.out.println("\n=== LOGIN ADMIN ===");
                    System.out.print("Usuário: ");
                    String usuario = sc.nextLine();

                    System.out.print("Senha: ");
                    String senha = sc.nextLine();

                    if (adminController.loginAdmin(usuario, senha)) {
                        System.out.println("\nLogin bem-sucedido!");

                        int opcaoAdmin;
                        do {
                            adminController.mostrarMenuAdmin();
                            System.out.print("Escolha: ");
                            System.out.println("1 - Lista de pedidos de adoção");
                            System.out.println("2 - Remover animais");
                            System.out.println("0 - Deslogar");
                            opcaoAdmin = sc.nextInt();
                            sc.nextLine();

                            switch (opcaoAdmin) {
                                case 1:
                                    System.out.println("===================");
                                    System.out.println("Lista de pedidos:");
                                    form.listarFormularios();
                                    break;
                                case 2:
                                    System.out.println("===================");
                                    System.out.println("Listando os animais:");
                                    cata.listarCatalogo();
                                    System.out.println("===================");
                                    System.out.println("Insira o ID a ser excluido:");
                                    cata.excluir(sc.nextInt());
                                    break;
                                case 0:
                                    System.out.println("Saindo do menu admin...");
                                    break;
                            }
                        } while (opcaoAdmin != 0);

                    } else {
                        System.out.println("Usuário ou senha incorretos.");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }sc.close();}

}
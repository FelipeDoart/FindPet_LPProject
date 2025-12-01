import enums.*;
import controller.*;

import java.util.Scanner;;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AdotantesController controller = new AdotantesController();
        AdminController adminController = new AdminController();
        FormularioController form = new FormularioController(controller);
        CatalogoController cata = new CatalogoController();// <-- APENAS UMA INSTÂNCIA
        AnimalController anim = new AnimalController();


        int opcao = 0;

        while (opcao != 4) {
            System.out.println("======================");
            System.out.println("\nBem Vindo ao FindPet!");
            System.out.println("======================");
            System.out.println("1 - Quero adotar!");
            System.out.println("2 - Quero ser voluntário!");
            System.out.println("3 - Login Administrativo");
            System.out.println("0 - Sair");
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

                    int opcao2 = -1;
                    while (opcao2 != 0) {
                        System.out.println("\n=== Menu do Adotante ===");
                        System.out.println("1 - Ver catálogo de animais");
                        System.out.println("2 - Enviar formulário de adoção");
                        System.out.println("3 - Filtrar Animais");
                        System.out.println("0 - Voltar ao menu inicial");
                        System.out.print("Escolha: ");
                        opcao2 = sc.nextInt();
                        sc.nextLine();

                        switch (opcao2) {
                            case 1:
                                anim.listar().forEach(System.out::println);
                                break;
                            case 2:
                                System.out.println("ID do Animal");
                                int idanimal = sc.nextInt();
                                sc.nextLine(); // limpa buffer
                                System.out.println("Insira o CPF");
                                String CPF = sc.nextLine();
                                System.out.println("Insira o endereco");
                                String endereco = sc.nextLine();
                                form.enviarFormulario(idanimal,CPF,endereco);
                                break;

                            case 3:
                                System.out.println("Espécie (CACHORRO/GATO/PASSARO):");
                                String espec = sc.nextLine();
                                anim.filtrar(espec).forEach(System.out::println);
                            break;

                            case 0:
                                System.out.println("Voltando...");
                                continue;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("\n--- Cadastro Voluntário ---");
                    System.out.print("Nome: ");
                    String nome2 = sc.nextLine();
                    System.out.print("Email: ");
                    String email2 = sc.nextLine();
                    System.out.print("Telefone: ");
                    String tel2 = sc.nextLine();
                    controller.cadastrarVoluntario(nome2, email2, tel2);

                    int op = -1;
                    while (op != 0) {
                        System.out.println("\n===== MENU =====");
                        System.out.println("1 - Cadastrar Cachorro");
                        System.out.println("2 - Cadastrar Gato");
                        System.out.println("3 - Cadastrar Pássaro");
                        System.out.println("4 - Listar Animais");
                        System.out.println("5 - Atualizar Situação");
                        System.out.println("6 - Filtrar por espécie");
                        System.out.println("0 - Sair");
                        System.out.print("Opção: ");
                        op = sc.nextInt();
                        sc.nextLine();

                        switch (op) {

                            case 1:
                                System.out.println("Nome:");
                                String nomeC = sc.nextLine();
                                System.out.println("Raça:");
                                String racaC = sc.nextLine();
                                System.out.println("Idade:");
                                int idadeC = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Gênero (M/F):");
                                String generoC = sc.nextLine();
                                System.out.println("Localização:");
                                String localC = sc.nextLine();

                                anim.cadastrarCachorro(
                                        nomeC, racaC, idadeC,
                                        Genero.valueOf(generoC),
                                        localC
                                );
                                break;

                            case 2:
                                System.out.println("Nome:");
                                String nomeG = sc.nextLine();
                                System.out.println("Raça:");
                                String racaG = sc.nextLine();
                                System.out.println("Idade:");
                                int idadeG = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Gênero (M/F):");
                                String generoG = sc.nextLine();
                                System.out.println("Localização:");
                                String localG = sc.nextLine();

                                anim.cadastrarGato(
                                        nomeG, racaG, idadeG,
                                        Genero.valueOf(generoG),
                                        localG
                                );
                                break;

                            case 3:
                                System.out.println("Nome:");
                                String nomeP = sc.nextLine();
                                System.out.println("Raça:");
                                String racaP = sc.nextLine();
                                System.out.println("Idade:");
                                int idadeP = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Gênero (M/F):");
                                String generoP = sc.nextLine();
                                System.out.println("Localização:");
                                String localP = sc.nextLine();

                                anim.cadastrarPassaro(
                                        nomeP, racaP, idadeP,
                                        Genero.valueOf(generoP),
                                        localP
                                );
                                break;

                            case 4:
                                anim.listar().forEach(System.out::println);
                                break;

                            case 5:
                                System.out.println("ID:");
                                int idSit = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Nova situação:");
                                String sit = sc.nextLine();
                                anim.atualizarSituacao(idSit, sit);
                                break;

                            case 6:
                                System.out.println("Espécie (CACHORRO/GATO/PASSARO):");
                                String espec = sc.nextLine();
                                anim.filtrar(espec).forEach(System.out::println);
                                break;
                            case 0:
                                System.out.println("Saindo...");
                                break;

                            default:
                                System.out.println("Opção inválida!");
                        }
                    }
                    break;

                case 3:
                    System.out.println("=== LOGIN ADMIN ===");
                    System.out.print("Usuário: ");
                    String usuario = sc.nextLine();

                    System.out.print("Senha: ");
                    String senha = sc.nextLine();

                    if (adminController.loginAdmin(usuario, senha)) {
                        System.out.println("Login bem-sucedido!");

                        int opcaoAdmin;
                        do {
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
                                    form.listarFormularios().forEach(System.out::println);
                                    break;
                                case 2:
                                    System.out.println("===================");
                                    System.out.println("Listando os animais:");
                                    cata.listarCatalogo();
                                    System.out.println("===================");
                                    System.out.println("Insira o ID a ser excluido:");
                                    cata.excluir(sc.nextInt());
                                    cata.listarCatalogo();
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

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }sc.close();}
}
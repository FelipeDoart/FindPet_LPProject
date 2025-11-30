import enums.*;
import controller.*;

import java.util.Scanner;;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AdotantesController controller = new AdotantesController();
        AdminController adminController = new AdminController();
        FormularioController form = new FormularioController();
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

                    int opcao2 = -1;
                    while (opcao2 != 0) {
                        System.out.println("\n=== Menu do Adotante ===");
                        System.out.println("1 - Ver catálogo de animais");
                        System.out.println("2 - Enviar formulário de adoção");
                        System.out.println("0 - Voltar ao menu inicial");
                        System.out.print("Escolha: ");
                        opcao2 = sc.nextInt();
                        sc.nextLine();

                        switch (opcao2) {
                            case 1:
                                cata.listarCatalogo();
                                break;
                            case 2:

                                System.out.println("Insira o id do animal");
                                int idanimal = sc.nextInt();
                                System.out.println("Insira o nome");
                                String nome = sc.nextLine();
                                System.out.println("Insira o Email");
                                String Email = sc.nextLine();
                                System.out.println("Insira o Telefone");
                                String telefone = sc.nextLine();
                                System.out.println("Insira o CPF");
                                String CPF = sc.nextLine();
                                System.out.println("Insira o endereco");
                                String endereco = sc.nextLine();
                                form.iniciarProcessoAdocao(idanimal,nome,Email,telefone,CPF,endereco);
                                break;
                            case 0:
                                System.out.println("Voltando...");
                                continue;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    }
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

                        System.out.println("\n=== Menu do Voluntário ===");
                        System.out.println("1 - Cadastrar CACHORRO");
                        System.out.println("2 - Cadastrar GATO");
                        System.out.println("3 - Cadastrar PÁSSARO");
                        System.out.println("4 - Listar animais");
                        System.out.println("5 - Atualizar situação do animal");
                        System.out.println("6 - Excluir animal");
                        System.out.println("0 - Voltar");
                        System.out.print("Escolha: ");

                        op = sc.nextInt();
                        sc.nextLine();

                        switch (op) {
                            //String nome, String raca, int idade, Genero genero, String local
                            case 1:
                                System.out.println("Nome do animal");
                                String nome = sc.nextLine();
                                System.out.println("Raça do animal");
                                String raca = sc.nextLine();
                                System.out.println("Idade do animal");
                                int idade = sc.nextInt();
                                System.out.println("Genero do animal");
                                Genero gen = Genero.valueOf(sc.next());
                                System.out.println("Local onde foi encontrado");
                                String local = sc.nextLine();
                                anim.cadastrarCachorro(nome,raca,idade,gen,local);
                                break;

                            case 2:
                                System.out.println("Nome do animal");
                                String Gnome = sc.nextLine();
                                System.out.println("Raça do animal");
                                String Graca = sc.nextLine();
                                System.out.println("Idade do animal");
                                int Gidade = sc.nextInt();
                                System.out.println("Genero do animal");
                                Genero Ggen = Genero.valueOf(sc.next());
                                System.out.println("Local onde foi encontrado");
                                String Glocal = sc.nextLine();
                                anim.cadastrarCachorro(Gnome,Graca,Gidade,Ggen,Glocal);
                                break;

                            case 3:
                                System.out.println("Nome do animal");
                                String Pnome = sc.nextLine();
                                System.out.println("Raça do animal");
                                String Praca = sc.nextLine();
                                System.out.println("Idade do animal");
                                int Pidade = sc.nextInt();
                                System.out.println("Genero do animal");
                                Genero Pgen = Genero.valueOf(sc.next());
                                System.out.println("Local onde foi encontrado");
                                String Plocal = sc.nextLine();
                                anim.cadastrarCachorro(Pnome,Praca,Pidade,Pgen,Plocal);
                                break;
                            case 4:
                                anim.listar();
                                break;
                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;

                            default:
                                System.out.println("Opção inválida!");
                        }
                    }

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

                case 4:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }sc.close();}
}
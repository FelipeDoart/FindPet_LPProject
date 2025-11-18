
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int esc;
        String nomeadm;
        String nome;
        String email;
        int senha;

        System.out.println("======================");
        System.out.println("Bem vindo ao FindPet!");
        System.out.println("======================");
        do {
            System.out.println("Por favor, indentifique-se.");
            System.out.println("1 - Sou cliente");
            System.out.println("2 - Login Administrativo");
            esc = sc.nextInt();

            switch (esc){
                case 1:
                    System.out.println("===============");
                    System.out.println("Preencha as linhas");
                    System.out.println("Nome:");
                    sc.nextLine();
                    System.out.println("---------");
                    System.out.println("E-mail:");
                    sc.nextLine();
                    System.out.println("---------");
                    return;

                case 2:
                    System.out.println("===============");
                    System.out.println("Preencha as linhas");
                    System.out.println("E-mail:");
                    email = sc.nextLine();
                    System.out.println("---------");
                    System.out.println("Senha:");
                    senha = sc.nextInt();
                    System.out.println("---------");
                    return;
            }
        }while (true);
        if (email == email){
            do {
                System.out.println("=====================");
                System.out.println("Bem vindo, senhor(a)" + nomeadm + ".");
                System.out.println("=====================");
                System.out.println("Opções:");
                System.out.println("1 - Gerenciar catalogo");
                System.out.println("2 - Lista de pedidos de adoção");
                System.out.println("=====================");
                esc = sc.nextInt();
                switch (esc){
                    case 1:

                }
            }while(true);
        }
    }
}
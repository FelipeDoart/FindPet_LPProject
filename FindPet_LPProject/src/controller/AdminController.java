package controller;
import service.AdminService;

public class AdminController {

    private AdminService adminService = new AdminService();

    public boolean loginAdmin(String usuario, String senha) {
        return adminService.fazerLogin(usuario, senha);
    }

    public void mostrarMenuAdmin() {
        System.out.println("\n=== MENU ADMINISTRATIVO ===");
        System.out.println("1 - Listar adotantes");
        System.out.println("2 - Listar voluntários");
        System.out.println("3 - Listar animais");
        System.out.println("4 - Remover cadastro");
        System.out.println("0 - Sair");
        System.out.println("===========================");
    }
}

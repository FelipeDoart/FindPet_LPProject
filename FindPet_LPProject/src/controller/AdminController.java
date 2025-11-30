package controller;
import service.AdminService;

public class AdminController {

    private AdminService adminService = new AdminService();

    public boolean loginAdmin(String usuario, String senha) {
        return adminService.fazerLogin(usuario, senha);
    }
}
//feaffafeafafa
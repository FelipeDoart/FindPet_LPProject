package service;

import model.Admin;

public class AdminService {

    private Admin admin = new Admin();

    public boolean fazerLogin(String usuarioDigitado, String senhaDigitada) {
        return admin.getUsuario().equals(usuarioDigitado)
                && admin.getSenha().equals(senhaDigitada);
    }
}

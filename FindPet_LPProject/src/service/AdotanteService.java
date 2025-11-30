package service;

import controller.CatalogoController;
import controller.FormularioController;
import model.Adotante;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdotanteService {

    private List<Adotante> adotantes = new ArrayList<>();

    public void adicionarAdotante(Adotante a) {
        adotantes.add(a);
    }

    public void listarAdotantes() {
        if (adotantes.isEmpty()) {
            System.out.println("Nenhum adotante cadastrado.");
            return;
        }

        for (Adotante a : adotantes) {
            System.out.println(a.getTipoAdotante()
                    + " - Nome: " + a.getNome()
                    + " | Email: " + a.getEmail()
                    + " | Telefone: " + a.getTelefone());
        }
    }
}

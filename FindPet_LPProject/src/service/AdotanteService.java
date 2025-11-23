package service;

import model.Adotante;
import java.util.ArrayList;
import java.util.List;

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

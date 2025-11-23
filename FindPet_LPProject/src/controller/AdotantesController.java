package controller;


import model.pessoaAdot;
import model.Voluntario;
import service.AdotanteService;

public class AdotantesController {

    private AdotanteService adotanteService = new AdotanteService();

    public void cadastrarPessoaComum(String nome, String email, String telefone) {
        pessoaAdot pessoa = new pessoaAdot(nome, email, telefone);
        adotanteService.adicionarAdotante(pessoa);
    }

    public void cadastrarVoluntario(String nome, String email, String telefone) {

        if (telefone == null || telefone.isBlank()) {
            System.out.println("Telefone é obrigatório para voluntários!");
            return;
        }

        Voluntario vol = new Voluntario(nome, email, telefone);
        adotanteService.adicionarAdotante(vol);
    }

    public void listarAdotantes() {
        adotanteService.listarAdotantes();
    }
}



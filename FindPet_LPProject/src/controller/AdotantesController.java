package controller;

import model.Adotante;
import model.Voluntario;
import service.AdotanteService;

public class AdotantesController {

    private final AdotanteService adotanteService = new AdotanteService();

    // Adotante atualmente logado (somente Pessoa Comum)
    private Adotante adotanteAtual;

    // Cadastro de adotante comum
    public void cadastrarPessoaComum(String nome, String email, String telefone) {

        Adotante adotante = new Adotante(nome, email, telefone) {
            @Override
            public String getTipoAdotante() {
                return "";
            }
        };

        // Guarda para uso no formulário de adoção
        this.adotanteAtual = adotante;

        // Salva no service
        adotanteService.adicionarAdotante(adotante);

        System.out.println("Adotante comum cadastrado com sucesso!");
    }

    public Adotante getAdotanteLogado() {
        return adotanteAtual;
    }


    // Cadastro de voluntário
    public void cadastrarVoluntario(String nome, String email, String telefone) {

        if (telefone == null || telefone.isBlank()) {
            System.out.println("Telefone é obrigatório para voluntários!");
            return;
        }

        Voluntario vol = new Voluntario(nome, email, telefone);

        adotanteService.adicionarAdotante(vol);

        System.out.println("Voluntário cadastrado com sucesso!");
    }

    public void listarAdotantes() {
        adotanteService.listarAdotantes();
    }
}

package controller;

import model.Adotante;
import model.FormularioAdocao;
import service.FormularioAdocaoService;
import service.AnimalService;

import java.util.List;

public class FormularioController {

    private final FormularioAdocaoService service;
    private final AdotantesController adotantes;

    public FormularioController(AdotantesController adotantes) {
        this.adotantes = adotantes;
        this.service = new FormularioAdocaoService(AnimalService.getInstance());
    }

    public void enviarFormulario(int idAnimal, String cpf, String endereco) {

        Adotante a = adotantes.getAdotanteLogado();

        if (a == null) {
            System.out.println("Nenhum adotante logado.");
            return;
        }

        service.criarFormulario(a, idAnimal, cpf, endereco);
    }

    public List<FormularioAdocao> listarFormularios() {
        return service.listarFormularios();
    }
}



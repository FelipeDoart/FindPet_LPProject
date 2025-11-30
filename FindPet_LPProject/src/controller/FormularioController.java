package controller;

import model.Adotante;
import model.FormularioAdocao;
import service.FormularioAdocaoService;
import service.AnimalService;
import java.util.List;

public class FormularioController {

    private FormularioAdocaoService formularioService;
    private AnimalService animalService;

    public FormularioController() {
        this.animalService = new AnimalService();
        this.formularioService = new FormularioAdocaoService();
    }

    // Endpoint para iniciar o processo de adoção
    public void iniciarProcessoAdocao(Adotante adotante, String cpf, String endereco, int idAnimal) {
        formularioService.iniciarProcessoAdocao(adotante, idAnimal, cpf, endereco);
    }

    // Endpoint para listar todos os formulários já enviados
    public List<FormularioAdocao> listarFormularios() {
        return formularioService.getFormularios();
    }

    // Endpoint para consultar um animal pelo ID
    public void consultarAnimal(int id) {
        if (animalService.listarAnimais().isEmpty()) {
            System.out.println("Nenhum animal cadastrado!");
            return;
        }

        var animal = formularioService.escolherAnimal(id);
        if (animal != null) {
            System.out.println("Animal encontrado: " + animal.getNome());
        }
    }
}

package service;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class FormularioAdocaoService {

    private List<FormularioAdocao> formularios = new ArrayList<>();
    private AnimalService animalService;

    // Agora o service RECEBE o AnimalService
    public FormularioAdocaoService(AnimalService animalService) {
        this.animalService = animalService;
    }

    public void adicionarFormulario(FormularioAdocao f) {
        formularios.add(f);
    }

    public List<FormularioAdocao> listarFormularios() {
        return formularios;
    }

    public Animal escolherAnimal(int id) {
        for (Animal a : animalService.listarAnimais()) {
            if (a.getId() == id) {
                return a;
            }
        }

        System.out.println("Animal não encontrado ou já adotado!");
        return null;
    }

    public void criarFormulario(Adotante adotante, int idAnimal, String cpf, String endereco) {

        Animal escolhido = escolherAnimal(idAnimal);

        if (escolhido == null) return;

        FormularioAdocao f = new FormularioAdocao(adotante, escolhido, cpf, endereco, "Hoje");

        formularios.add(f);

        animalService.atualizarSituacao(idAnimal, "ADOTADO");

        System.out.println("Formulário enviado!");
    }

}

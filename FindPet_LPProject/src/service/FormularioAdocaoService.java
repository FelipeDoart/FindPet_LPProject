package service;
import model.*;
import service.*;
import java.util.ArrayList;
import java.util.List;
import model.FormularioAdocao;

public class FormularioAdocaoService {

    private List<FormularioAdocao> formularios = new ArrayList<>();
    private AnimalService animalService;

    public void adicionarFormulario(FormularioAdocao f) {formularios.add(f);}

    public List<FormularioAdocao> listarFormularios() {return formularios;}

    public Animal escolherAnimal(int id) {
        for (Animal a : animalService.listarAnimais()) {
            if (a.getId() == id) {
                return a;
            }
        }

        System.out.println("Animal não encontrado ou já adotado!");
        return null;
    }
    public void iniciarProcessoAdocao(Adotante adotante, int idAnimal, String cpf, String endereco) {

        Animal escolhido = escolherAnimal(idAnimal);

        if (escolhido == null) {
            return; // animal não existe
        }

        // Criar o formulário
        FormularioAdocao form = new FormularioAdocao(
                adotante.getNome(),
                adotante.getEmail(),
                adotante.getTelefone(),
                cpf,
                endereco,
                escolhido
        );

        // Salvar formulário
        adicionarFormulario(form);

        // Atualizar status do animal
        animalService.atualizarSituacao(idAnimal, "ADOTADO");

        System.out.println("Adoção registrada com sucesso!");
    }
}

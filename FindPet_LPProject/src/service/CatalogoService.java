package service;

import model.Animal;
import java.util.ArrayList;
import java.util.List;

public class CatalogoService {

    private List<Animal> catalogo = new ArrayList<>();

    public void adicionar(Animal animal) {
        catalogo.add(animal);
        System.out.println("Adicionado ao catálogo!");
    }

    public List<Animal> listarCatalogo() {
        return catalogo;
    }

    public Animal buscarPorNome(String nome) {
        for (Animal a : catalogo) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                return a;
            }
        }
        return null;
    }

    public void atualizarAnimal(String nome, String novoNome, String novaRaca, int novaIdade, String novaLocalizacao) {
        Animal a = buscarPorNome(nome);

        if (a == null) {
            System.out.println("Animal não encontrado no catálogo.");
            return;
        }

        a.nome = novoNome;
        a.raca = novaRaca;
        a.idade = novaIdade;
        a.localizacao = novaLocalizacao;

        System.out.println("Animal atualizado no catálogo!");
    }

    public void excluir(int id) {
        catalogo.removeIf(a -> a.getId() == id);
        System.out.println("Animal removido do catálogo!");
    }

}

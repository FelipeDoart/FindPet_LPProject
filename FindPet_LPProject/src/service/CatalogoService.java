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

    public Animal buscarPorId(int id) {
        return catalogo.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void atualizarAnimal(int id, String novoNome, String novaRaca, int novaIdade, String novaLocalizacao) {

        Animal a = buscarPorId(id);

        if (a == null) {
            System.out.println("Animal não encontrado no catálogo.");
            return;
        }

        a.setNome(novoNome);
        a.setRaca(novaRaca);
        a.setIdade(novaIdade);
        a.setLocalizacao(novaLocalizacao);

        System.out.println("Animal atualizado no catálogo!");
    }

    public void excluir(int id) {
        boolean removido = catalogo.removeIf(a -> a.getId() == id);

        if (removido) {
            System.out.println("Animal removido do catálogo!");
        } else {
            System.out.println("ID não encontrado.");
        }
    }
}

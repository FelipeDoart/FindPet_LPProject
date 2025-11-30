package controller;

import model.Animal;
import service.CatalogoService;
import java.util.List;

public class CatalogoController {

    private CatalogoService catalogoService = new CatalogoService();

    public void adicionarAoCatalogo(Animal animal) {
        catalogoService.adicionar(animal);
    }

    public List<Animal> listarCatalogo() {
        return catalogoService.listarCatalogo();
    }

    public void atualizarAnimal(String nome, String novoNome, String novaRaca, int novaIdade, String novaLocal) {
        catalogoService.atualizarAnimal(nome, novoNome, novaRaca, novaIdade, novaLocal);
    }

    public void excluir(String nome) {
        catalogoService.excluir(nome);
    }
}

package controller;

import model.Animal;
import service.CatalogoService;

public class CatalogoController {

    private CatalogoService catalogoService = new CatalogoService();

    public void adicionarAoCatalogo(Animal animal) {
        catalogoService.adicionar(animal);
    }

    public void listarCatalogo() {
        var lista = catalogoService.listarCatalogo();

        if (lista.isEmpty()) {
            System.out.println("Nenhum animal no catálogo.");
            return;
        }

        System.out.println("\n=== CATALOGO DE ANIMAIS ===");
        for (Animal a : lista) {
            System.out.println("ID: " + a.getId() +
                    " | Nome: " + a.getNome() +
                    " | Raça: " + a.getRaca() +
                    " | Idade: " + a.getIdade() +
                    " | Localização: " + a.getLocalizacao());
        }
    }

    public void atualizarAnimal(int id, String novoNome, String novaRaca, int novaIdade, String novaLocal) {
        catalogoService.atualizarAnimal(id, novoNome, novaRaca, novaIdade, novaLocal);
    }

    public void excluir(int id) {
        catalogoService.excluir(id);
    }
}

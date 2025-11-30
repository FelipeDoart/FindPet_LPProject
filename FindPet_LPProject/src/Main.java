import controller.AnimalController;
import controller.CatalogoController;
import enums.Genero;
import Interfaces.Comportamento;
import Interfaces.Registravel;
import model.Animal;

public class Main {
    public static void main(String[] args) {

        AnimalController animalCtrl = new AnimalController();
        CatalogoController catalogoCtrl = new CatalogoController();

        // Cadastro
        animalCtrl.cadastrarCachorro("Rex", "Vira-lata", 3, Genero.Masculino, "Centro");
        animalCtrl.cadastrarGato("Mimi", "SRD", 2, Genero.Femenino, "Bairro Alto");
        animalCtrl.cadastrarPassaro("Loro", "Papagaio", 5, Genero.Masculino, "Praça");

        // Adicionar ao catálogo
        for (Animal a : animalCtrl.listar()) {
            catalogoCtrl.adicionarAoCatalogo(a);
        }

        // Mostrar catálogo
        System.out.println("\n=== Catálogo ===");
        for (Animal a : catalogoCtrl.listarCatalogo()) {
            System.out.println(a);
        }

        // Sons
        System.out.println("\n=== Sons dos Animais ===");
        for (Animal a : catalogoCtrl.listarCatalogo()) {
            ((Comportamento) a).emitirSom();
        }

        // Registrar todos
        System.out.println("\n=== Registro ===");
        for (Animal a : catalogoCtrl.listarCatalogo()) {
            ((Registravel) a).registrar();
        }

        // Atualizar no catálogo
        catalogoCtrl.atualizarAnimal("Mimi", "Mimi Jr", "Persa", 3, "Centro");

        // Excluir do catálogo
        catalogoCtrl.excluir("Loro");

        // Excluir do service geral também
        animalCtrl.excluir(1);

        System.out.println("\n=== Catálogo Final ===");
        for (Animal a : catalogoCtrl.listarCatalogo()) {
            a.mostrarDados();
        }
    }
}

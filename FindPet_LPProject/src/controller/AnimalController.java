package controller;

import enums.Genero;
import model.Cachorro;
import model.Gato;
import model.Passaro;
import model.Animal;
import service.AnimalService;
import java.util.List;

public class AnimalController {

    private AnimalService service = AnimalService.getInstance(); // <-- CORRIGIDO

    public void cadastrarCachorro(String nome, String raca, int idade, Genero genero, String local) {
        int id = service.gerarId();
        Cachorro c = new Cachorro(id, nome, raca, idade, genero, local);
        service.cadastrarAnimal(c);
    }

    public void cadastrarGato(String nome, String raca, int idade, Genero genero, String local) {
        int id = service.gerarId();
        Gato g = new Gato(id, nome, raca, idade, genero, local);
        service.cadastrarAnimal(g);
    }

    public void cadastrarPassaro(String nome, String raca, int idade, Genero genero, String local) {
        int id = service.gerarId();
        Passaro p = new Passaro(id, nome, raca, idade, genero, local);
        service.cadastrarAnimal(p);
    }

    public List<Animal> listar() {
        return service.listarAnimais();
    }

    public void atualizarSituacao(int id, String situacao) {
        service.atualizarSituacao(id, situacao);
    }

    public List<Animal> filtrar(String especie) {
        return service.filtrar(especie);
    }

    public void excluir(int id) {
        service.excluir(id);
    }
}

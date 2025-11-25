package controller;

import model.*;
import enums.*;
import service.AnimalService;
import java.util.List;

public class AnimalController {

    private AnimalService service = new AnimalService();


    public void cadastrarCachorro(String nome, String raca, int idade,double peso, Genero genero, String local) {
        int id = service.gerarId();
        Cachorro c = new Cachorro(id, nome, raca, idade,peso, genero, local);
        service.cadastrarAnimal(c);
    }


    public void cadastrarGato(String nome, String raca,double peso, int idade, Genero genero, String local) {
        int id = service.gerarId();
        Gato g = new Gato(id, nome, raca, idade,peso, genero, local);
        service.cadastrarAnimal(g);
    }


    public void cadastrarPassaro(String nome, String raca, int idade, double peso, Genero genero, String local) {
        int id = service.gerarId();
        Passaro p = new Passaro(id, nome, raca, idade,peso, genero, local);
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
}

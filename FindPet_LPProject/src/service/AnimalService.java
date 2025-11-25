package service;

import model.Animal;
import java.util.ArrayList;
import java.util.List;

public class AnimalService {

    private List<Animal> animais = new ArrayList<>();
    private int nextId = 1;


    public int gerarId() {
        return nextId++;
    }


    public void cadastrarAnimal(Animal animal) {
        animais.add(animal);
        System.out.println("Animal cadastrado com sucesso!");
    }


    public List<Animal> listarAnimais() {
        return animais;
    }

    public void atualizarSituacao(int id, String novaSituacao) {
        for (Animal a : animais) {
            if (a.getId() == id) {
                try {
                    a.setSituacao(Enum.valueOf(enums.Situacao.class, novaSituacao));
                    System.out.println("Situação atualizada!");
                } catch (Exception e) {
                    System.out.println("Situação inválida!");
                }
                return;
            }
        }
        System.out.println("Animal não encontrado!");
    }

    public List<Animal> filtrar(String especie) {
        List<Animal> filtrados = new ArrayList<>();
        for (Animal a : animais) {
            if (a.getEspecie().name().equalsIgnoreCase(especie)) {
                filtrados.add(a);
            }
        }
        return filtrados;
    }

}

package model;

import enums.Especie;
import enums.Genero;
import Interfaces.Comportamento;
import Interfaces.Registravel;

public final class Gato extends Animal implements Comportamento, Registravel {

    public Gato (int id, String nome, String raca, int idade, Genero genero, String localizacao) {
        super(id, nome, Especie.Gato, raca, idade, genero, localizacao);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Miau!");
    }

    @Override
    public void registrar() {
        System.out.println("Gato '" + getNome() + "' registrado no sistema!");
    }

    @Override
    public void mostrarDados() {
        System.out.println(toString());
    }


}

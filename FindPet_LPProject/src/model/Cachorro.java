package model;

import enums.Especie;
import enums.Genero;
import Interfaces.Comportamento;
import Interfaces.Registravel;

public final class Cachorro extends Animal implements Comportamento, Registravel {


    public Cachorro(int id, String nome, String raca, int idade, Genero genero, String localizacao) {
        super(id, nome, Especie.Cachorro, raca, idade, genero, localizacao);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Au Au!");
    }

    @Override
    public void registrar() {
        System.out.println("Cachorro '" + getNome() + "' registrado no sistema!");
    }

    @Override
    public void mostrarDados() {
        System.out.println(toString());
    }
}

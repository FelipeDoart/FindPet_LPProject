package model;

import enums.Especie;
import enums.Genero;
import Interfaces.Comportamento;
import Interfaces.Registravel;

public final class Passaro extends Animal implements Comportamento, Registravel {

    public Passaro (int id, String nome, String raca, int idade, Genero genero, String localizacao) {
        super(id, nome, Especie.Passaro, raca, idade,genero, localizacao);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Piu Piu!");
    }

    @Override
    public void registrar() {
        System.out.println("Pássaro '" + getNome() + "' registrado no sistema!");
    }

    @Override
    public void mostrarDados() {
        System.out.println(toString());
    }

}

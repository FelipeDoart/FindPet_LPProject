package model;

import enums.Especie;
import enums.Genero;

public final class Passaro extends Animal{

    public Passaro (int id, String nome, String raca, int idade, double peso, Genero genero, String localizacao) {
        super(id, nome, Especie.Passaro, raca, idade, peso, genero, localizacao);
    }

}

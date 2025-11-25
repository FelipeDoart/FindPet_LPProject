package model;

import enums.Especie;
import enums.Genero;

public final class Cachorro extends Animal {


    public Cachorro(int id, String nome, String raca, int idade, double peso, Genero genero, String localizacao) {
        super(id, nome, Especie.Cachorro, raca, idade,peso, genero, localizacao);
    }
}

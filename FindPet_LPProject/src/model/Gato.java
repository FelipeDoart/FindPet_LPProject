package model;

import enums.Especie;
import enums.Genero;

public final class Gato extends Animal{

    public Gato (int id, String nome, String raca, int idade, double peso, Genero genero, String localizacao) {
        super(id, nome, Especie.Gato, raca, idade, peso, genero, localizacao);
    }


}

package model;
import enums.Especie;
import enums.Genero;
import enums.Situacao;


public abstract class Animal {
    public String nome;
    public int idade;
    protected int id;
    protected Especie especie;
    protected Genero genero;
    public String raca;
    protected Situacao situacao = Situacao.Abandonado;
    public String localizacao;



    public Animal(int id, String nome, Especie especie, String raca, int idade, Genero genero, String localizacao) {
        this.id = id;
        this.especie = especie;
        this.idade = idade;
        this.raca = raca;
        this.nome = nome;
        this.genero = genero;
        this.localizacao = localizacao;

    }

    public Situacao getSituacao() {
        return situacao;
    }
    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {

    }
    public Especie getEspecie() {
        return especie;
    }
    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Nome: " + nome +
                ", Espécie: " + especie +
                ", Raça: " + raca +
                ", Idade: " + idade +
                ", Gênero: " + genero +
                ", Localização: " + localizacao +
                ", Situação: " + situacao;
    }


    public void mostrarDados() {
    }
}

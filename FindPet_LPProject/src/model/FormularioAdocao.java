package model;

public class FormularioAdocao {

    private Adotante adotante;
    private Animal animal;
    private String cpf;
    private String endereco;
    private String data;

    public FormularioAdocao(Adotante adotante, Animal animal, String cpf, String endereco, String data) {
        this.adotante = adotante;
        this.animal = animal;
        this.cpf = cpf;
        this.endereco = endereco;
        this.data = data;
    }

    public FormularioAdocao(String nome, String email, String telefone, String cpf, String endereco, Animal animal) {
    }

    public Adotante getAdotante() { return adotante; }
    public Animal getAnimal() { return animal; }
    public String getCpf() { return cpf; }
    public String getEndereco() { return endereco; }
    public String getData() { return data; }
}
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


    public Adotante getAdotante() { return adotante; }
    public Animal getAnimal() { return animal; }
    public String getCpf() { return cpf; }
    public String getEndereco() { return endereco; }
    public String getData() { return data; }

    @Override
    public String toString() {
        return "\n--- FORMULÁRIO DE ADOÇÃO ---" +
                "\nNome do adotante: " + adotante.getNome() +
                "\nEmail: " + adotante.getEmail() +
                "\nTelefone: " + adotante.getTelefone() +
                "\nCPF: " + cpf +
                "\nEndereço: " + endereco +
                "\nAnimal escolhido: " + animal.getNome() +
                " (ID: " + animal.getId() + ", Espécie: " + animal.getEspecie() + ")" +
                "\n------------------------------";
    }

}

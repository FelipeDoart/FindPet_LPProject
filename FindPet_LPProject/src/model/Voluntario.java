package model;

import interfaces.CadastroAnimal;

public class Voluntario extends Adotante implements CadastroAnimal {

    public Voluntario(String nome, String email, String telefone) {
        super(nome, email, telefone);

        if (telefone == null || telefone.isBlank()) {
            throw new IllegalArgumentException("Telefone é obrigatório para voluntários.");
        }
    }

    @Override
    public String getTipoAdotante() {
        return "Voluntário";
    }

    @Override
    public void cadastrarAnimal(Animal animal) {
        System.out.println("Animal cadastrado pelo voluntário: " + this.nome);
    }
}



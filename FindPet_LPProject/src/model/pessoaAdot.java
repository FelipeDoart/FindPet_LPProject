package model;

public class pessoaAdot extends Adotante {

    public pessoaAdot(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }

    @Override
    public String getTipoAdotante() {
        return "Adotante Comum";
    }
}

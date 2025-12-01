package model;



public class Voluntario extends Adotante{

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
}



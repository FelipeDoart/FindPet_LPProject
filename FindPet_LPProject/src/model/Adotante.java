package model;

public abstract class Adotante {
    protected String nome;
    protected String email;
    protected String telefone; // opcional

    public Adotante(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }

    public abstract String getTipoAdotante();

    @Override
    public String toString() {
        return "Tipo: " + getTipoAdotante() +
                " | Nome: " + nome +
                " | Email: " + email +
                " | Telefone: " + (telefone.isEmpty() ? "Não informado" : telefone);
    }
}



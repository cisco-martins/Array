class Pessoa {
    int id;
    String nome;
    int idade;

    public Pessoa(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Idade: " + idade;
    }
}

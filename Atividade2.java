class Pessoa {
    String nome;
    int idade;
    
    // Método para exibir informações da pessoa
    void exibirInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + " anos");
    }
}

public class Atividade2 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        
        pessoa1.nome = "Maria";
        pessoa1.idade = 25;
        
        pessoa2.nome = "João";
        pessoa2.idade = 30;
        
        System.out.println("=== Informações das Pessoas ===");
        pessoa1.exibirInfo();
        pessoa2.exibirInfo();
    }
}
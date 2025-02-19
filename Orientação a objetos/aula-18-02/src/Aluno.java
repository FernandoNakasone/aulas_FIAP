public class Aluno {
    
    // variavel global
    // atributo ou propriedade ou variaveis de instância

    int rm;
    String nome;
    double nota1;
    double nota2;

    public double calcularMedia () {
        return (nota1 + nota2) / 2;    
    }

    public String verificarSituacao() {

        if (calcularMedia() >= 6) {
            return "Aprovado";
        } 
            return "Reprovado";
    }
}

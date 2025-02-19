public class Professor {
    
    String nome;
    int numAulasSemanal;
    double valorAula;


    public double salarioBase(){
        return numAulasSemanal * valorAula * 4.5;
    }

    public double horaAtividade(){
        return salarioBase() * 0.05;
    }

    public double descansoRemunerado(){
        return (salarioBase() + horaAtividade())/6;
    }

    public double salarioBruto(){
       return salarioBase() + horaAtividade() + descansoRemunerado();
    }
}

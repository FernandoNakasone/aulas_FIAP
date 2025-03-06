package ex_03;

public class Ponto {

    int cordenadaX;
    int cordenadaY;

    public double calcularDistancia(Ponto p){
        double distancia = 0;
        distancia = Math.sqrt(Math.pow((cordenadaX - p.cordenadaX),2) + Math.pow((cordenadaY - p.cordenadaY),2));

       return distancia;
    }

    public double calcularDistanciaOrigem(){
        Ponto origem = new Ponto();
        origem.cordenadaX = 0;
        origem.cordenadaY = 0;
        double distanciaOrigem;

        return  calcularDistancia(origem);

    }

    public Ponto verificarPontoPerto(Ponto p1, Ponto p2){

        if(p2.calcularDistanciaOrigem() < calcularDistanciaOrigem()){
            return  p2;
        }
            return p1;

    }
    public  int retornaDadosXY (Ponto p){
        
    }

}

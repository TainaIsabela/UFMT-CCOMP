public class Circulo extends Shape{

    Ponto centro;
    double raio;

    public Circulo(Ponto centro, double raio){
        this.centro = centro;
        this.raio = raio;
    }

    @Override
    public Ponto getCenter() {
        return centro;
    }

    

   
    
}

import java.util.Objects;

// Defina classe Ponto para representar um ponto com coordenadas x e y. Forneça um construtor para inicializar as coordenadas e métodos de acesso getX() e getY().
// Defina a subclasse PontoRotulado com um construtor PontoRotulado(String rotulo, double x, double y) e um método de acesso getRotulo(). Defina os métodos toString()
// e equals() para as classes. Faça um programa de teste.

public class Ponto {
    public double x;
    public double y;

    public Ponto (double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    @Override
    public String toString() {
        return "Ponto{" + "x=" + x + ", y=" + y + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ponto other = (Ponto) obj;
        if (Double.doubleToLongBits(this.x) != Double.doubleToLongBits(other.x)) {
            return false;
        }
        if (Double.doubleToLongBits(this.y) != Double.doubleToLongBits(other.y)) {
            return false;
        }
        return true;
    }
    
   
}
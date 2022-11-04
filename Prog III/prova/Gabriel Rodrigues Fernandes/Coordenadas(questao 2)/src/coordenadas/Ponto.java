package coordenadas;
public class Ponto {
    protected float X;
    protected float Y;
    
    //Construtor com passagem por parametro 
    public Ponto(float a, float b){
        this.X = a;
        this.Y = b;
    }    
    //Construtor sem parametro
    public Ponto (){
        this.X = 0;
        this.Y = 0;
    }    
    //construtor de x
    public float getX(){
        return this.X;
    }
    // construtor de y
    public float getY(){
        return this.Y;
    }
       public void Transaladar(float a, float b){
           this.X += a;
           this.Y += b;
       } 
       
       public void Escalar(float a){
           this.X *= a;
           this.Y *= a;
       }
}

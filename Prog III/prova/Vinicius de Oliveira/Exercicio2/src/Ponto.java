public final class Ponto {
    private final float x;
    private final float y;
    public Ponto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Ponto(){
        this.x = 0;
        this.y = 0;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }

    public Ponto transladar(float x, float y){
        return new Ponto(getX() + x, getY() + y);
    }

    public Ponto escalar(float x){

        return new Ponto(getX() * x, getY() * x);
    }
    
}

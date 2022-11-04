

public class Obj extends Rodavel {
    private int position; 
    public Obj(int position){
        this.position = position;
    }
    @Override
    public void run(){
        System.out.println("Rodando... "+this.position);
    }
}

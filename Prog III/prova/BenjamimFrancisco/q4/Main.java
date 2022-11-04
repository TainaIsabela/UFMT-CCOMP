
/*
QUestao4
*/
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Runnable> ls = new ArrayList<>();
        ls.add(new Obj(1));
        ls.add(new Obj(1));
        ls.add(new Obj(1));
        ls.add(new Obj(1));
        ls.add(new Obj(1));
        ls.add(new Obj(1));
        ls.forEach(( Runnable item)->{
            item.run();
        });
        runner(ls);
    }
    public static void runner(ArrayList<Runnable> arr){
        for(Runnable item: arr){
            item.run();
        }
    } 
}

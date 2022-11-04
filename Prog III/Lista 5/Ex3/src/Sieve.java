package Ex3.src;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class Sieve {
    public static ArrayList<Integer> sieveAL(int n) {   
        boolean prime[] = new boolean[n+1];
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<=n;i++)
            prime[i] = true;
        for(int p = 2; p*p <=n; p++) {
            if(prime[p] == true) {
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;}}
        for(int i = 2; i <= n; i++) {
            if(prime[i] == true)
                result.add(i);}
        return result;}
    public static Set<Integer> sieveHash(int n) {
        Set<Integer> result = new HashSet<Integer>();
        for (int i = 2; i <= n; i++)
            result.add(i);
        for (int i = 2; i <= n; i++) {
            if (result.contains(i*i) )
                result.remove(i*i);}
        for (int i = 2; i <= n; i++) {
            for (int k = 0, j = i*(i+k); k <= n; j = i*(i+k++)){
                if( result.contains(j) ) {
                    result.remove(j);}}}
        return result;}}

package Ex5.src;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        System.out.println(count("words.txt"));}
    public static TreeMap<String, Integer> count(String path) {
        try {
            Scanner txt = new Scanner(new File(path));
            TreeMap<String, Integer> result = new TreeMap<>();
            while (txt.hasNext()) {
                String palavra = txt.next();
                if (palavra != "") { 
                    result.compute(palavra,(k , v) -> v == null ? 1 : v+1);
           }}txt.close();
            return result; } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());}
        return null;}}

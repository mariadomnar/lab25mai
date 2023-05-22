import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nume= Arrays.asList("Vasile", "Ion", "Mihai", "Alex", "Marian");
        for(String x:nume){ System.out.println(x);}
        nume.stream()
                .filter(x->x.length()<4)
                .forEach(x->System.out.println(x));
        nume.stream()
                .filter(x->x.length()>5)
                .map(x->x.length())
                .forEach(x->System.out.println(x));
        String str1= nume.stream()
                .filter(x->x.length()<5)
                .reduce("",(str,x)->str+x+" ");
        System.out.println(str1);

    }
}
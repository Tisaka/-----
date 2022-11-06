import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dz8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Annya", "Vlad", "Tonya", "Vlad", "Annya", "Vlad"); 
        Map<String, Integer> map = list.stream() 
        .collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum)); 
            
         System.out.println(map); 
    }
}

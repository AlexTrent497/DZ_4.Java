package Task_3;

import java.util.Arrays;
import java.util.List;

public class Ta_3 {
    
    public static void main(String[] args) {
       
        List<Integer> numb = Arrays.asList(3, 9, 10, 4, 5);
 
        int sum = numb.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
         

       


}
    }
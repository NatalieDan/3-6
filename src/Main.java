import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //task1
        List<Integer> integers1 = new ArrayList<Integer>();
        integers1 = List.of(1, 2, 4, 4, 2, 3, 4, 1, 7);
        List<Integer> newIntegers = findIntegersAfterFour(integers1);
        System.out.println(newIntegers);
        //task2
        List<Integer> integers2 = new ArrayList<Integer>();
        integers2 = List.of(1, 1, 4, 4, 1, 1, 4, 1, 1);
        boolean findInt = findIntegersOneOrFour(integers2);
        System.out.println(findInt);

    }

    public static List<Integer> findIntegersAfterFour(List<Integer> integers){
        int n = -1;
        for(int i = 0; i < integers.toArray().length; i++){
            if (integers.get(i).equals(4)){
                n = i;
            }
        }
        if (n == -1){
            throw new RuntimeException();
        }
        return integers.stream()
                .skip(n + 1)
                .collect(Collectors.toList());

    }

    public static boolean findIntegersOneOrFour(List<Integer> integers){
        boolean find1 = integers.stream().anyMatch(n -> n == 1);
        boolean find4 = integers.stream().anyMatch(n -> n == 4);
        return find1 && find4;
    }
}

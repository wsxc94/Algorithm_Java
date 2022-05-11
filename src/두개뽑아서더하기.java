import java.util.*;

public class 두개뽑아서더하기 {
    public static void main(String[] args) {

        //int[] numbers = {2,1,3,4,1};
        int[] numbers = {5,0,2,7};

        Set<Integer> resultSet = new HashSet<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                resultSet.add(numbers[i] + numbers[j]);
            }
        }

        resultSet.stream().sorted().mapToInt(Integer::intValue).toArray();

        Iterator<Integer> it = resultSet.iterator();

        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}

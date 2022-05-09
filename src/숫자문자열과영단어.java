import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 숫자문자열과영단어 {
    public static void main(String[] args) {

        List<String> word = List.of("one4seveneight" , "23four5six7" , "2three45sixseven","123");

        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < word.size(); i++) {
            String s = word.get(i);

            for (int j = 0; j < 10; j++) {
                s = s.replace(num[j] , Integer.toString(j));
            }

            int answer = Integer.parseInt(s);
            System.out.println("answer = " + answer);
        }
    }
}

public class 음양더하기 {
    public static void main(String[] args) {
        int answer = 0;

        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};

        for (int i = 0; i < absolutes.length; i++)
        {
            answer += (signs[i] == true) ? absolutes[i] : -absolutes[i];
        }

        System.out.println("answer = " + answer);
    }
}

import java.util.Arrays;

public class TestLv1_1 {


       /* 함수 solution은 정수 n을 매개변수로 입력받습니다.
        n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
        예를들어 n이 118372면 873211을 리턴하면 됩니다.*/

        public static void main(String[] args) {
            long n = 118372;
            long answer = 0;
            String[] str = String.valueOf(n).split("");
            Arrays.sort(str);

            StringBuilder sb = new StringBuilder();
            for (String string : str) {
                sb.append(string);
            }
            StringBuilder reverse = sb.reverse();
            answer = Long.parseLong(reverse.toString());
            System.out.println(answer);
        }
    }
}
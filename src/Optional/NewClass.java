package Optional;

import java.util.Scanner;

public class NewClass {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int n = in.nextInt();

        choice(n);

    }


    public static void choice(int n) {
        if (n == 1) {
            ClassInterface<String> reverse = new ClassInterface<String>() {
                @Override
                public String solution(String value) {
                    char tmp = 0;
                    char[] chars = value.toCharArray();
                    for (int i = 0; i < chars.length; i++) {
                        chars[i] = tmp;
                        chars[i] = chars[chars.length - 1];
                        chars[chars.length - 1] = tmp;
                        System.out.println(chars[i]);
                    }
                    return chars.toString();
                }
            };

            String text = in.nextLine();

        } else if (n == 2) {
            ClassInterface<Integer> factorial = x -> {
                int[] arr = new int[x];
                int result = 1;
                for (int i = 0; i < x; i++) {
                    result = i * result;
                }
                return result;
            };

            int number = in.nextInt();

        }
    }


}


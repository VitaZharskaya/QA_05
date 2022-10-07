package codewars;
// In this kata, you are asked to square every digit of a number and concatenate them.
//
//         For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.


public class Square {
    public static void main(String[] args) {

        int n = 9119;
        String s = n + "";
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int x = Character.getNumericValue(s.charAt(i));
            str.append((int)Math.pow(x,2));
        }
        System.out.println(Integer.valueOf(str.toString()));
    }
}

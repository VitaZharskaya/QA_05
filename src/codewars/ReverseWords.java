package codewars;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "          ";
        String [] arr = s.split(" ");
        String rev = "";
        for (int i = 0; i < arr.length; i++) {
            StringBuilder x = new StringBuilder();
            if (i == arr.length - 1 ){
                x.append(arr[i]);
            }else {
                x.append(" " + arr[i]);
            }
                x.reverse();
                rev = rev + x;

        }
        System.out.println(rev);
    }
}

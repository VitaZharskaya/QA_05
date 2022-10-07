import javax.imageio.stream.ImageInputStream;

public class AbbreviateTwoWords {

    public static void main(String[] args) {

    String name = "Vita";

        String s = "";
        char [] words = s.toCharArray();
        for (int i=0; i < 9; i++){
            if (words [i] == ' ' ) {
                int last = i+1;
                s += name.charAt(0) + "." + name.charAt(last);

            }
        }

        System.out.println(s);

    }
}
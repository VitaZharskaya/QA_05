package codewars;

public class Vowels {
    public static void main(String[] args) {

        String str = "You are using devcubicle!!!";
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};

        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if(str.charAt(i) == vowels[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

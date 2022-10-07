/*
        Given a string, you have to return a string in which each character (case-sensitive) is repeated once.

        Examples (Input -> Output):
        * "String"      -> "SSttrriinngg"
        * "Hello World" -> "HHeelllloo  WWoorrlldd"
        * "1234!_ "     -> "11223344!!__  " */

public class Solution{
    public static void main(String[] args) {

        String s = "Hello World";

        for (int i=0; i<s.length(); i++)

            System.out.print(s.charAt(i)+ "" + s.charAt(i));
    }
}
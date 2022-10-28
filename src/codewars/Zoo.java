package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        String[] arr = { "tails", "body", "heads" };
        String[] list = new String[3];
        list[0] = arr[2];
        list[1] = arr[1];
        list[2] = arr[0];

        System.out.println(Arrays.toString(list));
    }
}

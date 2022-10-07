import java.util.Arrays;

public class circle {

    public static void main(String[] args) {
        String s = "Viitia";
        String[] vita = s.split("i",3);
        System.out.println(Arrays.toString(vita));


        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
//       if ( arr[i] < 0)
//         arr[i]=0;
            sum = sum + i;
        }


        System.out.println(sum);


        //return array;
    }
}



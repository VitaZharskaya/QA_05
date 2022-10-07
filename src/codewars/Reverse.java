
//Complete the solution so that it reverses all the words within the string passed in.
//
//        Example(Input --> Output):
//
//"The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"

public class Reverse {

    public static void main(String[] args) {

        String phrase = "The greatest victory is that which requires no battle";
        String [] array = phrase.split(" ");

        for (int i = array.length-1; i>=0; i--){

            System.out.print(array[i] + " ");
        }

    }
}

//        String str = "The greatest victory is that which requires no battle";
//        String [] array = str.split(" ");
//        StringBuilder sb = new StringBuilder();
//        for (int i = array.length-1; i>=0; i--){
//
//            sb.append(array[i]).append(" ");
//        }
//        System.out.println(sb.toString().trim());
//    }
//}
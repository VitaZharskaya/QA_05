public class n {
    public static void main(String[] args) {
        int n = 2;
        int[] array = {3, 1, 2};

        if (n < 0 || n >= array.length)
            System.out.println(-1);
        else
            System.out.println((int) Math.pow(array[n], n));

        int val = 0;
        String a[] = {"what", "a", "great", "kata"};
        String x = "e";

        for (int i = 0; i < a.length; i++) {

            if (a[i] == x) {
                val = 1;// 1
                break;
            } else {
                val = 0; //0
            }
        }
        System.out.println(val == 1);
    }
}

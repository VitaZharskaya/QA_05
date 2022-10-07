public class QA {
    public static void main(String[] args) {
        String animal = "alligator";
        //animal = animal.toLowerCase();
        System.out.println(animal);
        if ( animal == "alligator"|| animal == "ALLIGATOR"){
            System.out.println("small");
        }else{
            System.out.println("wide");
        }
    }

    public static class hello {
        public static void main(String[] args) {

            int count = 0;
            for(int i = 1; i < 15; i+=2){
                count++;
            }
            System.out.println(count);
        }
    }
}


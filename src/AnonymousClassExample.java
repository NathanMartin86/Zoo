/**
 * Created by macbookair on 10/26/15.
 */
public class AnonymousClassExample {
    public static void main(String[] args) {
        //Create Alligator from separate Class
        Alligator a1 = new Alligator();
        System.out.println(a1);

        //Create Alligator from anonymous class
        Reptile a2 = new Reptile() {
            @Override
            public String toString() {
                return "Alligator";
            }
        };

        System.out.println(a2);
    }

}
    class Alligator extends Reptile {
        @Override
        public String toString() {
            return "Alligator";
        }
    }
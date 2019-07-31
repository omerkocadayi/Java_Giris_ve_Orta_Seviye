public class ArrayError {

    public static void main(String[] args) {

        try {

        String days[] = new String[3];

        System.out.println(days[5]);

        } catch (ArrayIndexOutOfBoundsException HataDurumu) {
           System.out.println(HataDurumu.getMessage());
        } 
    }
}
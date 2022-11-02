public class heart {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {

            for (int j = 0; j < 5 - i; j++) {
                System.out.print("    ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("love    ");
            }

            for (int j = 0; j < (5 - i) * 2; j++) {
                System.out.print("    ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("love   ");
            }

            System.out.println();
        }

        for (int i = 0; i <= 10; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("    ");
            }
            for (int j = 0; j < 10 - i; j++) {
                System.out.print("love   ");
            }

            System.out.println();
        }


    }

}

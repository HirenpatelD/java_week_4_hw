public class Programme_8_SymbolTriangle {

    /**
     * Display right angle triangle of @ using nested for loops
     * @
     * @@
     * @@@
     * @@@@
     * @@@@@
     */


    public static void main(String[] args) {

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println(" ");
        }
    }
}



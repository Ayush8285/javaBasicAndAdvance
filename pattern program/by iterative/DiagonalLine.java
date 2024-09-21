public class DiagonalLine {
    public static void main(String[] args) {
        int noOfLines = 7;
        // final int NO_OF_STAR = 1;
        for(int line = 1; line <= noOfLines ; line++){
            for(int space = 1 ; space <= noOfLines-line ; space++ ){
                System.out.print(" ");
            }
            // for(int star = 1 ; star <= NO_OF_STAR ; star++){
            //     System.out.print("*");
            // }
            System.out.print("* ");
            System.out.println();
        }
    }
}

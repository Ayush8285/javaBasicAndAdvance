public class OddStarPyramid {
    public static void main(String[] args) {
        int noOfLines = 5; 
        for(int line = 0 ; line <= noOfLines-1 ; line++){
            for(int space = 1;space < noOfLines-line ;space++){
                System.out.print(" ");
            }
            int oddstar = 2 * line + 1;
            for(int star = 1 ; star <= oddstar ; star++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

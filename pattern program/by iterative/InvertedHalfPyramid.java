public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int noOfLines = 5;
        for(int line = noOfLines; line >= 1 ; line--){
            for(int star = line ; star >= 1 ; star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

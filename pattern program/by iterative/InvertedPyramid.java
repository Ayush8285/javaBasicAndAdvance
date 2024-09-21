public class InvertedPyramid {
    public static void main(String[] args) {
        int noOfLines = 5;
        int totalSpace = 0;
        int starCount = noOfLines*2-1;
        for(int line= 1; line <= noOfLines ; line++){
            for(int space = 1 ; space <= totalSpace;space++){
                System.out.print(" ");
            }
            for(int star = 1; star <= starCount ; star++){
                System.out.print("*");
            }
            totalSpace++;
            starCount -= 2;
            System.out.println();
        }
    }
}

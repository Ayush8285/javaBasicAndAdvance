public class NumberLeftPyramid {
    public static void main(String[] args) {
        int noOfLines = 4;
        int number = 1;
        for(int line = 1;line <= noOfLines ; line++){
            for(int col = 1; col <= line ; col++){
                System.out.print(number++ +" ");
            }
            System.out.println();
        }
    }
}

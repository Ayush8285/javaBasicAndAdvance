public class NumberRightAndLeft {
    public static void main(String[] args) {
        int noOfLines = 5;
        int number = 1;
        int spaceCount = 5*2-2;
        for(int line = 1 ; line <= noOfLines ; line++){
            for(int num = 1 ; num <= number ; num++){
                System.out.print(num);
            }
            for(int space = 1 ; space <= spaceCount ; space++){
                System.out.print(" ");
            }
            for(int num = number ; num >= 1 ; num--){
                System.out.print(num);
            }
            spaceCount -= 2;
            number++;
            System.out.println();
        }
    }
}

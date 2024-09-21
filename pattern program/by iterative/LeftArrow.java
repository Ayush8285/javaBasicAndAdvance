public class LeftArrow {
    public static void main(String[] args) {
        int noOfLines = 5;
        int starCount = noOfLines;
        //upper
        for(int line = 1;line <= noOfLines ; line++){
            for(int space = noOfLines-1 ; space >= line ;space--){
                System.out.print(" ");
            }
            for(int star = 1 ; star <= starCount ; star++){
                System.out.print("*");
            }
            starCount--;
            System.out.println();
        }
        //lower
        for(int line = 1;line <= noOfLines-1 ; line++){
            for(int space = 1 ; space <= line ;space++){
                System.out.print(" ");
            }
            for(int star = 1 ; star <= line+1 ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

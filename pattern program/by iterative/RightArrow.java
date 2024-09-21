public class RightArrow {
    public static void main(String[] args) {
        int noOfLines = 5;
        int spaceCount = 0;
        int starCount = noOfLines;
        //upper
        for(int line = 1;line <= noOfLines ; line++){
            for(int space = 1 ; space <= spaceCount ;space++){
                System.out.print(" ");
            }
            for(int star = 1 ; star <= starCount ; star++){
                System.out.print("*");
            }
            spaceCount += 2;
            starCount--;
            System.out.println();
        }
        //lower
        int spaceCount1 = spaceCount-4;
        for(int line = 1;line <= noOfLines-1 ; line++){
            for(int space = 1 ; space <= spaceCount1 ;space++){
                System.out.print(" ");
            }
            for(int star = 1 ; star <= line+1 ; star++){
                System.out.print("*");
            }
            spaceCount1 -= 2;
            System.out.println();
        }
    }
}

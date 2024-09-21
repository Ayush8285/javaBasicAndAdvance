public class Heart {
    public static void main(String[] args) {
        int noOfLines = 5;
        int starCount = noOfLines;
        int spaceCount = noOfLines;
        for(int line = 3 ; line <= noOfLines ; line++){
            for(int space = 1;space <= noOfLines-line ; space++){
                System.out.print(" ");
            }
            for(int star = 1 ; star <= starCount ; star++){
                System.out.print("*");
            }
            for(int space = 1 ; space <= spaceCount ; space++){
                System.out.print(" ");
            }
            for(int star = 1 ; star <= starCount ; star++){
                System.out.print("*");
            }
            spaceCount -= 2;
            starCount += 2;
            System.out.println();
        }
        int spaceCount1 = 0;
        int starCount1 = noOfLines*4-1;
        for(int line = 1 ; line <= (noOfLines*4 )/2; line++){
            for(int space = 1 ; space <= spaceCount1 ; space++){
                System.out.print(" ");
            }
            for(int star = starCount1 ; star >= 1 ; star--){
                System.out.print("*");
            }
            starCount1 -= 2;
            spaceCount1++;
            System.out.println();
        }
    }
}

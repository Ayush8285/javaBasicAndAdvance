public class HollowDiamond {
    public static void main(String[] args) {
        int noOfLines = 5;
        int totalSpace = 0;
        for(int line = 1;line <= noOfLines;line++){
            for(int star = noOfLines ; star >= line ; star--){
                System.out.print("*");
            }
            for(int space = 1; space <= totalSpace ; space++){
                System.out.print(" ");
            }
            for(int star = noOfLines ; star >= line;star--){
                System.out.print("*");
            }
            totalSpace += 2;
            System.out.println();
        }
        int totalSpace1 = totalSpace-2;
        for(int line = 1;line <= noOfLines;line++){
            for(int star = 1 ; star <= line ; star++){
                System.out.print("*");
            }
            for(int space = totalSpace1; space >= 1 ; space--){
                System.out.print(" ");
            }
            for(int star = 1 ; star <= line;star++){
                System.out.print("*");
            }
            totalSpace1 -= 2;
            System.out.println();
        }
    }
}

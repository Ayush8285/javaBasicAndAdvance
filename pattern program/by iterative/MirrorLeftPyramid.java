public class MirrorLeftPyramid {
    public static void main(String[] args) {
        int noOfLines = 5;
        for(int line =1;line <= noOfLines ;line++){
            for(int space = 1 ; space <= noOfLines - line; space++){
                System.out.print(" ");
            }
            for(int star = 1 ; star <= line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

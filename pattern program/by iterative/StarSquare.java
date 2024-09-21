public class StarSquare {
    public static void main(String[] args) {
        int noOfLines = 5;
        for(int line = 1;line<=noOfLines;line++){
            for(int star = 1;star<=noOfLines;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
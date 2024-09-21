public class CharacterLeftPyramidSameRow {
    public static void main(String[] args) {
        int noOfLines = 5;
        int character = 65;
        for(int line = 1 ; line <= noOfLines ; line++,character++){
            for(int col = 1; col <= line ; col++){
                System.out.print((char)(character)+" ");
            }
            // character++;
            System.out.println();
        }
    }
}

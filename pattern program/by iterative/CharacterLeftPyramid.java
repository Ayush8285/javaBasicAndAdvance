public class CharacterLeftPyramid {
    public static void main(String[] args) {
        int noOfLines = 4;
        int character = 65;                 //A :- ascii value === 65      a:- 97
        for(int line = 1 ; line <= noOfLines ; line++){
            for(int col = 1 ; col <= line ; col++){
                System.out.print((char)(character++)+" ");
            }
            System.out.println();
        }
    }
}

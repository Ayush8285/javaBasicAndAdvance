public class CrossDiagonal {
    public static void main(String[] args) {
        int noOfLines = 5;
        for(int line = 0 ; line < noOfLines ; line++){
            for(int star = 0 ; star < noOfLines ; star++){
                if(line == star || (line +star) == noOfLines-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

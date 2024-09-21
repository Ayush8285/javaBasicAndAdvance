public class HollowInvertedPyramid {
    public static void main(String[] args) {
        int noOfLines = 5;
        int totalSpace = 0;
        int totalStar = noOfLines*2-1;
        for(int line=1; line <= noOfLines ; line++){
            for(int space = 1 ; space <= totalSpace ; space++){
                System.out.print(" ");
            }
            for(int star = 1 ; star <= totalStar ; star++){
                if(line == 1 || star == 1 || star == totalStar ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            totalSpace++;
            totalStar -= 2;
            
        }
    }
}

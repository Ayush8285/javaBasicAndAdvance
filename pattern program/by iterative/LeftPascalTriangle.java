public class LeftPascalTriangle {
    public static void main(String[] args) {
        int noOfLines = 9;
        int mid = noOfLines/2;
        int totalSpace = mid-1;
        int starCount = 1;
        for(int line=1; line <= noOfLines ; line++){
            for(int space = 1; space<= totalSpace;space++ ){
                System.out.print(" ");
            }
            for(int star = 1; star <= starCount ; star++){
                System.out.print("*");
            }
            if(line<mid){
                totalSpace--;
                starCount++;
            }else{
                totalSpace++;
                starCount--;
            }
            System.out.println();
        }
    }
}

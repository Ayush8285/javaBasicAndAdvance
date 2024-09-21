public class RightPascalTriangle {
    public static void main(String[] args) {
        int noOfLines = 9;
        int mid = noOfLines/2;
        int starCount = 1;
        for(int line = 1 ; line <= noOfLines ; line++){
            for(int star = 1; star <= starCount;star++){
                System.out.print("*");
            }
            if(line<mid){
                starCount++;
            }else{
                starCount--;
            }
            System.out.println();
        }
    }
}

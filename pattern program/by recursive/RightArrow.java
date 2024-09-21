public class RightArrow {
    
    static void printSpace(int space){
        if(space == 0 ){
            return;
        }
        System.out.print(" ");
        printSpace(space-1);
    }
    static void printStar(int star){
        if(star == 0){
            return;
        }
        System.out.print("*");
        printStar(star-1);
    }
    static void printRightArrow(int cR , int size){
        if(cR == size){
            return;
        }
        printSpace(2*cR);
        printStar(size-cR);
        System.out.println();
        printRightArrow(cR+1, size);
        if(cR != (size-1)){
            printSpace(2*cR);
            printStar(size-cR);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printRightArrow(0, 3);
    }
}

public class LeftArrow {
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
    static void printLeftArrow(int cR , int size){
        if(cR == size){
            return;
        }
        printSpace(size-cR-1);
        printStar(size-cR);
        System.out.println();
        printLeftArrow(cR+1, size);
        if(cR != (size-1)){
            printSpace(size-cR-1);
            printStar(size-cR);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printLeftArrow(0, 3);
    }
}

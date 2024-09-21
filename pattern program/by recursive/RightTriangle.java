public class RightTriangle {
    static void printSpace(int space){
        if(space == 0){
            return;
        }
        System.out.print(" ");
        printSpace(space-1);
    }
    static void  printStar(int star){
        if(star ==0){
            return;
        }
        System.out.print("*");
        printStar(star-1);
    }
    static void printRightTriangle(int currentRow , int row){
        if(row ==0){
            return;
        }
        printSpace(row);
        printStar(currentRow);
        System.out.println();
        printRightTriangle(currentRow+1, row-1);
    }
    public static void main(String[] args) {
        printRightTriangle(1, 5);
    }
}

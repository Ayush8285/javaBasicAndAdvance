public class LeftPyramidRec {
    
    static void printStar(int star){
        if(star == 0){
            return;
        }
        System.out.print("*");
        printStar(star-1);
    }
    static void printLine(int currentRow,int rows){
        if(currentRow > rows){
            return;
        }
        printStar(currentRow);
        System.out.println();
        printLine(currentRow + 1, rows);
    }
    public static void main(String[] args) {
        printLine(1,5);
    }
}

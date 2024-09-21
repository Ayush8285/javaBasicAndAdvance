public class SolidSquareRec{
    
    static void printStar(int cols){
        if(cols == 0){
            return;
        }
        System.out.print("*");
        printStar(cols-1);
    }
    static void printLine(int rows,int cols){
        if(rows == 0){
            return;
        }
        printStar(cols);
        System.out.println();
        printLine(rows-1,cols);
        
    }
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        printLine(rows,cols);
    }
}


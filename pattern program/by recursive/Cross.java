public class Cross  {                           //n=3  // total column
    
    static void printStar(int start , int cC , int tC){
        if(start > (2*tC)){
            System.out.println();
            return;
        }
        if(start == cC || start == (2*tC) - cC){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
        printStar(start + 1, cC, tC);
    }

    static void printCross(int cR , int size){
        if(cR > size){
            return;
        }
        printStar(1, cR, size);
        printCross(cR+1, size);
        if(cR != size){
            printStar(1, cR, size);
        }
    }
    public static void main(String[] args) {
        printCross(1, 3);
    }
}

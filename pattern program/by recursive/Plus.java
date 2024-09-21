public class Plus {
    static void printStar( int start , int cC ,int size){
        if(start > size){
            return;
        }
        if(cC == ((size/2)+1)  || start == ((size/2)+1)){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
        printStar(start+1, cC, size);
    }
    static void printPlus(int cR , int size){
        if(cR > size){
            return;
        }
        printStar(1, cR, size);
        System.out.println();
        printPlus(cR+1, size);
    }
    public static void main(String[] args) {
        printPlus(1, 5);
    }
}

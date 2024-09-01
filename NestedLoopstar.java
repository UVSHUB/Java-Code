public class NestedLoopstar {
    public static void main(String[] args) {
        int i,j;
        for (i = 5; i <= 9 ;i-- ) {
            for( j= 5; j <= i; --j){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
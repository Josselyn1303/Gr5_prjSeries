public class Recursion2 {

    public int jpsumaRecursion(int a, int b){
        if (b == 0) {
            System.out.println();
            System.out.println("Suma a + b = " + a);
            System.out.println();
            return a;
        } 
        else {
            return jpsumaRecursion(a + 1, b - 1);
        }
    }
    
}
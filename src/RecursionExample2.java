public class RecursionExample2 {
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumber(6));

    }
    public static int sumOfNaturalNumber(int n){
        if(n==1){
            return 1;
        }
        return n + sumOfNaturalNumber(n-1);
    }
}

public class ReverseString {
    public static void main(String[] args) {
        String str = "Javascript";
        char[] arr = str.toCharArray();

        String reverseString = "";
        for(int i=arr.length-1;i>=0;i--){
            reverseString+= arr[i];

        }
        System.out.println("Original String:"+str);
        System.out.println("Reversed String: "+reverseString);

    }
}

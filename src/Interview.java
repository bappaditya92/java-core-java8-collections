//Write a program for the below input=Java output=J#a##v###a####
public class Interview {
    public static void main(String[] args) {

        String input = "Java";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            output.append(input.charAt(i));
            for (int j = 0; j <= i; j++) {
                output.append("#");
            }
        }

        System.out.println(output);
    }
}




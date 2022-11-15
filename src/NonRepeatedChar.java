public class NonRepeatedChar {
    public static void main(String [] args) {
        String inputStr = "messigimothi";

        for (char i: inputStr.toCharArray()) {
            if (inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
                System.out.println("Answer is " + i);
                break;
            }
        }
    }
}

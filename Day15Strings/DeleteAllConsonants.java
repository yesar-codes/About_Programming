public class DeleteAllConsonants {
    public String afterDeleting(String input) {
        char[] arr = input.toCharArray();
        input = "";
        for (char c : arr) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                input = input + "";
            } else {
                input = input + c;
            }
        }
        return input;
    }
}

import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        String m = sc.nextLine();
        System.out.println("The inputted String is:"+m);

        Concatenation obj = new Concatenation();
        String f = obj.Concatenate();//String after concatenation
        System.out.println(f);

        LengthOfString obj1 = new LengthOfString();
        System.out.println(obj1.getLengthOfString("Hello"));//printing the length of hello
        CompareTwoStrings obj2 = new CompareTwoStrings();
        System.out.println(obj2.CompareString("hello","hello"));//comparing two strings
        System.out.println(obj1.getLengthOfString("refrigerator"));//finding the length of refrigerator
        CheckIfAlphabetPresent obj3 = new CheckIfAlphabetPresent();
        System.out.println(obj3.CheckIfThere("Umbrella",'e'));
        /*checking if the word is present in the umbrella string*/
        DeleteAllConsonants obj4 = new DeleteAllConsonants();
        System.out.println(obj4.afterDeleting("Hello,have a good day"));
    }
}

package codeFest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class SampleCode {
    public static List<String> changesMade(List<String> userNames) {

        List<String> resultValues = new ArrayList<>();
        for (String name : userNames) {
            boolean changesMade = false;
            for (int i = 0; i < name.length() - 1; i++) {
                if (name.charAt(i) > name.charAt(i + 1)) {  // charAt() finds the char value at the specified index
                    changesMade = true;
                    break;
                }
            }
            resultValues.add(changesMade ? "YES" : "NO"); // based on the flag it sets the result values to YES or NO
        }
        return resultValues;
    }
}

public class Codeathon01_Harish{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            List<String> userNames = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                userNames.add(sc.next().toLowerCase());
            }

            List<String> results = SampleCode.changesMade(userNames);
            System.out.println(results.toString().replace("[", "").replace("]", "").replace(",", ""));
        }

}



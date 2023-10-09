package codeFest;


import java.util.*;
public class Codeathon06_Harish {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        for(int i=0; i<length; i++)
            list1.add(scanner.next());

        for(int j=0; j<length; j++)
            list2.add(scanner.next());

        for (String text : list1) {
            System.out.println(text);
        }

        for (String fruit : list2) {
            System.out.println(fruit);
        }
        Map<String, List<String>> resultMap = new HashMap<>();
        for (String text : list1) {
            List<String> matchingFruits = findFruits(text, list2);
            resultMap.put(text, matchingFruits);
        }
        for (String list1String : list1) {
            List<String> matchingFruits = resultMap.get(list1String);
            System.out.print(list1String + ": ");
            if (matchingFruits.isEmpty()) {
                System.out.println("[No Fruit]");
            } else {
                System.out.println(String.join(", ", matchingFruits));
            }
        }
    }
    private static List<String> findFruits(String numberString, List<String> list2) {
        char alphabet = findAlphabetCharacter(numberString);
        List<String> matchingFruits = new ArrayList<>();
        for (String fruit : list2) {
            if (fruit.length() == alphabet - 'a' + 1) {
                matchingFruits.add(fruit);
            }
        }
        return matchingFruits;
    }
    private static char findAlphabetCharacter(String text) {
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                return Character.toLowerCase(c);
            }
        }
        return ' ';
    }
}






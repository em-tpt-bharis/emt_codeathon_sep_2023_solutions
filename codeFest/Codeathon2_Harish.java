package codeFest;

import java.util.*;

 class SampleCode2 {
     public static String[] mostActive(List<String> traders) {
         int totalTrades = traders.size();
         Map<String, Integer> tradeCount = new HashMap<>();

         for (String customer : traders) {
             tradeCount.put(customer, tradeCount.getOrDefault(customer, 0) + 1);
         }

         List<String> result = new ArrayList<>();

         for (String customer : tradeCount.keySet()) {
             int trades = tradeCount.get(customer);
             double percentage = (trades / (double) totalTrades) * 100;

             if (percentage >= 5) {
                 result.add(customer);
             }
         }

         // Sort the result alphabetically
         result.sort(String::compareTo);

         // Convert the List to an array
         return result.toArray(new String[0]);
     }
 }
public class Codeathon2_Harish{
    public static void main(String[] args) {

        List<String> traders = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String customers[] = new String[size];
        for(int i=0; i<size; i++){
            traders.add(sc.next());
        }


        String[] activeCustomers = SampleCode2.mostActive(traders);

        // Print the active customers with trades greater than or equal to 5.0
        for (String customer : activeCustomers) {
            System.out.println(customer);
        }


    }
}

import java.util.HashMap;

public class SubarraySumDivisivleByK {
    public static void main(String[] args) {
       int arr[] = {5  , -2 , -3 , 4 , 7};
       int k = 5;
       
       HashMap<Integer , Integer> map = new HashMap<>();
       int count =  0 ; 
       int sum = 0;

       map.put(0, 1);
       for (int i = 0; i < arr.length; i++) {
        
        sum += arr[i];

        int rem = sum % k ;

        if (rem < 0 ) {
            rem= k+rem;
        }

        if (map.containsKey(rem)) {
        count+=map.get(rem);
        }
        
        map.put(rem, map.getOrDefault(rem, 0)+1);
       }

       System.out.println(count);
    }
}

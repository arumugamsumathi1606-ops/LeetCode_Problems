import java.util.HashSet;
public class ContainsDuplicate {
        
            public static void main(String[] args) 
            {
           HashSet<Integer> duplicateSet = new HashSet<>();
        int arr[] = {1, 2, 3, 4, 5, 1, 2, 3};    
        for (int i = 0; i < arr.length; i++) {
            if (!duplicateSet.add(arr[i])) {
                System.out.println("Duplicate element found: " + arr[i]);
            }
        }
       
    }

   
    }


    


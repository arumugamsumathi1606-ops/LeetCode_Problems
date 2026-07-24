import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args)
    {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        int[] arr1 = {1,2,4,3,2,5};
        int[] arr2 = {2,3,5,6,7};
        System.out.print("Intersection of the two arrays: ");

        for (int i=0 ; i<arr1.length; i++)
    {
        set1.add(arr1[i]);
    }

        for (int j=0; j<arr2.length;j++)
        {
            if(set1.contains(arr2[j]))
           set2.add(arr2[j]);

                }
                System.out.print(set2);
    }
    }


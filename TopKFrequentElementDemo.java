import java.util.HashMap;
import java.util.PriorityQueue;
public class TopKFrequentElementDemo {
    //o/p -> 1-3, 2-2, 3-1
    public static void main(String[] args)
    {
int[] nums = {1,1,1,2,2,3};
int k=2;

HashMap<Integer, Integer> maps = new HashMap<>();
PriorityQueue<Integer> pq = new PriorityQueue<>();

for (int i=0; i<nums.length; i++)
    //i passed to nums[i]
{
    if(maps.containsKey(nums[i]))
    {
        maps.put(nums[i], maps.get(nums[i]) + 1);

    }
    else 
    {
        maps.put(nums[i], 1);
    }

}
System.out.println("The frequency of each element is: " + maps);


    }
    
    
}

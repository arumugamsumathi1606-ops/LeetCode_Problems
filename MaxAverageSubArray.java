public class MaxAverageSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int WindowSum= 0;

        for (int i=0 ; i<k ; i++)
            {
WindowSum = WindowSum + arr[i];

            }
            int MaxSum = WindowSum;
            for (int i=k; i<arr.length ; i++)
            {
                WindowSum = WindowSum - arr[i-k] + arr[i];
                MaxSum = Math.max(MaxSum, WindowSum);
            }
            System.out.println("Maximum sum of subarray of size " + k + " is: " + MaxSum);
        
       
    }
    
}

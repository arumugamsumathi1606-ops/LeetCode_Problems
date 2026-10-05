import java.util.HashSet;
public class LC3_longestSubstringWithoutDuplicateCharacters {
    public static void main(String[] args)
    {//remove the char if duplicate and move right to add new char to set. this way 
        String s = "abcabcbb";
        int maxLength = 0; // find max length of substring without duplicate characters
        int left = 0;
       // int right = 0;
        HashSet<Character> set = new HashSet<>();
       //check all char whether duplicate or not
       for ( int right =0; right < s.length() ; right++)
       {
if (set.contains(s.charAt(right)))
{
    set.remove(s.charAt(left));
    left++;

       }
      //abcabcbb - bca because left a removed
set.add(s.charAt(right));

    int CurrentLength = right - left + 1;
    if(CurrentLength > maxLength)
    {
        maxLength = CurrentLength;
    }

}

    
     System.out.println(maxLength);
}
}
        
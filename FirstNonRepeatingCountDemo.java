import java.util.HashMap;
public class FirstNonRepeatingCountDemo {
    public static void main(String[] args)
    {
        //a=2, b=2, c=1, d=1, e=1 -> First non char "c"
        HashMap<Character, Integer> map = new HashMap<>();
        String s = "aabbcde";
        //Find the count frequency
        for (int i=0; i<s.length() ; i++)
    {
        char ch = s.charAt(i);
        if(map.containsKey(ch))
        {
        map.put(ch, map.get(ch) + 1);
        }
        else
        {
            map.put(ch, 1);

        }
        }
        //find 1st non repeating char
        for (int i=0 ; i<s.length() ; i++)
            
    {
          char ch = s.charAt(i);
if (map.get(ch) == 1)
{
  
    System.out.println("First non-repeating character: " + ch);
    break;
}
    }
    }

    }
    


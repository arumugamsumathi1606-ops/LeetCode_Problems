import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args)
    {
String s1 = "listen";
String s2 = "silent";
HashMap<Character, Integer> freqCount_S1 = new HashMap<>();
HashMap<Character, Integer> freqCount_S2 = new HashMap<>();
for(int i=0 ; i<s1.length() ; i++)
{
    char ch = s1.charAt(i);
    if(freqCount_S1.containsKey(ch))
    {
       int Count =  freqCount_S1.get(ch);
       freqCount_S1.put(ch, Count +1);
    }
    else
    {
        freqCount_S1.put(ch, 1);
    }
}
for (int j=0 ; j<s2.length(); j++)
    {
        char ch2 = s2.charAt(j);
        if(freqCount_S2.containsKey(ch2))
        {
            int Count2 = freqCount_S2.get(ch2);
            freqCount_S2.put(ch2, Count2 +1);
        }
        else
        {
            freqCount_S2.put(ch2, 1);
        }
    }
    System.out.println("Frequency of characters in the first string: " + freqCount_S1);
    System.out.println("Frequency of characters in the second string: " + freqCount_S2);

if(freqCount_S1.equals(freqCount_S2))
{
    System.out.println("The two strings are anagrams of each other.");
}
else
{
    System.out.println("The two strings are not anagrams of each other.");
}

    }
}
    


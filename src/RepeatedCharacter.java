import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;

public class RepeatedCharacter {




    public static Character firstRepeatingChar(String str) {

        System.out.println("first repeating " + firstRepeatingChar("Java Developer"));

        String data="Java Developer";

        Set<Character>  chars= new HashSet<>();

        for (Character ch : str.toCharArray())

            if (!chars.add(ch))  return ch;
        return null;



        }

        }



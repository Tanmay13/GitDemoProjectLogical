package com.String;

import java.util.HashSet;

public class uniquechar {
    
    public static void main (String args[])
    {
        boolean result=false;
        String inputstring=" Alive swum";
        System.out.println(inputstring);
        HashSet < Character> uniquecharset= new HashSet();
        for(int i=0;i < inputstring.length();i++)
        {
            result=uniquecharset.add(inputstring.charAt(i));
            if (result == false)
            break;
        }
    System.out.println(result); }
}
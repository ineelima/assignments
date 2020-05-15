package com.dwivedi.strings;

import java.util.HashSet;
import java.util.LinkedHashMap;

public class LongestSubstring {

    public static String findString(String str) {

        if (str == null || str.length() == 0) {
            return null;
        }
        char[] charArr = str.toCharArray();
        String longsubString = null;
        int substrLen = 0;
        LinkedHashMap<Character, Integer> linkMap = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < charArr.length; i++) {
            if (!linkMap.containsKey(charArr[i])) {
                linkMap.put(charArr[i], i);
            } else {
                i = linkMap.get(charArr[i]);
                if (linkMap.size() > substrLen) {
                    substrLen = linkMap.size();

                    StringBuffer sb=new StringBuffer();
                    for(char c:linkMap.keySet()){
                        sb.append(c);
                    }
                    longsubString = sb.toString();
                }
                linkMap.clear();
            }
        }
        if (linkMap.size() > substrLen) {
            substrLen = linkMap.size();
            StringBuffer sb=new StringBuffer();
            for(char c:linkMap.keySet()){
                sb.append(c);
            }
            longsubString = sb.toString();
        }

        System.out.println("Input String : " + str);

        System.out.println("The longest substring : " + longsubString);

        System.out.println("The longest Substring Length : " + substrLen);
        return longsubString;
    }

    public static void main(String[] args) {
        LongestSubstring.findString("fwwwfde");


    }
}


package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main
{

    public static void main(String[] args)
    {

    }

    public Map<String, Integer> word0(String[] strings)
    {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++)
        {
            map.put(strings[i], 0);
        }

        return map;
    }

    public Map<String, Integer> wordLen(String[] strings)
    {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++)
        {
            map.put(strings[i], strings[i].length());
        }

        return map;
    }

    public Map<String, String> pairs(String[] strings)
    {
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++)
        {
            map.put(strings[i].substring(0, 1), strings[i].substring(strings[i].length() - 1));
        }

        return map;
    }

    public Map<String, Integer> wordCount(String[] strings)
    {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++)
        {
            if (map.containsKey(strings[i]))
            {
                int count = map.get(strings[i]);
                map.put(strings[i], count + 1);
            }
            else
            {
                map.put(strings[i], 1);
            }
        }

        return map;
    }

    public Map<String, String> firstChar(String[] strings)
    {
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++)
        {
            String str = strings[i].substring(0, 1);

            if (map.containsKey(str))
            {
                String val = map.get(str) + strings[i];
                map.put(str, val);
            }
            else
            {
                map.put(str, strings[i]);
            }
        }

        return map;
    }

    public String wordAppend(String[] strings)
    {
        String wordAppend = "";
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++)
        {
            String str = strings[i];

            if (map.containsKey(str))
            {
                int count = map.get(str);
                count++;

                if (count % 2 == 0)
                {
                    wordAppend += str;
                }

                map.put(str, count);
            }
            else
            {
                map.put(str, 1);
            }
        }

        return wordAppend;
    }

    public Map<String, Boolean> wordMultiple(String[] strings)
    {
        Map<String, Boolean> map = new HashMap<>();
        Map<String, Integer> counts = new HashMap<>();

        for (int i = 0; i < strings.length; i++)
        {
            String str = strings[i];

            if (counts.containsKey(str))
            {
                int j = counts.get(str);
                j++;
                counts.put(str, j);
            }
            else
            {
                counts.put(str, 1);
            }

            map.put(str, counts.get(str) >= 2);
        }

        return map;
    }

    public String[] allSwap(String[] strings)
    {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++)
        {
            String str = strings[i].substring(0, 1);

            if (map.containsKey(str))
            {
                int position = map.get(str);
                String j = strings[position];
                strings[position] = strings[i];
                strings[i] = j;

                map.remove(str);
            }
            else
            {
                map.put(str, i);
            }
        }

        return strings;
    }

    public String[] firstSwap(String[] strings)
    {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++)
        {
            String str = strings[i].substring(0, 1);

            if (map.containsKey(str))
            {
                int j = map.get(str);

                if (j == -1)
                {
                    continue;
                }

                int position = map.get(str);
                String temp = strings[position];
                strings[position] = strings[i];
                strings[i] = temp;

                map.put(str, -1);
            }
            else
            {
                map.put(str, i);
            }
        }

        return strings;
    }
}
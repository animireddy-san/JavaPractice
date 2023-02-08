package com.javapractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class ArrayListExample1 {
	
	public static void main(String args[])
	{
		ArrayList<String> ls=new ArrayList<>();
		ls.add("ss");
		ls.add("bb");
		
		Collections.sort(ls);
		
		for(String s:ls)
		{
			//System.out.println(s);sfsdsgdg
		}
		System.out.println(ls.get(0));
		
		Iterator it=ls.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		ls.forEach(x->System.out.println(x));
		
		if(ls.isEmpty())
		{
			System.out.println("enter into ");
		}
		
		
		HashSet<String> hs=new HashSet<>();
		hs.add("app");
		hs.add("ball");
		
		for(String s:hs)
		{
			System.out.println(s);
		}
		
		
		Map<String,Integer> h=new HashMap<>();
		
		h.put("s", 1);
		
		for(Map.Entry data:h.entrySet())
		{
			System.out.println("key="+data.getKey());
			System.out.println("value=="+data.getValue());
			
		}
		
		for(String key:h.keySet())
		{
			System.out.println("key111=="+key);
		}
		
		
		
		
		
		
		}

}

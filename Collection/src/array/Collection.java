package array;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class Collection {
	public static void main(String[] args) {
	
//		ArrayList<String> list = new ArrayList<>();
//		list.add("vijay");
//		list.add("ravi");
//		list.add("ajay");
//		list.add("ravi");
//		
//		Iterator itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		
//		LinkedList<String> x= new LinkedList<String>();
//		x.add("Ram");
//		x.add("rana");
//		x.add("manu");
//
//		Iterator<String>itr=x.iterator();
//		while(itr.hasNext()) {
//		System.out.println(itr.next());
//		
//	}
//		Vector<String> v=new Vector<>();
//		v.add("ram");
//		v.add("mani");
//		v.add("tripura");
//		Iterator<String> m=v.iterator();
//		while(m.hasNext()) {
//			System.out.println(m.next());
//		}
//		
//		LinkedList<String> list = new LinkedList<String>();
//		list.add("java");
//		list.add("j2ee");
//		list.add("jsp");
//		list.add("servlet");
//		list.add("jdbc");
//		System.out.println(list);
//		String s = "jsp";
//		//check wether list contain "jsp"
//		boolean contains = list.contains(s);
//		if(contains) {
//			System.out.println(list.indexOf(s));
//		}
//		s="STRUCTS";
//		contains = list.contains("STRUCTS");
//		if(contains)
//		{
//			System.out.println(list.indexOf(s));
//		}

        HashMap<String, String> map = new HashMap<String,String>();
        map.put("one","AAA");
        map.put("two","BBB");
        map.put("three","CCC");
        map.put("four","DDD");
        map.put("five","EEE");

        System.out.println("HashMap Before Replace :");
        
        Set<java.util.Map.Entry<String, String>> keyValueSet = map.entrySet();
                 
        for (java.util.Map.Entry<String, String> entry : keyValueSet) 
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
                 
        System.out.println("------------------");
         
        //Replacing the value associated with 'FOUR' to '444' only if it is currently mapped to 'DDD'
         
        map.replace("FOUR", "DDD", "444");
         
        System.out.println("HashMap After Replace :");
                 
        for (java.util.Map.Entry<String, String> entry : keyValueSet) 
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
		
	
	}}

	


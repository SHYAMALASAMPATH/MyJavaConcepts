package com.collectionframeworks;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapDemo 
{
public static void main(String[] args)
{
HashMap m = new HashMap();
m.put(100, "chiru");
m.put(200, "balaiah");
m.put(300, "nag");
m.put(400, "venky");
System.out.println("map data is m :"+m);
//inseting duplIcate key
System.out.println(m.put(100, "ramcharan"));//old value it return
System.out.println(m);
//getting only keys
Set s = m.keySet();
System.out.println("keys are m is :"+s);
//getting only values
Collection values =m.values();
System.out.println("values in map m is :"+values);
//getting entry wise data 
Set entrys = m.entrySet();
System.out.println("entrys in map m is :"+entrys);
// for applyin entry methods
Iterator itr = entrys.iterator();
int i =1;
while (itr.hasNext() &&  i <=4)
{
	Map.Entry entry =(Entry) itr.next();
	
	if(entry.getKey().equals(200))
	{
		entry.setValue("ntr");
	}
	
System.out.println("entry "+ i +" key is :"  +entry.getKey()  + "   value is :"+entry.getValue());
i++;
}
System.out.println("printing through entry wise :"+m);

}
}

package May_30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class List_Array 
{
	public static void main(String[] args) 
	{
			HashMap<Integer,String> obj=new HashMap<Integer,String> ();
		
        obj.put(12, "Deepak");
        obj.put(13, "karishma");
        obj.put(14, "Raman");
        obj.put(15, "Amit");
        obj.put(16, "Niyati");
        obj.put(17, "Lucky");
        //obj.put(17, "kanika");
        //obj.put(18,"kanika");
        
        Set<Integer> allkey=obj.keySet();//it will give all the keys
        
        for(Integer i:allkey)
        {
        	System.out.println("key is "+i);
        	System.out.println("value is "+obj.get(i) );
        }
        
        	
	}

}

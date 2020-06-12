package May_30;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Map_linkedHashmap
{public static void main(String[] args)
{
	LinkedHashMap<Integer, String> hm=new LinkedHashMap<Integer, String>();
	
	hm.put(12, "deepak");
	hm.put(11, "deep");
	hm.put(111, "channa");
	hm.put(1122, "karishma");
	hm.put(1, "amit");
	hm.put(2222, "kanika");
	
	Set<Integer> all_keys=hm.keySet();// it will give all the keys
	
	for(Integer a:all_keys)
	{
		System.out.println("key is "+a);
		System.out.println("value is "+hm.get(a));
	}
	
}

}

package pack1;



import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class mapDemo {
	public static void main(String[] args)
	{
		// map
		
		//Hashmap
		HashMap<Integer,String> h=new HashMap<Integer,String>();      
	      h.put(1,"Jhon");    
	      h.put(2,"Siri");    
	      h.put(3,"Sony");   
	       
	      System.out.println("\nThe elements of Hashmap are:");  
	      for(Map.Entry m:h.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Anu");  
	      ht.put(5,"Rosy");  
	      ht.put(6,"Janu");  
	      ht.put(7,"rose");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Ammu");    
	      map.put(9,"chetu");    
	      map.put(10,"preetu");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
      	} 
	}

}

package newupdate;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class ALllJava {
  String s = "hello Pritesh";
  char[] ch  = s.toCharArray();
  @Test
  public void duplicate()
  {
	  for(int i =0 ; i<=ch.length-1; i++)
	  {
		  int count =0;
		  for(int j =i+1; j<=ch.length-1; j++)
		  {
			  if(ch[i]==ch[j])
			  {
				  count = count +1;
			  }
		  }
		  if(count>=1)
		  {
			  System.out.println(ch[i]);
		  }
	  }
	  
	  
  }
 // @Test
  public void mapu()
  {
	  Map<Character ,Integer > map = new HashMap<Character,Integer >();
	  String s = "hello Pritesh";
	  char[] ch  = s.toCharArray();
	  
	  for(Character cha :ch)
	  {
		  if(map.containsKey(cha))
		  {
			  map.put(cha, map.get(cha)+1);
		  }
		  else
		  {
			  map.put(cha, 1);
		  }
		  
	}
	  Set<Character> set = map.keySet();
	  for(Character chh : set)
	  {
		  if(map.get(chh)>1)
		  {
			  System.out.println(chh+ " "+ map.get(chh)+ " times");
		  }
	  }
	  
	  }
  @Test
  public void patteren()
	{
	  
	  for( int i = 0 ; i<=5 ;i++)
	  {
		  for(int j = 0 ; j<=5 ; j++)
		  {
			  System.out.print(" ");
		  }
		  for( int k = 0 ; k<=i ; k++)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
	  
	  for( int i =0 ;i<=5 ; i ++)
	  {
		  for(int j= 0 ; j<=5-i ;j++)
		  {
			  System.out.print(" ");
		  }
		  for(int k=0;k<=i ; k++)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
	}
 
}

package Java;

import java.util.*;

public class Count_character_frequency {

	public static void main(String[] args) {
	
		String str = "Programming";
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(char c:str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
		
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
			//System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	
}

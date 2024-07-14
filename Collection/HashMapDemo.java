package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo{
	public static ArrayList<Integer> duplicates(int arr[]) {
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hs.containsKey(arr[i])){
                hs.put(arr[i],((int)hs.get(arr[i]))+1);
            }else{
                 hs.put(arr[i],1);
            }
        }
        
        System.out.println(hs);
        for(Entry<Integer, Integer> entry:hs.entrySet()){
        	int val = entry.getValue();
            if(val==2){
                al.add(entry.getKey());
            }
        	if(val>1)
        	System.out.println(entry.getKey()+"  "+entry.getValue());
        }
        if(al.isEmpty()){
            al.add(-1);
        }
        return al;
    }
	public static void main(String[] args) {
		int arr[] = {2 ,0 ,3 ,3 ,1,1};
		System.out.println(duplicates(arr));
	}
}
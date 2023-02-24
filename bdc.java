//package myPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class bdc {

    public static void main(String[] args) {

        HashMap<String, String> hash = new HashMap<String, String>();

        hash.put("name", "Vaibhav");
        hash.put("number", "123");
        hash.put("country", "India");

        //System.out.println(hash.get("name"));


        //1st Method
	/*	Iterator<String> iterator = hash.keySet().iterator();

		while(iterator.hasNext()){
			String key = iterator.next();
			System.out.println(key  +" : "+ hash.get(key));
*/

        //2nd Method
        for(Entry<String,String> entry: hash.entrySet() ){
            System.out.println(entry.getKey() +" : "+entry.getValue());



        }


    }

}
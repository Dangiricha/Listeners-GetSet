package Test_Nov10;

import java.util.ArrayList;
import java.awt.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.http.util.Asserts;
//import org.testng.Assert;


public class Example {
	public  void Example1(){
	ArrayList<String> a1 = new ArrayList<String>();
	a1.add("Obj1");
	a1.add("Obj2");
	a1.add("OBJ3");
	
	
for (String s:a1){
	System.out.println(s);
}}
	public  void Example2(){
ArrayList<Integer> a2 = new ArrayList<Integer>();
a2.add(1);
a2.add(2);
a2.add(3);


for (Integer inte:a2){
System.out.println(inte);
}}
	
	//list comparison
public static void ComparisonExample(){
	ArrayList<String> list1= new ArrayList<String>();
	list1.add("123");
	list1.add("456");
	list1.add("378");
	
	ArrayList<String> list2= new ArrayList<String>();
	list2.add("123");
	list2.add("456");
	list2.add("378");

	if(list1.equals(list2)){
		System.out.println("matching");
	}else
	{
		System.out.println("not matching");
		//Assert.fail("Not Matchin");
	}
	//Asserts.assertEquals(list1,list2);
}
public static void setbasic(){
	Set<String> names = new HashSet<>();
	names.add("tom");
	names.add("jerry");
	names.add("katty");
	
	Iterator<String> iterator = names.iterator();
	while (iterator.hasNext()){
		String name = iterator.next();
		System.out.println(name);
	}
	//enhanced loop
	for (String name: names){
		System.out.println(name);
	}
	//foreach
	names.forEach(System.out::println);
	
	//search
	if (names.contains("tom")){
		System.out.println("found tom");
	}
	
	
	}
	

	
	
	
	
	
	
	
	
	
	
}

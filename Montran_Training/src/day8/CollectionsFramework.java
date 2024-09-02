package day8;

import java.util.*;
import java.util.Map.Entry;
//ArrayList
public class CollectionsFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"Hello","Hi","Bye","Good","Hello","Good","Happy","C++","Java"};
		List<String> list1 = new ArrayList<String>();
		list1.addAll(Arrays.asList(str));
		
		System.out.println("----------ArrayList---------");
		System.out.println("using for loop");
		for(String s:list1) {
			System.out.println(s);
			
		}
		System.out.println("\n");
		System.out.println("using iterator");
		Iterator <String> itr=list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		// priority Queue(it takes default value but to give priority use compare ,it is in sorted manner,duplicate value
		PriorityQueue<String> q=new PriorityQueue<String>();
		q.addAll(Arrays.asList(str));
		
		System.out.println("------Priority Queue--------");
		System.out.println("head:"+q.element());//displays head
		System.out.println("Peek:"+q.peek());//Retrieves, but does not remove, the head of this queue,or returns null if this queue is empty
		System.out.println("using iterator");
		Iterator <String> it=q.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
	}
		System.out.println("Display size:"+q.size());
		q.remove();
		q.poll();//Retrieves and removes the head of this queue,or returns null if this queue is empty.
		System.out.println("after changing");
		Iterator <String> itr1=q.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
	}
		//hashset(no duplicate value
		HashSet<String> set=new HashSet<String>();
		set.addAll(Arrays.asList(str));
		
		System.out.println("-------HashSet-------");
		Iterator <String> i=set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
	}

	//TreeSet(sorts in ascending order,no duplicate value
	TreeSet<String> t=new TreeSet<String>();
	t.addAll(Arrays.asList(str));
	
	System.out.println("-------TreeSet-------");
	Iterator <String> tree=t.iterator();
	while(tree.hasNext()) {
		System.out.println(tree.next());
}
	//HashMap (stores key value pair,unordered collection
	
	Map<String,Integer> hm=new HashMap<>();
hm.put( "Simone",3)	;
hm.put(null, null);
hm.put("Sherwin",5);
hm.put("Aaron",1);
hm.put("Abc", 2);
hm.put("Britney", 8);
	System.out.println("-------HashMap-------");
	Iterator <Map.Entry<String,Integer> >is = hm.entrySet().iterator();
	while(is.hasNext()) {
		Map.Entry<String,Integer> entry=is.next();
		System.out.println("Key:"+entry.getKey()+"Value:"+entry.getValue());

}
	
	//Treeset(doesnt take null value,it maintains the ordered n returns in sorted order
	
	Map<String,Integer> tm=new TreeMap<>();
	tm.put( "Simone",3)	;
	tm.put("Sherwin",5);
	tm.put("Aaron",1);
		System.out.println("-------TreeMap-------");
		Iterator <Map.Entry<String,Integer> >trees = tm.entrySet().iterator();
		while(trees.hasNext()) {
			Map.Entry<String,Integer> ent=trees.next();
			System.out.println("Key:"+ent.getKey()+"Value:"+ent.getValue());
}
}
}
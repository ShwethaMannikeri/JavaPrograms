package HackathonTest;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorConcept {
	
	  public static void main(String[] args) {
	    ArrayList<String> arr = new ArrayList<String>();
	    arr.add("aaa");
	    arr.add("bbb");
	    arr.add("ccc");
	    arr.add("eee");
	    Iterator<String> it = arr.iterator();
	    while(it.hasNext()) {
	    	 System.out.println(it.next());
	    }
	   
	  }
}

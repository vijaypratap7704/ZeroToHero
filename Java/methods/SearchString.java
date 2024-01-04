package Getting.Started.With.Java.methods;

public class SearchString {

	static void searchStr(String[] p, String r)
	  {
	    int lp = p.length;
	    int i = 0;
	    int found = 0;
	    while (i < lp)
	    {
	      if (p[i] == r)
	      {
	        System.out.println(r + " is found at index " + i);
	        found = 1;
	      }
	      i += 1;
	    }
	    if (found == 0)
	    {
	      System.out.println("*** " + r + " is NOT FOUND in the array ***");
	    }
	  }

	  public static void main(String args[])
	  {
	    String[] p = {"2", "55", "888", "9", "30", "45"};
	    String key = "88";
	    searchStr(p, key);
	  }
	}
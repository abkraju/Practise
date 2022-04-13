package ExamplesRevision;
import java.util.*;
import java.util.Map.Entry;

public class SortaMapbyValue {
   
	    private static final String Assert = null;

		public void basicTest() {
	        SortaMapbyValue sortedMap = new SortaMapbyValue();
	        sortedMap.put("A",3);
	        sortedMap.put("B",1);
	        sortedMap.put("C",2);

	        Assert.equals("{B=1, C=2, A=3}");
	    }

	    private void put(String string, int i) {
			// TODO Auto-generated method stub
			
		}

	
	    public void repeatedValues() {
	        Map<String, Double> sortedMap = new Map<>();
	        sortedMap.put("D",67.3);
	        sortedMap.put("A",99.5);
	        sortedMap.put("B",67.4);
	        sortedMap.put("C",67.4);

	        Assert.assertEquals("{D=67.3, B=67.4, C=67.4, A=99.5}", sortedMap.toString());
	    }

	}
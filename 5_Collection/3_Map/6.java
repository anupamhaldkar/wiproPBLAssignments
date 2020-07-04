import java.util.*;

public class CountryCapitalT {
	private Hashtable<String,String> M1 = new Hashtable<String,String>();
	
	public Hashtable<String, String> saveCountryCapital(String CountryName, String capital) {
		M1.put(CountryName, capital);
		return M1;
	}
	
	public String getCapital(String CountryName) {
		return M1.get(CountryName);
	}
	
	public String getCountry(String capitalName) {
		Set<Map.Entry<String,String>> set = M1.entrySet();
		Iterator<Map.Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			if (me.getValue().equalsIgnoreCase(capitalName))
				return me.getKey();
		}
		
		return null;
	}
	
	public Hashtable<String, String> swapKyeValue() {
		Hashtable<String, String> M2 = new Hashtable<String, String>();
		Set<Map.Entry<String, String>> set = M1.entrySet();
		Iterator<Map.Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			M2.put(me.getValue(), me.getKey());
		}
		return M2;
	}
	
	public ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>();
		Set<Map.Entry<String, String>> set = M1.entrySet();
		Iterator<Map.Entry<String, String>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}
		return list;
	}

	public static void main(String[] args) {
		CountryCapital countryCap = new CountryCapital();

		countryCap.saveCountryCapital("India", "Delhi");
		countryCap.saveCountryCapital("Australia", "Canbera");
		countryCap.saveCountryCapital("USA", "Washington D.C.");
		
		System.out.println(countryCap.getCapital("India"));
		System.out.println(countryCap.getCountry("Canbera"));
		System.out.println(countryCap.toArrayList());
		
		HashMap<String, String> M2 = countryCap.swapKyeValue();
		System.out.println(M2);
	}

}

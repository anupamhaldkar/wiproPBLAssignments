import java.util.*;
class Nation {
	HashSet<String> H1 = new HashSet<>();
	HashSet<String> saveCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	
String getCountry(String CountryName) {
		Iterator<String> it = H1.iterator();
		
		while (it.hasNext()) {
			if (it.next().equals(CountryName))
				return CountryName;
		}
		
		return null;
	}

	public static void main(String[] args) {
		Nation countries = new Nation();
		countries.saveCountryNames("India");
		countries.saveCountryNames("USA");
		countries.saveCountryNames("Russia");
		countries.saveCountryNames("Australia");
		countries.saveCountryNames("Israel");

		System.out.println("India: " + countries.getCountry("India"));
		System.out.println("Japan: " + countries.getCountry("Japan"));		
	}
}

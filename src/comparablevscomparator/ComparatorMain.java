package comparablevscomparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {

	/**
	 * @author Arpit Mandliya
	 */
	public static void main(String[] args) {
		 ComparatorCountry indiaComparatorCountry=new ComparatorCountry(1, "India");
		 ComparatorCountry chinaComparatorCountry=new ComparatorCountry(4, "China");
		 ComparatorCountry nepalComparatorCountry=new ComparatorCountry(3, "Nepal");
		 ComparatorCountry bhutanComparatorCountry=new ComparatorCountry(2, "Bhutan");

	        List<ComparatorCountry> listOfCountries = new ArrayList<ComparatorCountry>();
	        listOfCountries.add(indiaComparatorCountry);
	        listOfCountries.add(chinaComparatorCountry);
	        listOfCountries.add(nepalComparatorCountry);
	        listOfCountries.add(bhutanComparatorCountry);

	        System.out.println("Before Sort by id : ");
	        for (int i = 0; i < listOfCountries.size(); i++) {
				ComparatorCountry ComparatorCountry=(ComparatorCountry) listOfCountries.get(i);
				System.out.println("ComparatorCountry Id: "+ComparatorCountry.getCountryId()+"||"+"ComparatorCountry name: "+ComparatorCountry.getCountryName());
			}
	        Collections.sort(listOfCountries,new CountrySortByIdComparator());

	        System.out.println("After Sort by id: ");
	        for (int i = 0; i < listOfCountries.size(); i++) {
				ComparatorCountry ComparatorCountry=(ComparatorCountry) listOfCountries.get(i);
				System.out.println("ComparatorCountry Id: "+ComparatorCountry.getCountryId()+"|| "+"ComparatorCountry name: "+ComparatorCountry.getCountryName());
			}

	        //Sort by ComparatorCountryName
	        Collections.sort(listOfCountries,new Comparator<ComparatorCountry>() {

				@Override
				public int compare(ComparatorCountry o1, ComparatorCountry o2) {
					return o1.getCountryName().compareTo(o2.getCountryName());
				}
			});

			System.out.println("After Sort by name: ");
	        for (int i = 0; i < listOfCountries.size(); i++) {
				ComparatorCountry ComparatorCountry=(ComparatorCountry) listOfCountries.get(i);
				System.out.println("ComparatorCountry Id: "+ComparatorCountry.getCountryId()+"|| "+"ComparatorCountry name: "+ComparatorCountry.getCountryName());
			}
	}

}
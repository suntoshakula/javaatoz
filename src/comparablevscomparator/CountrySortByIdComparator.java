package comparablevscomparator;
import java.util.Comparator;
//If country1.getCountryId()<country2.getCountryId():then compare method will return -1
//If country1.getCountryId()>country2.getCountryId():then compare method will return 1
//If country1.getCountryId()==country2.getCountryId():then compare method will return 0
 public class CountrySortByIdComparator implements Comparator<ComparatorCountry>{

    @Override
    public int compare(ComparatorCountry country1, ComparatorCountry country2) {

        return (country1.getCountryId() < country2.getCountryId() ) ? -1: (country1.getCountryId() > country2.getCountryId() ) ? 1:0 ;
    }

}
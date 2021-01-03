package comparablevscomparator;
//If this.cuntryId < country.countryId:then compare method will return -1
//If this.countryId > country.countryId:then compare method will return 1
//If this.countryId==country.countryId:then compare method will return 0
public class Country implements Comparable{
    int countryId;
    String countryName;

    public Country(int countryId, String countryName) {
        super();
        this.countryId = countryId;
        this.countryName = countryName;
    }

    @Override
    public int compareTo(Object arg0) {
        Country country=(Country) arg0;
        return (this.countryId < country.countryId ) ? -1: (this.countryId > country.countryId ) ? 1:0 ;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

}
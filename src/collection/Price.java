package collection;

public class Price {
	
	private String item;
	private int price;
	
	
	public Price(String item, int price) {
		
		this.item = item;
		this.price = price;		
	}
	
	public boolean equals(Object obj){
        if (obj instanceof Price) {
            Price pp = (Price) obj;
            return (pp.item.equals(this.item) && pp.price == this.price);
        } else {
            return false;
        }
    }
	
	public int hashCode(){
        int hashcode = 0;
        //hashcode = price;
        hashcode += item.hashCode();
        return hashcode;
    }


	public String getItem() {
		return item;
	}


	public void setItem(String item) {
		this.item = item;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return "item: " +item + " price: "+price;
	}

}

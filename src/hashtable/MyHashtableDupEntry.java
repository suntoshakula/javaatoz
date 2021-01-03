package hashtable;
import java.util.Hashtable;
import java.util.Set;
 
public class MyHashtableDupEntry {
 
    public static void main(String a[]){
 
        Hashtable<ObjMaxComparable,String> tm = new Hashtable<ObjMaxComparable, String>();
        tm.put(new ObjMaxComparable(134,"Ram",3000), "RAM");
        tm.put(new ObjMaxComparable(235,"John",6000), "JOHN");
        tm.put(new ObjMaxComparable(876,"Crish",2000), "CRISH");
        tm.put(new ObjMaxComparable(512,"Tom",2400), "TOM");
        System.out.println("Adding duplicate entry:");
        tm.put(new ObjMaxComparable(512,"Tom",2400), "TOM");
        System.out.println("Hashtable entries:");
        Set<ObjMaxComparable> keys = tm.keySet();
        for(ObjMaxComparable key:keys){
            System.out.println(key+" ==> "+tm.get(key));
        }
        System.out.println("Duplicate got eliminated!!!");
        
        System.out.println("getting user defined object");
        ObjMaxComparable e = new ObjMaxComparable(512,"Tom",2400);
        System.out.println(e+" ==> "+tm.get(e));
        
    }
}
 
class ObjMaxComparable{
     
    private String name;
    private int salary;
    private int id;
     
    public ObjMaxComparable(int id, String n, int s){
        this.id = id;
        this.name = n;
        this.salary = s;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Id: "+this.id+" -- Name: "+this.name+" -- Salary: "+this.salary;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public int getId() {
        return id;
    }
     
    @Override
    public int hashCode() {
        System.out.println("In hashcode");
        return this.getId();
    }
     
    @Override
    public boolean equals(Object obj) {
        ObjMaxComparable e = null;
        if(obj instanceof ObjMaxComparable){
            e = (ObjMaxComparable) obj;
        }
        System.out.println("In equals");
        if(this.getId() == e.getId()){
            return true;
        } else {
            return false;
        }
         
    }
}
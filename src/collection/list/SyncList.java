package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> synclist = new ArrayList<String>();
		synclist.add("first");
		synclist.add("second");
		System.out.println(Collections.synchronizedList(synclist));

	}

}

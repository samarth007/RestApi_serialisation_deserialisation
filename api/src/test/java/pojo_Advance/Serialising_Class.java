package pojo_Advance;

import java.util.ArrayList;

public class Serialising_Class {

	
	public static Parent CreateObject() {
		Parent p = new Parent();
		p.setPer_page(2);
		p.setPage(3);
		p.setTotal(12);
		p.setTotal_pages(2);
		Support s = new Support();
		s.setText("To keep ReqRes free, contributions towards server costs are appreciated!");
		s.setUrl("https://reqres.in/#support-heading");
		p.setSupport(s);
		
		ArrayList<Data> al = new ArrayList<Data>();
		al.add(0, Data_ArrayList.Create_Object(22, "tvf", "cubicles", "unkno@yahoo.com", "nulll"));
		al.add(1, Data_ArrayList.Create_Object(7, "netflix", "lime", "like@yahoo.com", "cobra"));
		
		p.setData(al);
		
		return p;
	}
	
	
}

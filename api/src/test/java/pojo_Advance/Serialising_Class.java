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
		
		Data d = new Data();
		d.setEmail("lawson@reqres.in");
		d.setFirst_name("Michael");
		d.setLast_name("Lawson");
		d.setAvatar("https://reqres.in/img/faces/7-image.jpg");
		d.setId(2);
		
		Data d1 = new Data();
		d1.setEmail("lawson@reqres.in");
		d1.setFirst_name("Michael");
		d1.setLast_name("Lawson");
		d1.setAvatar("https://reqres.in/img/faces/7-image.jpg");
		d1.setId(2);
		ArrayList<Data> al = new ArrayList<Data>();
		al.add(0, d);
		al.add(1, d1);
		
		p.setData(al);
		
		return p;
	}
	
	
}

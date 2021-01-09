package pojo_Advance;

public class Data_ArrayList {

	
	public static Data Create_Object(int id, String fst_name, String lst_name,String email,String Avtr) {
		
		Data d = new Data();
		d.setId(id);
		d.setFirst_name(fst_name);
		d.setLast_name(lst_name);
		d.setAvatar(Avtr);
		d.setEmail(email);
		
		return d;
	}
	
	
	
	
}

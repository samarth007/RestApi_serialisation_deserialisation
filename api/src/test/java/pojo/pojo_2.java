package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class pojo_2 {

	private data_pojo data;
	private support_pojo support;
	
	
	
	public support_pojo getSupport() {
		return support;
	}
	public void setSupport(support_pojo support) {
		this.support = support;
	}
	public data_pojo getData() {
		return data;
	}
	public void setData(data_pojo data) {
		this.data = data;
	}
	
	
	
}

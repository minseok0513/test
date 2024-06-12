package Plane;

public class Plane {
	private String id;
	private int P_num;
	private String model_name;
	private static int nplanes=0;
	Plane(){
		nplanes++;
	}
	Plane(String id, int P_num,String model_name){
		this.id=id;
		this.P_num=P_num;
		this.model_name=model_name;
		nplanes++;
	}
	public void setId(String id) {
		this.id=id;
	}
	public void setP_num(int P_num) {
		this.P_num=P_num;
	}
	public void setModel_name(String model_name) {
		this.model_name=model_name;
	}
	public String getId() {
		return id;
	}
	public int getP_num() {
		return P_num;
	}
	public String getModel_name() {
		return model_name;
	}
	public String toString() {
		return "Plane{"+"id="+id+","+"model_name="+model_name+","+"P_num="+P_num+"}";
	}
	public static int getNplanes() {
		return nplanes;
	}
	
}

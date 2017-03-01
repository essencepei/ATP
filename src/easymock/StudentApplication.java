package easymock;

public class StudentApplication {
	IStudent wms = null;
	public IStudent getWms() {
		return wms;
	}

	public void setWms(IStudent wms) {
		this.wms = wms;
	}

	public StudentApplication(){
		
	}
	
	public String domethod(){
		String s1 = wms.domethod1();
		String s2 = wms.domethod2();
		String s3 = wms.domethod3();
		return s1+s2+s3;
	}
	
}

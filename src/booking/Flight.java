package booking;

public class Flight {
	private int a1;//航班号
	private String a2;//起飞时间
	private String a3;//降落时间
	private String a4;//起飞时间
	private String a5;//降落城市
	private int a6;//余票
	
    public Flight() {
    	
    }
	public Flight(int a1,String a2,String a3,String a4,String a5,int a6) {
	this.a1=a1;
	this.a2=a2;
	this.a3=a3;
	this.a4=a4;
	this.a5=a5;
	this.a6=a6;
	}



	public int getA1() {
		return a1;
	}

	public void setA1(int a1) {
		this.a1 = a1;
	}

	public String getA2() {
		return a2;
	}

	public void setA2(String a2) {
		this.a2 = a2;
	}

	public String getA3() {
		return a3;
	}

	public void setA3(String a3) {
		this.a3 = a3;
	}

	public String getA4() {
		return a4;
	}

	public void setA4(String a4) {
		this.a4 = a4;
	}

	public String getA5() {
		return a5;
	}

	public void setA5(String a5) {
		this.a5 = a5;
	}

	public int getA6() {
		return a6;
	}

	public void setA6(int a6) {
		this.a6 = a6;
	}
	
}

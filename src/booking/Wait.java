package booking;

public class Wait {
	private String b1;
	private String b2;
	private String b3;
	private String no;
	private int num;
	
	public Wait() {
		
	}
	public Wait(String b1,String b2,String b3,String no,int num) {
		this.b1=b1;
		this.b2=b2;
		this.b3=b3;
		this.no=no;
		this.num=num;
	}
	public String getB1() {
		return b1;
	}
	public void setB1(String b1) {
		this.b1 = b1;
	}
	public String getB2() {
		return b2;
	}
	public void setB2(String b2) {
		this.b2 = b2;
	}
	public String getB3() {
		return b3;
	}
	public void setB3(String b3) {
		this.b3 = b3;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}

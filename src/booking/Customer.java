package booking;

public class Customer {
  	
	private String name;
	private int seat;
	private int num;
	private String no;
	private int ps;
	private String jls;
	private String qfs;
	private String qfd;
	private String jld;
	public Customer() {
		
	}
	public Customer(String name,int seat,int num,String no,int ps,String jls,String qfs,String qfd,String jld) {
		this.name=name;
		this.seat=seat;
		this.num=num;
		this.no=no;
		this.ps=ps;
		this.jls=jls;
		this.qfs=qfs;
		this.qfd=qfd;
		this.jld=jld;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getPs() {
		return ps;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}
	public String getJls() {
		return jls;
	}
	public void setJls(String jls) {
		this.jls = jls;
	}
	public String getQfs() {
		return qfs;
	}
	public void setQfs(String qfs) {
		this.qfs = qfs;
	}
	public String getQfd() {
		return qfd;
	}
	public void setQfd(String qfd) {
		this.qfd = qfd;
	}
	public String getJld() {
		return jld;
	}
	public void setJld(String jld) {
		this.jld = jld;
	}
	
}

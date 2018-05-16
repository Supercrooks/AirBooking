package booking;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		Customer[] cu=new Customer[100];
 		for(int i=0;i<100;i++)
 	      cu[i] = new Customer();
 		Flight[] fl=new Flight[50];
	     for(int i=0;i<50;i++)  
	     	 fl[i]=new Flight();
	    Wait[] wa=new Wait[50];
	    for(int i=0;i<50;i++)  
	     	 wa[i]=new Wait();
	    	    
	    
		 Menu Menu =new Menu(); 
		Menu.menu();
	}
	
}

package booking;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Menu {
     private final int MAX_POSSIBILITY=100;
     public static String[] title={"航班号","起飞时间","降落时间","起飞时间","降落城市","余票量"};
     public static int[] wid= {8,10,10,10,10,8};
     public static String[] title_1= {"客户姓名","座位号","航班号","证件号","订票数","降落时间","起飞时间","起飞城市","降落城市"};
     public static int[] wid_1= {8,9,8,8,8,11,11,11,11};
     public static String[] title_2= {"客户姓名","起飞城市","降落城市","客户ID","预定票数"};
     public static int[] wid_2= {8,10,10,10,10};
     public int len=0;
     public int A=0;
     public int max_1=0;
     
        
// 		 Menu Menu =new Menu(); 
// 		Menu.menu();
 		

     
   Flight[] fl=new Flight[50];
    Customer[] cu=new Customer[100];
    Wait[] wa=new Wait[50];
     
     public static String padRight(String src, int len, char ch) {
         int diff = len - src.length();
         if (diff <= 0) {
             return src;
         }

         char[] charr = new char[len];
         System.arraycopy(src.toCharArray(), 0, charr, diff, src.length());
         for (int i = 0; i < diff; i++) {
             charr[i] = ch;
         }
         return new String(charr);
     }//右对齐函数
     
     public void luru() {
    	 System.out.println("*********请输入航班信息*********");
    	 System.out.print("请输入航班号:");
    	 
	     for(int i=0;i<50;i++)  
	     	 fl[i]=new Flight();
    	 Scanner sc=new Scanner(System.in);
    	 int sc1=sc.nextInt();
    	 fl[len].setA1(sc1);
    	 
    	 System.out.print("起飞时间:");
    	 String sc2 =sc.nextLine();
    	 fl[len].setA2(sc2);
    	 
    	 System.out.print("降落时间:");
    	 String sc3 =sc.nextLine();
    	 fl[len].setA3(sc3);
    	 
    	 System.out.print("起飞城市:");
    	 String sc4 =sc.nextLine();
    	 fl[len].setA4(sc4);
    	 
    	 
    	 System.out.print("降落城市:");
    	 String sc5 =sc.nextLine();
    	 fl[len].setA5(sc5);
    	 
    	 System.out.print("剩余票量:");
    	 int sc6 =sc.nextInt();
    	 fl[len].setA6(sc6);
    	 
    	 len++;
    	 System.out.println("请选择所要进行的操作");
    	 
    	 menu();
     }//声明录入航班信息函数
     public void chaxun() {
    	 
//    	 try {
//			clear();
//		} catch (AWTException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}//清屏
    	 System.out.println("请选择查询方式");
    	 System.out.println("1.按航班号查询");
    	 System.out.println("2.按城市查询");
    	 Scanner sc_6=new Scanner(System.in);
    	 int t=sc_6.nextInt();
    	 switch(t) {
    	 case 1:chaxun1(); break;
    	 case 2:chaxun2(); break;
    	 default :System.out.println("输入数据有误，请重新输入！");
    	 menu();
    	 break;
    	 }
     }//声明查询函数
		
    	 public static void clear() throws AWTException
    	    {
    		// TODO Auto-generated method stub
    	        Robot r = new Robot();
    	        r.mousePress(InputEvent.BUTTON3_MASK);       // 按下鼠标右键
    	        r.mouseRelease(InputEvent.BUTTON3_MASK);    // 释放鼠标右键
    	        r.keyPress(KeyEvent.VK_CONTROL);             // 按下Ctrl键
    	        r.keyPress(KeyEvent.VK_R);                    // 按下R键
    	        r.keyRelease(KeyEvent.VK_R);                  // 释放R键
    	        r.keyRelease(KeyEvent.VK_CONTROL);            // 释放Ctrl键
    	        r.delay(100);       

    	    }

	public void dingpiao() {
    	 int sign=0;
    	 for(int i=0;i<100;i++)
    	      cu[i] = new Customer();
    	 
 	    for(int i=0;i<50;i++)  
 	     	 wa[i]=new Wait();
 	    
    	 System.out.print("请输入您的姓名:");
    	 Scanner sc_7=new Scanner(System.in);
    	 String Name=sc_7.nextLine();
    	 
    	 System.out.print("请输入航  班  号:");
    	 Scanner sc_8=new Scanner(System.in);
    	 int fn=sc_8.nextInt();
    	 
    	 System.out.print("请输入预定票数:");
    	 Scanner sc_9=new Scanner(System.in);
    	 int ydps=sc_9.nextInt();
    	 
    	 System.out.print("请输入身份证号:");
    	 Scanner sc_10=new Scanner(System.in);
    	 String ID=sc_10.nextLine();
    	 
    	 for(int i=0;i<=len;i++) {
    		 if(fl[i].getA1()==fn) {//查询该航班
    			 if(fl[i].getA6()>0 && fl[i].getA6()>=ydps) {
    				 cu[A].setName(Name);
    				 cu[A].setNum(fn);
    				 cu[A].setPs(ydps);
    				 cu[A].setJld(fl[i].getA5());
    				 cu[A].setJls(fl[i].getA3());
    				 cu[A].setNo(ID);
    				 cu[A].setQfd(fl[i].getA4());
    				 cu[A].setQfs(fl[i].getA2());    				 
    				 cu[A].setSeat((int)(Math.random()*MAX_POSSIBILITY));
    				 
    				 fl[i].setA6(fl[i].getA6()-ydps);
    				 
    				 A++;
    				 sign=1;
    				 
    				 System.out.println("订票成功!");
    				 System.out.println(" ");
    				 break;
    			 }
    			 else {
    				 System.out.println("该航班余票不足!");
    				 System.out.println("是否愿意排队等候？(Y/N)");
    				 Scanner sc_11 = new Scanner(System.in);
    				 String s = sc_11.next();
    				 char r = s.charAt(0);//获取第一个字符
    				 if(r=='Y' || r=='y') {
    					 Queue queue = new LinkedList();
    					 wa[max_1].setB1(Name);
    					 wa[max_1].setB2(fl[i].getA4());
    					 wa[max_1].setB3(fl[i].getA5());
    					 wa[max_1].setNo(ID);
    					 wa[max_1].setNum(ydps);
    					 
    				        queue.offer(wa[max_1]);//入队列
    				        max_1++;
    				        System.out.println("客户，你好!你的星系我们已经记录，请等候通知!");
    				        break;
    				        //sign=1;
    				        
    				       // System.out.println(queue.size());
    				       //  String str;
    				       //while((str=queue.poll())!=null){
    				       //     System.out.print(str);
    				       // }
    				       // System.out.println();
    				       //System.out.println(queue.size());
    				 }
    			 }
    			 if(sign==1)
    				 break;
    		 }
    	 }
    	 	//if(i==len)
    	 	//	System.out.println("航班号有误!");
     }//订票函数
     public boolean tuipiao() {
    	 //清屏  	
    	 
    	 System.out.print("请输入的你的姓名:");
    	 Scanner sc_12=new Scanner(System.in);
    	 String name = sc_12.nextLine();
    	 
    	 System.out.print("请输入的你的航班号:");
    	 int fn = sc_12.nextInt();
    	 
    	 int sign=0;
    	 for(int i=0;i<len;i++) {
    		 if(fn==fl[i].getA1()) {
    			 for(int j=0;j<A;j++) {
    				 if(cu[j].getName().equals(name)) {
    					 System.out.println("退票成功!");
    					 fl[i].setA6(fl[i].getA6()+cu[j].getPs());
    					 int s=j;
    					 for(s=j;s<A;s++) {
    						 cu[s].setJld(cu[s+1].getJld());
    						 cu[s].setJls(cu[s+1].getJls());
    						 cu[s].setName(cu[s+1].getName());
    						 cu[s].setNo(cu[s+1].getNo());
    						 cu[s].setNum(cu[s+1].getNum());
    						 cu[s].setPs(cu[s+1].getPs());
    						 cu[s].setQfd(cu[s+1].getQfd());
    						 cu[s].setQfs(cu[s+1].getQfs());
    						 cu[s].setSeat(cu[s+1].getSeat());
    						 
    					 }
    				 }
    			 }
    		 }
    		 if(i>=len) {
    			 System.out.println("输入信息有误!,退票失败");
    			 menu();
    		 }
    	 }
    	 
		return true;
    	 
     }//退票函数
     public void tuichu() {
    	 System.out.println("*****欢迎下次光临*****");
     }//退出函数
     public void menu() {
    	 System.out.println("*******欢迎来到航空订票系统******");
    	 System.out.println(" ");
    	 System.out.println("**************************");
    	 System.out.println("********1.录入航空信息********");
    	 System.out.println("********2.查询航班信息********");
    	 System.out.println("********3.订                票********");
    	 System.out.println("********4.退                票********");
    	 System.out.println("********5.浏览航班信息********");
    	 System.out.println("********6.退   出   系  统********");
    	 System.out.println("********7.刷                新********");
    	 System.out.println("**************************");
    	 System.out.println(" ");
  
    	 System.out.println("请选择操作:");
    	 Scanner sc_2 =new Scanner(System.in);
    	 int i=sc_2.nextInt();
    	 switch(i) {
    	 case 1:luru();break;
    	 case 2:chaxun();break;
    	 case 3:dingpiao();menu();
    	 case 4:tuipiao();break;
    	 case 5:visit();break;
    	 case 6:tuichu();break;//注意exit(1)
    	 //case 7;fresh();break;
    	 //default : System.out.println("输入的选项不合法，请重新输入");
    	 //  清屏
    	 //menu();
    	 }
     }//菜单
     public void chaxun1() {
    	 System.out.println("请输入要查询的航班号");
    	 Scanner sc_3=new Scanner(System.in);
    	 int n=sc_3.nextInt();
    	 for(int j=0;j<=len;j++) {
    		 if(fl[j].getA1()==n) {
    			 System.out.println("********该次航班信息为********");
    			 System.out.println("航  班  号:"+fl[j].getA1());
    			 System.out.println("起飞时间:"+fl[j].getA2());
    			 System.out.println("降落时间:"+fl[j].getA3());
    			 System.out.println("起飞城市:"+fl[j].getA4());
    			 System.out.println("降落城市:"+fl[j].getA5());
    			 System.out.println("剩余票量:"+fl[j].getA6());
    			 menu();
    			 return;
    		 }
    	 }
    	 System.out.println("没有对应的航班！");
    	 menu();
    	 return;
     }//按航班号查询
     public void chaxun2() {
    	 System.out.println("请输入要查询的起始城市");
    	 Scanner sc_4=new Scanner(System.in);
    	 String m1 = sc_4.nextLine();
    	 System.out.println("请输入要查询的降落城市");
//    	 Scanner sc_5=new Scanner(System.in);
    	 String m2 = sc_4.nextLine();
    	 
    	 int j=0;
    	 if(j<len) {
    		 if(fl[j].getA4().equals(m1) && fl[j].getA5().equals(m2)) {
    			 System.out.println("********该次航班信息为********");
    			 System.out.println("航  班  号:"+fl[j].getA1());
    			 System.out.println("起飞时间:"+fl[j].getA2());
    			 System.out.println("降落时间:"+fl[j].getA3());
    			 System.out.println("起飞城市:"+fl[j].getA4());
    			 System.out.println("降落城市:"+fl[j].getA5());
    			 System.out.println("剩余票量:"+fl[j].getA6());
    			 System.out.println("*****查询成功*****");
    		 }
    		 else {
    			 j++;
    			 if(j<len)
    				 //goto end;
    				 System.out.println("没有对应的航班！");	 
    		 }
    	 }
    	 menu();
     }//按城市查询
     public void visit() {
    	 System.out.println("1:显示已预定航班信息");
    	 System.out.println("2:显示等候客户信息");
    	 System.out.println("3:显示所有航班信息");
    	 System.out.print("请选择...");
    	 
    	 Scanner sc_1=new Scanner(System.in);
    	 int s=sc_1.nextInt();
    	 switch(s) {
    	 case 1:visit1(); break;//现实已定客户信息
    	 case 2:visit2(); break;//现实等候客户信息
    	 case 3:visit3(); break;//现实所有航班信息
    	 //default
    	 
    	 
    	 }
    	 return;
     }//预览菜单
     public void visit1() {
    	 System.out.println("*******已定客户信息********");
    	 
//    	 for(int i=0;i<100;i++)
//    	      cu[i] = new Customer();
    	 
    	 for(int i=0;i<9;i++) {
    		 System.out.print(padRight(title_1[i],wid_1[i],' '));
    		 
    	 }
    	 System.out.println();
    	 for(int j=0;j<A;j++) {
    		 System.out.print(padRight(cu[j].getName(),wid_1[0],' '));
    		 System.out.print(padRight(String.valueOf(cu[j].getSeat()),wid_1[1],' '));
    		 System.out.print(padRight(String.valueOf(cu[j].getNum()),wid_1[2],' '));
    		 System.out.print(padRight(cu[j].getNo(),wid_1[3],' '));
    		 System.out.print(padRight(String.valueOf(cu[j].getPs()),wid_1[4],' '));
    		 System.out.print(padRight(cu[j].getJls(),wid_1[5],' '));
    		 System.out.print(padRight(cu[j].getQfs(),wid_1[6],' '));
    		 System.out.print(padRight(cu[j].getQfd(),wid_1[7],' '));
    		 System.out.print(padRight(cu[j].getJld(),wid_1[8],' '));
    	  	 }
    	    System.out.println(); 
    	 menu();
     }
     public void visit2() {
    	 System.out.println("********等候客户信息********");
    	 for(int i=0;i<5;i++) {
    		 System.out.print(padRight(title_2[i],wid_2[i],' '));   
    	 }
    	 System.out.println();
    	 for(int j=0;j<max_1;j++) {
    		 System.out.print(padRight(wa[j].getB1(),wid_2[0],' ')); 
    		 System.out.print(padRight(wa[j].getB2(),wid_2[1],' ')); 
    		 System.out.print(padRight(wa[j].getB3(),wid_2[2],' ')); 
    		 System.out.print(padRight(wa[j].getNo(),wid_2[3],' ')); 
    		 System.out.print(padRight(String.valueOf(wa[j].getNum()),wid_2[4],' ')); 
    	 }
    	 System.out.println();
    	 menu();
     }
     public void visit3() {
    	 System.out.println("********所有航班信息********");
    	 for(int i=0;i<6;i++) {
    		 System.out.print(padRight(title[i],wid[i],' '));   
    	 }
    	 System.out.println();
    	 for(int j=0;j<len;j++) {
    		 System.out.print(padRight(String.valueOf(fl[j].getA1()),wid[0],' ')); 
    		 System.out.print(padRight(fl[j].getA2(),wid[1],' ')); 
    		 System.out.print(padRight(fl[j].getA3(),wid[2],' ')); 
    		 System.out.print(padRight(fl[j].getA4(),wid[3],' ')); 
    		 System.out.print(padRight(fl[j].getA5(),wid[4],' ')); 
    		 System.out.print(padRight(String.valueOf(fl[j].getA6()),wid[5],' ')); 
    	 }
    	 System.out.println();
    	 menu();
     }
     void fresh() {
    	 if(tuipiao()==true) {
    		 System.out.println("****退票成功，等候客户可以进行购票****");
    		 dingpiao();
    	 }
    	 menu();
     }//刷新
    
    
}

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
     public static String[] title={"�����","���ʱ��","����ʱ��","���ʱ��","�������","��Ʊ��"};
     public static int[] wid= {8,10,10,10,10,8};
     public static String[] title_1= {"�ͻ�����","��λ��","�����","֤����","��Ʊ��","����ʱ��","���ʱ��","��ɳ���","�������"};
     public static int[] wid_1= {8,9,8,8,8,11,11,11,11};
     public static String[] title_2= {"�ͻ�����","��ɳ���","�������","�ͻ�ID","Ԥ��Ʊ��"};
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
     }//�Ҷ��뺯��
     
     public void luru() {
    	 System.out.println("*********�����뺽����Ϣ*********");
    	 System.out.print("�����뺽���:");
    	 
	     for(int i=0;i<50;i++)  
	     	 fl[i]=new Flight();
    	 Scanner sc=new Scanner(System.in);
    	 int sc1=sc.nextInt();
    	 fl[len].setA1(sc1);
    	 
    	 System.out.print("���ʱ��:");
    	 String sc2 =sc.nextLine();
    	 fl[len].setA2(sc2);
    	 
    	 System.out.print("����ʱ��:");
    	 String sc3 =sc.nextLine();
    	 fl[len].setA3(sc3);
    	 
    	 System.out.print("��ɳ���:");
    	 String sc4 =sc.nextLine();
    	 fl[len].setA4(sc4);
    	 
    	 
    	 System.out.print("�������:");
    	 String sc5 =sc.nextLine();
    	 fl[len].setA5(sc5);
    	 
    	 System.out.print("ʣ��Ʊ��:");
    	 int sc6 =sc.nextInt();
    	 fl[len].setA6(sc6);
    	 
    	 len++;
    	 System.out.println("��ѡ����Ҫ���еĲ���");
    	 
    	 menu();
     }//����¼�뺽����Ϣ����
     public void chaxun() {
    	 
//    	 try {
//			clear();
//		} catch (AWTException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}//����
    	 System.out.println("��ѡ���ѯ��ʽ");
    	 System.out.println("1.������Ų�ѯ");
    	 System.out.println("2.�����в�ѯ");
    	 Scanner sc_6=new Scanner(System.in);
    	 int t=sc_6.nextInt();
    	 switch(t) {
    	 case 1:chaxun1(); break;
    	 case 2:chaxun2(); break;
    	 default :System.out.println("���������������������룡");
    	 menu();
    	 break;
    	 }
     }//������ѯ����
		
    	 public static void clear() throws AWTException
    	    {
    		// TODO Auto-generated method stub
    	        Robot r = new Robot();
    	        r.mousePress(InputEvent.BUTTON3_MASK);       // ��������Ҽ�
    	        r.mouseRelease(InputEvent.BUTTON3_MASK);    // �ͷ�����Ҽ�
    	        r.keyPress(KeyEvent.VK_CONTROL);             // ����Ctrl��
    	        r.keyPress(KeyEvent.VK_R);                    // ����R��
    	        r.keyRelease(KeyEvent.VK_R);                  // �ͷ�R��
    	        r.keyRelease(KeyEvent.VK_CONTROL);            // �ͷ�Ctrl��
    	        r.delay(100);       

    	    }

	public void dingpiao() {
    	 int sign=0;
    	 for(int i=0;i<100;i++)
    	      cu[i] = new Customer();
    	 
 	    for(int i=0;i<50;i++)  
 	     	 wa[i]=new Wait();
 	    
    	 System.out.print("��������������:");
    	 Scanner sc_7=new Scanner(System.in);
    	 String Name=sc_7.nextLine();
    	 
    	 System.out.print("�����뺽  ��  ��:");
    	 Scanner sc_8=new Scanner(System.in);
    	 int fn=sc_8.nextInt();
    	 
    	 System.out.print("������Ԥ��Ʊ��:");
    	 Scanner sc_9=new Scanner(System.in);
    	 int ydps=sc_9.nextInt();
    	 
    	 System.out.print("���������֤��:");
    	 Scanner sc_10=new Scanner(System.in);
    	 String ID=sc_10.nextLine();
    	 
    	 for(int i=0;i<=len;i++) {
    		 if(fl[i].getA1()==fn) {//��ѯ�ú���
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
    				 
    				 System.out.println("��Ʊ�ɹ�!");
    				 System.out.println(" ");
    				 break;
    			 }
    			 else {
    				 System.out.println("�ú�����Ʊ����!");
    				 System.out.println("�Ƿ�Ը���ŶӵȺ�(Y/N)");
    				 Scanner sc_11 = new Scanner(System.in);
    				 String s = sc_11.next();
    				 char r = s.charAt(0);//��ȡ��һ���ַ�
    				 if(r=='Y' || r=='y') {
    					 Queue queue = new LinkedList();
    					 wa[max_1].setB1(Name);
    					 wa[max_1].setB2(fl[i].getA4());
    					 wa[max_1].setB3(fl[i].getA5());
    					 wa[max_1].setNo(ID);
    					 wa[max_1].setNum(ydps);
    					 
    				        queue.offer(wa[max_1]);//�����
    				        max_1++;
    				        System.out.println("�ͻ������!�����ϵ�����Ѿ���¼����Ⱥ�֪ͨ!");
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
    	 	//	System.out.println("���������!");
     }//��Ʊ����
     public boolean tuipiao() {
    	 //����  	
    	 
    	 System.out.print("��������������:");
    	 Scanner sc_12=new Scanner(System.in);
    	 String name = sc_12.nextLine();
    	 
    	 System.out.print("���������ĺ����:");
    	 int fn = sc_12.nextInt();
    	 
    	 int sign=0;
    	 for(int i=0;i<len;i++) {
    		 if(fn==fl[i].getA1()) {
    			 for(int j=0;j<A;j++) {
    				 if(cu[j].getName().equals(name)) {
    					 System.out.println("��Ʊ�ɹ�!");
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
    			 System.out.println("������Ϣ����!,��Ʊʧ��");
    			 menu();
    		 }
    	 }
    	 
		return true;
    	 
     }//��Ʊ����
     public void tuichu() {
    	 System.out.println("*****��ӭ�´ι���*****");
     }//�˳�����
     public void menu() {
    	 System.out.println("*******��ӭ�������ն�Ʊϵͳ******");
    	 System.out.println(" ");
    	 System.out.println("**************************");
    	 System.out.println("********1.¼�뺽����Ϣ********");
    	 System.out.println("********2.��ѯ������Ϣ********");
    	 System.out.println("********3.��                Ʊ********");
    	 System.out.println("********4.��                Ʊ********");
    	 System.out.println("********5.���������Ϣ********");
    	 System.out.println("********6.��   ��   ϵ  ͳ********");
    	 System.out.println("********7.ˢ                ��********");
    	 System.out.println("**************************");
    	 System.out.println(" ");
  
    	 System.out.println("��ѡ�����:");
    	 Scanner sc_2 =new Scanner(System.in);
    	 int i=sc_2.nextInt();
    	 switch(i) {
    	 case 1:luru();break;
    	 case 2:chaxun();break;
    	 case 3:dingpiao();menu();
    	 case 4:tuipiao();break;
    	 case 5:visit();break;
    	 case 6:tuichu();break;//ע��exit(1)
    	 //case 7;fresh();break;
    	 //default : System.out.println("�����ѡ��Ϸ�������������");
    	 //  ����
    	 //menu();
    	 }
     }//�˵�
     public void chaxun1() {
    	 System.out.println("������Ҫ��ѯ�ĺ����");
    	 Scanner sc_3=new Scanner(System.in);
    	 int n=sc_3.nextInt();
    	 for(int j=0;j<=len;j++) {
    		 if(fl[j].getA1()==n) {
    			 System.out.println("********�ôκ�����ϢΪ********");
    			 System.out.println("��  ��  ��:"+fl[j].getA1());
    			 System.out.println("���ʱ��:"+fl[j].getA2());
    			 System.out.println("����ʱ��:"+fl[j].getA3());
    			 System.out.println("��ɳ���:"+fl[j].getA4());
    			 System.out.println("�������:"+fl[j].getA5());
    			 System.out.println("ʣ��Ʊ��:"+fl[j].getA6());
    			 menu();
    			 return;
    		 }
    	 }
    	 System.out.println("û�ж�Ӧ�ĺ��࣡");
    	 menu();
    	 return;
     }//������Ų�ѯ
     public void chaxun2() {
    	 System.out.println("������Ҫ��ѯ����ʼ����");
    	 Scanner sc_4=new Scanner(System.in);
    	 String m1 = sc_4.nextLine();
    	 System.out.println("������Ҫ��ѯ�Ľ������");
//    	 Scanner sc_5=new Scanner(System.in);
    	 String m2 = sc_4.nextLine();
    	 
    	 int j=0;
    	 if(j<len) {
    		 if(fl[j].getA4().equals(m1) && fl[j].getA5().equals(m2)) {
    			 System.out.println("********�ôκ�����ϢΪ********");
    			 System.out.println("��  ��  ��:"+fl[j].getA1());
    			 System.out.println("���ʱ��:"+fl[j].getA2());
    			 System.out.println("����ʱ��:"+fl[j].getA3());
    			 System.out.println("��ɳ���:"+fl[j].getA4());
    			 System.out.println("�������:"+fl[j].getA5());
    			 System.out.println("ʣ��Ʊ��:"+fl[j].getA6());
    			 System.out.println("*****��ѯ�ɹ�*****");
    		 }
    		 else {
    			 j++;
    			 if(j<len)
    				 //goto end;
    				 System.out.println("û�ж�Ӧ�ĺ��࣡");	 
    		 }
    	 }
    	 menu();
     }//�����в�ѯ
     public void visit() {
    	 System.out.println("1:��ʾ��Ԥ��������Ϣ");
    	 System.out.println("2:��ʾ�Ⱥ�ͻ���Ϣ");
    	 System.out.println("3:��ʾ���к�����Ϣ");
    	 System.out.print("��ѡ��...");
    	 
    	 Scanner sc_1=new Scanner(System.in);
    	 int s=sc_1.nextInt();
    	 switch(s) {
    	 case 1:visit1(); break;//��ʵ�Ѷ��ͻ���Ϣ
    	 case 2:visit2(); break;//��ʵ�Ⱥ�ͻ���Ϣ
    	 case 3:visit3(); break;//��ʵ���к�����Ϣ
    	 //default
    	 
    	 
    	 }
    	 return;
     }//Ԥ���˵�
     public void visit1() {
    	 System.out.println("*******�Ѷ��ͻ���Ϣ********");
    	 
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
    	 System.out.println("********�Ⱥ�ͻ���Ϣ********");
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
    	 System.out.println("********���к�����Ϣ********");
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
    		 System.out.println("****��Ʊ�ɹ����Ⱥ�ͻ����Խ��й�Ʊ****");
    		 dingpiao();
    	 }
    	 menu();
     }//ˢ��
    
    
}

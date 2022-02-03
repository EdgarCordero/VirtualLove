package com.tdec.eLove;


public class SMachine {
	public static UIManager UI = new UIManager();
	
	void OutPuts() {}
	
	public static void main(String[] args) {
		
		int in = 0;
		int out = 0;
		int q = 0;
		
		int [][] nextState = {
				{1,6,3,8,10,9,4,5,7,2},
				{10,2,9,0,7,4,6,8,7,5},
				{8,6,0,6,2,6,0,6,8,6},
				{1,5,3,8,10,9,9,4,7,5},
				{10,5,9,8,10,9,3,2,7,0},
				{9,11,0,11,4,4,9,11,6,11},
				{2,6,2,6,6,0,4,6,6,6},
				{1,6,4,2,7,10,7,6,7,6},
				{4,6,8,6,4,4,3,2,0,2},
				{1,11,3,2,10,9,10,5,7,5},
				{4,11,0,11,10,4,9,11,7,11},
				{0,11,0,11,0,9,9,11,0,11}
		};
		
		int [][] outPuts = {
				{1,9,11,4,13,5,8,2,1,6},
				{13,6,1,4,12,5,0,6,7,2},
				{6,3,7,9,6,9,7,3,7,9},
				{1,6,10,4,13,0,0,9,12,2},
				{13,2,11,4,12,5,8,4,12,7},
				{0,2,7,3,0,0,8,2,9,2},
				{6,3,6,3,9,7,0,9,3,9},
				{1,9,0,6,12,13,13,2,12,9},
				{0,9,10,9,0,5,8,6,7,7},
				{1,2,8,6,13,5,13,2,12,7},
				{0,2,10,2,13,5,8,3,12,4},
				{7,2,7,2,7,5,0,4,7,3}
		};
		
		
		
		UI.setUI();
		
		while(true) {
			
			for(int i = 0; i< 1000000000; i++);
			
			try {
				Thread.sleep(2000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
	        
			in = UIManager.input;
			out = outPuts[q][in];
			
			
			switch(out) {
			case 0:
				UI.clearForLabel1();
				UIManager.lable1.setVisible(true);
				System.out.println(out);
				q = nextState[q][in];
				break;
				
			case 1:
				UI.clearForLabel2();
				UIManager.lable2.setVisible(true);
				System.out.println(out);
				q = nextState[q][in];
				break;
				
			case 2:
				UI.clearForLabel3();
				UIManager.lable3.setVisible(true);
				System.out.println(out);
				q = nextState[q][in];
				break;
				
			case 3:
				UI.clearForLabel4();
				UIManager.lable4.setVisible(true);
				System.out.println(out);
				q = nextState[q][in];
				break;
				
			case 4:
				UI.clearForLabel5();	
				UIManager.lable5.setVisible(true);
				System.out.println(out);
				q = nextState[q][in];
				break;
				
			case 5:
				UI.clearForLabel6();
				UIManager.lable6.setVisible(true);
				System.out.println(out);
				q = nextState[q][in];
				break;
				
			case 6:
				UI.clearForLabel7();
				UIManager.lable7.setVisible(true);
				System.out.println(out);
				q = nextState[q][in];
				break;
				
			case 7:
				UI.clearForLabel8();
				UIManager.lable8.setVisible(true);
				System.out.println(out);
				q = nextState[q][in];
				break;
				
			case 8:
				UI.clearForLabel9();
				UIManager.lable9.setVisible(true);
				System.out.println(out);
				q = nextState[q][in];
				break;
				
			case 9:
				UI.clearForLabel10();
				UIManager.lable10.setVisible(true);
				System.out.println(out);
				q = nextState[q][in];
				break;
				
			case 10:
				UI.clearForLabel11();
				UIManager.lable11.setVisible(true);
				System.out.println(out);
				q = nextState[q][in];
				break;
				
			case 11:
				UI.clearForLabel12();
				UIManager.lable12.setVisible(true);
				System.out.println(out);
				q = nextState[q][in];
				break;
				
			case 12:
				UI.clearForLabel3();
				UIManager.lable13.setVisible(true);
				System.out.println(out);
				q = nextState[q][in];
				break;
		
			case 13:
				UI.clearForLabel14();
				UIManager.lable14.setVisible(true);
				System.out.println(out);
				q = nextState[q][in];
				break;
				default: return;
			}
			
		}
		
		
	}
	
	
}




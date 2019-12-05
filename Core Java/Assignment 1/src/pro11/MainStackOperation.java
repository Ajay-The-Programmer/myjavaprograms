package pro11;

import java.util.Scanner;

public class MainStackOperation {

	public static void main(String[] args) {
		int choice;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Size of stack: ");	
		StackOperation stack=new Stack(in.nextInt());
		System.out.println("Please Enter your choice:");
	do {
		System.out.println("********************************************\n1.PUSH \n2.POP\n3.DESPLAY\n0.EXIT\n**************************************************");
		choice=in.nextInt();
		switch(choice) {
		
		case 1: 
				System.out.println("Enter the data:");
				if(stack.push(in.nextInt())!=0) {
					System.out.println("Succesfull to Pushed data into Stack");
				}
				else
				{
					System.out.println("Stack is Overflowe........");
				}
				break;
		case 2:
				int pop=stack.pop();
				if(pop!=0) {
					System.out.println("element" + pop+ "poped ");
				}else {
					System.out.println("Stack is Empty......");
				}
				break;
		case 3:
			
			
				int[] stk;
				stk=stack.desplay();
				System.out.println("Stack is Deplayed");
				for(int i=0;i<stk.length;i++) {
				System.out.println(stk[i]);}
				break;
		case 0:
				break;
		default:
				System.out.println("Please Enter Valid Choice..................");
			}
		
		}while(choice!=0);
	}
}

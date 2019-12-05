package pro12;

import java.util.Scanner;
public class MainQueueOperations() {
	public static void main(String[] args) {
	
int choice;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Size of Queue: ");	
		QueueOperations queue=new MyQueue(in.nextInt());
		System.out.println("Please Enter your choice:");
	do {
		System.out.println("********************************************\n1.Insert Elements \n2.Delete Elements\n3.Display Elements\n0.EXIT\n**************************************************");
		choice=in.nextInt();
		switch(choice) {
		
		case 1: 
				System.out.println("Enter the elements:");
				int elements=in.nextInt();
				if(elements!=0){
					System.out.println("Succesfull to Pushed data into Stack");
				}
				else
				{
					System.out.println("Stack is Overflowe........");
				}
				break;
		case 2:
				int pop=queue.deleteElements();
				if(pop!=0) {
					System.out.println("element" + pop+ "poped ");
				}else {
					System.out.println("Stack is Empty......");
				}
				break;
		case 3:
			
			
				int[] stk;
				stk=queue.desplayElements();
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

	}

}

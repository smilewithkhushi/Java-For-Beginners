
import java.io.*;

class STACK{
	int list[], size;
	int tos=-1;
	
	STACK(int num){
		size=num;
		list= new int[size];
	}
	void push(int n){
		if (tos==size-1) {
			System.out.println("STACK OVERFLOW : THE STACK IS FULL");
		}
		else {
			list[++tos]=n;
		}
	}
	void pop(){
		if (tos==-1) {
			System.out.println("STACK UNDERFLOW : THE STACK IS EMPTY");
		}
		else {
			System.out.println(list[tos--]);
		}
		
	}
	
	void displayStack(){
		System.out.println("\t -> THE STACK ELEMENTS ARE : ");
		for (int i=0; i<size; i++) {
			System.out.print("\t"+list[i]);
		}
	}
	
}
public class StackOperations {
	
	public static void main(String[] args) throws IOException {
	BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
	
	int stackSize, choice, num;
	
	System.out.println("CREATING A EMPTY STACK \n");
	System.out.print("Enter the size of the Stack : ");
	stackSize=Integer.parseInt(br1.readLine());
	
	System.out.println("\n -> A Stack with "+stackSize+" integers will be created!");	
	STACK s1;
	s1= new STACK(stackSize);
	
	System.out.println("\nPERFORMING STACK OPERATIONS\n");
	System.out.println(" 1. PUSH the elements in Stack ");
	System.out.println("2. POP the elements from Stack ");
	
	String ch="y";
	while (ch.equals("y")) {
	System.out.print("Enter the stack operation you want to perform (1 or 2) : ");
	choice=Integer.parseInt(br1.readLine());
	
	switch(choice){
	case 1 : System.out.println("\n\t -> OPERATION CHOOSEN : PUSH ");
			for (int i=1; i<=stackSize; i++) {
				System.out.print("Enter the "+i+" element : ");
				num=Integer.parseInt(br1.readLine());
				s1.push(num);
			}
			break;

	case 2 : System.out.println("\n\t -> OPERATION CHOOSEN : POP ");
			for (int i=1; i<=stackSize; i++) {
				s1.pop();
			}
			break;
	}
	System.out.print("\n Do you want to continue(y/n)? ");
	ch=br1.readLine();
	}
	System.out.println("\n \t ** PROGRAM ENDS HERE ** ");
	}	
	}

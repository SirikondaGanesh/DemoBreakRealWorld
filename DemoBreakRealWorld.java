//Writing a program using break statement for the ATM application to break the loop whenever daily limit exceeds for withdrawl
package apjfsa;
import java.util.*;
//class declaration
public class DemoBreakRealWorld {
        //Main function
	public static void main(String[] args) {
		//instance variable
		int n;
		System.out.println("Select language:");
		System.out.println("1)English\n2)Hindi\n3)Telugu");
		Scanner S=new Scanner(System.in);
		n=S.nextInt();
		//Switch statement
		switch(n) {
			case 1:System.out.println("Select the below options:\n1)Banking\t2)Withdrawl\n3)Deposit\t4)Balance Enquiry");
			break;
			default:System.out.println("Updted only in a English language\n--PLEASE TRY AGAIN--");	
		}
		 Scanner sc=new Scanner(System.in); 
		 //Reading input for withdrawl from console
	        int	withdrawl=sc.nextInt();
	        //if statement
		if(withdrawl==2) { 
			int withdrawAmount,sumAmount=0,AcBalance=150000;
	      //while looping
	       while(AcBalance>0) {
	    	   System.out.println("Enter an amount :");
	    	 //Reading input for withdrawAmount from console
	           withdrawAmount=sc.nextInt();
	    	   sumAmount+=withdrawAmount;
	    	   //if statement
	    	   if(sumAmount>50000) {
	    		   System.out.println("Limit exceeded");
	    		   break;//break the statement for terminating loop
	    	   }
	    	   AcBalance-=withdrawAmount;
	    	   System.out.println("A/C Balance="+AcBalance+"AmountWithdraw"+sumAmount);
	            }
		     }
		else if(withdrawl==4) { 
		int	AcBalance=150000;
			System.out.println("Available Balance :"+AcBalance);
		}
		else if(withdrawl==1) {
			System.out.println("NOT AVAILABLE");
		}
		else {
			System.out.println("NOT AVAILABLE");
		}

	}
}


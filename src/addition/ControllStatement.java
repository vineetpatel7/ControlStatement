package addition;
// Welcome message in master
// Initialize data and push it in Initial branch
// Perform the if-else condition and push itElse branch
// Happy Ending push in Ending branch
public class ControllStatement {
public static void main(String[] args) {
	System.out.println("Welcome Message");
	int value1 = 30;
	int value2 = 20;

	if(value1 > value2) {
	    System.out.println("Greater Value : "+value1);
	}
	else {
		System.out.println("Greater Value : "+value2);
	}
	System.out.println("Happy Ending");
	
//	Switch Statement
	
	int value3 =20;
	
	switch(value3) {
	case 10:
		System.out.println("I am 10");
//		break;
	
	case 20:
		System.out.println("I am 20");
//		break;
	
	case 30:
		System.out.println("I am 30");
//		break;
		
	default :
		System.out.println("Condition not match");
	}
}
}

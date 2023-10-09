import java.util.*;
public class OnlineExam {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String realid="java",realpassword="12345";
		while(true){
			System.out.println("Welcome to Login");
			
			System.out.print("Enter LoginId:");
			String id,password;
			id=in.next();
			System.out.print("Enter Password: ");
			password=in.next();
			if(id.equals(realid) && password.equals(realpassword)){
			
				Integer count=0;
				
				System.out.println("Welcome to Exam Portal");
				
			
				while(true){
					System.out.println("1.Exam\n2.Update Profile\n3.Logout");
					System.out.print("Enter Your Choice:");
					Integer n=in.nextInt();
					if(n==1){
						long examstarttime=System.currentTimeMillis();//Timer and auto submit
						long endtime=examstarttime+30*1000;
						while(System.currentTimeMillis()<endtime){
							
							System.out.println("Your Exam Exactly Starts Now and Your timer was on mode.\nCurrent time:"+System.currentTimeMillis());
							
							System.out.println("1.Which one among these is not a primitive datatype? \n1.int 2.float 3.boolean 4.char");
							System.out.print("Enter Suitable letter: ");
							String s=in.next();
							if(s.equals("1")){
								count+=1;
							}
							
							System.out.println("Your Submitted First Question Successfully.\nNow Current time:"+System.currentTimeMillis());
							
							System.out.println("2.Which class is available to all the class automatically? \n1.swing 2.applet 3.object 4.actionevent");
							System.out.print("Enter Suitable letter: ");
							s=in.next();
							if(s.equals("4")){
								count+=1;
							}
							
							System.out.println("Your Submitted Second Question Successfully.\nNow Current time:"+System.currentTimeMillis());
							
							System.out.println("3.Which package is directly available to our class without importing it? \n1.swing 2.applet 3.net 4.lang");
							System.out.print("Enter Suitable letter: ");
							s=in.next();
							if(s.equals("2")){
								count+=1;
							}
							
							System.out.println("Your Submitted Third Question Successfully.\nNow Current time:"+System.currentTimeMillis());
						    System.out.println("4.String class is defined in which package? \n1.lang 2.swing 3.applet 4.awt");
							System.out.print("Enter Suitable letter: ");
							s=in.next();
							if(s.equals("2")){
								count+=1;
							}
							
							System.out.println("Your Submitted Fourth Question Successfully.\nNow Current time:"+System.currentTimeMillis());
							
							System.out.println("5.Which institute is best for java coaching? \n1.Utek 2.aptech 3.SSS IT 4.jtek");
							System.out.print("Enter Suitable letter: ");
							s=in.next();
							if(s.equals("5")){
								count+=1;
							}
							
							System.out.println("Your Submitted Fifth Question Successfully.\nNow Current time:"+System.currentTimeMillis());
							
						}
						System.out.println("Your Exam Finishes.\nYou Scored:"+(count*10));
					}
					else if(n==2){
						try{
							System.out.print("Enter Updated Id:");
							realid=in.next();
							System.out.print("Enter Updated Password");
							realpassword=in.next();
							System.out.println("Details Updated Successfully");
						}
						catch(Exception e){
							System.out.println("Failed to Update Details");
						}
						
					}
					else if(n==3){
						System.exit(0); 
					}
					else{
						System.out.println("Enter valid choices");
					}
				}
			}
			else{
				System.out.println("Your Entered Details are Invalid.Try Again");
			}
		}
	}
}

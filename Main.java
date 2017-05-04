


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Functionalities fs=new Functionalities();
		Scanner sc=new Scanner(System.in);
		Complaint complaints[];
		Complaint_Dao cdao=new Complaint_Dao();
		cdao.loadCompliants();
		TableRenderer tr=new TableRenderer();
		List<Complaint> rd;
		String[] colnames = { "Date received", "Product", "Sub-product", "Issue","Sub-issue","Company","State","ZIP code","Submitted via","Date sent to company","Company response to consume","Timely response?","Consumer disputed?","Complaint ID"};
		int ch = 1; 
		while(ch!=0){
	
		 System.out.println("Enter the action choice you want to perform");
		 System.out.println("1. Display all complaints based on the year provided by the user");
		 System.out.println("2. Display all the complaints based on the name of the bank provided by the user");
		 System.out.println("3. Display all the complaints based on the complaint ID provided by the user.");
		 System.out.println("4. Display number of days took by the bank to close the complaint.");
		 System.out.println("5. Display all the complaints closed/closed with explanation.");
		 System.out.println("6. Display all the complaints which received a timely response.");
		 System.out.println("7. Take input from user for storing new complaints.");
		 
		 int b=Integer.parseInt(sc.nextLine());
		 
		
			 switch(b) {
			 case 1:
				 System.out.println("Enter year ");
					int year=Integer.parseInt(sc.nextLine());
					 rd=fs.complaints_By_year(year, cdao);
					tr.render(colnames, rd);
				 break;
			 case 2:
				 System.out.println("Enter Bank ");
					String bankname=sc.nextLine();
					 rd=fs.complaints_By_BankName(bankname, cdao);
					tr.render(colnames, rd);
				 break;
			 case 3:
				 System.out.println("Enter id");
					int id=Integer.parseInt(sc.nextLine());
					//System.out.println(id);
					Complaint c=fs.complaints_By_Id(id, cdao);
					if(c==null)
					{
						System.out.println("complaint not in database");
					}
					else
					{
					List<Complaint> rd1=new ArrayList<Complaint>();
					rd1.add(c);
					tr.render(colnames, rd1);
					}
				 break;
			 case 4:
				 System.out.println("Enter id");
					int id1=Integer.parseInt(sc.nextLine());
					long rd2=fs.number_of_days_to_close_complaint(id1, cdao);
					System.out.println("Days required to close the complaint="+rd2);
				 
				 break;
			 case 5:
				 rd=fs.complaints_closed(cdao);
				 tr.render(colnames, rd);
				 break;
			 case 6:
				 rd=fs.complaints_Timely_Response(cdao);
				 tr.render(colnames, rd);
				 break;
			 case 7:
				 System.out.println("Enter the date Received: in dd/mm/yyyy format");
				 String dr = sc.nextLine();
				 System.out.println("Enter the product:");
				 String pr = sc.nextLine();
				 System.out.println("Enter the sub-product:");
				 String spr = sc.nextLine();
				 System.out.println("Enter the issue:");
				 String iss = sc.nextLine();
				 System.out.println("Enter the sub-issue:");
				 String siss = sc.nextLine();
				 System.out.println("Enter the company:");
				 String co = sc.nextLine();
				 System.out.println("Enter the state:");
				 String st = sc.nextLine();
				 System.out.println("Enter the ZipCode:");
				 String zc = sc.nextLine();
				 System.out.println("Enter the submitted via:");
				 String sv = sc.nextLine();
				 System.out.println("Enter the date sent to company: in dd/mm/yyyy format");
				 String dc = sc.nextLine();
				 System.out.println("Enter the company response to consumer:");
				 String cr = sc.nextLine();
				 System.out.println("Enter the timely response:");
				 String tr1 = sc.nextLine();
				 System.out.println("Enter the consumer disputed: ");
				 String cd = sc.nextLine();
				 System.out.println("Enter the complaint ID:");
				 String cid = sc.nextLine();
				 fs.add_complaint(dr, pr, spr, iss, siss, co, st, zc, sv, dc, cr, tr1, cd, cid);
				 System.out.println("complaint added");
				 break;
				 
			 case 8:
				 ch=0;
				 System.exit(0);
		     default:
		    	 System.out.println("Invalid Choice");
		    	 break;
				 
			 }
		  }
		//cdao.getlist();
		/*System.out.println("Enter year ");
		int year=sc.nextInt();
		List<Complaint> rd=fs.complaints_By_year(year, cdao);
		for(Complaint c:rd)
		{System.out.println("*");
			System.out.println(c);
		}*/
		/*int c0=0;
		System.out.println("Enter Bank ");
		String bankname=sc.nextLine();
		List<Complaint> rd=fs.complaints_By_BankName(bankname, cdao);
		for(Complaint c:rd)
		{ c0++;
			System.out.println(c);
		}
		System.out.println(c0);*/
	/*int c0=0;
	System.out.println("Enter id");
	int id=sc.nextInt();
	List<Complaint> rd=fs.complaints_By_Id(id, cdao);
	for(Complaint c:rd)
	{ c0++;
		System.out.println(c);
	}
	System.out.println(c0);
	*/
		/*int c0=0;
		List<Complaint> rd=fs.complaints_closed(cdao);
		for(Complaint c:rd)
		{ c0++;
			System.out.println(c);
		}
		System.out.println(c0);
	*/
		/*int c0=0;
		System.out.println("Enter id");
		int id=sc.nextInt();
		long rd=fs.number_of_days_to_close_complaint(id, cdao);
		System.out.println(rd);	
		System.out.println("Enter Complaints details");*/
		
	
	}

	

}

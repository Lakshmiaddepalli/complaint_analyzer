

import java.util.List;

public class TableRenderer {
	/*private int[] maxcalculate(String[] colnames,String [][] coldata)
	{
		int max[]=new int[colnames.length];
		for(int i=0;i<coldata.length;i++)
		{
			for(int j=0;j<colnames.length;j++)
			{
				if(max[j]<coldata[i][j].length())
				{
					max[j]=coldata[i][j].length();
				}
			}
		}
		return max;
	}*/
	private void printline(int max[])
	{
		for(int i=0;i<max.length;i++)
		{
			System.out.print("+");
			for(int j=0;j<max[i];j++)
			{
				System.out.print("-");
			}
		}
		System.out.println("+");
	}
	
	public void render(String[] colnames,List<Complaint> clist)
	{
		int max[]={16,28,47,50,42,40,5,10,13,20,37,18,18,18};
		
		printline(max);
		for(int i=0;i<colnames.length;i++)
		{
			System.out.print("|");
			System.out.print(colnames[i]);
			for(int j=0;j<max[i]-colnames[i].length();j++)
			{
				System.out.print(" ");
			}
		}
		System.out.println("|");
		printline(max);
		for(Complaint c: clist)
		{
			String s=c.getDate().get(c.getDate().MONTH)+"/"+c.getDate().get(c.getDate().DATE)+"/"+c.getDate().get(c.getDate().YEAR);
			
			System.out.print("|");
			System.out.print(s);
			for(int k=0;k<max[0]-s.length();k++)
			{
				System.out.print(" ");
			}
			System.out.print("|");
			
			
			
			
			System.out.print(c.getProduct());
			for(int k=0;k<max[1]-c.getProduct().length();k++)
			{
				System.out.print(" ");
			}
			System.out.print("|");
			
			
			
			
			System.out.print(c.getSub_product());
			for(int k=0;k<max[2]-c.getSub_product().length();k++)
			{
				System.out.print(" ");
			}
			System.out.print("|");
			
			
			
			System.out.print(c.getIssue());
			for(int k=0;k<max[3]-c.getIssue().length();k++)
			{
				System.out.print(" ");
			}
			
			System.out.print("|");
			
			System.out.print(c.getSub_issue());
			for(int k=0;k<max[4]-c.getSub_issue().length();k++)
			{
				System.out.print(" ");
			}
			
			System.out.print("|");
			
			System.out.print(c.getCompany());
			for(int k=0;k<max[5]-c.getCompany().length();k++)
			{
				System.out.print(" ");
			}
			
			System.out.print("|");
			
			System.out.print(c.getState());
			for(int k=0;k<max[6]-c.getState().length();k++)
			{
				System.out.print(" ");
			}

			System.out.print("|");
		
			System.out.print(c.getZipcode());
			for(int k=0;k<max[7]-c.getZipcode().length();k++)
			{
				System.out.print(" ");
			}
			
			System.out.print("|");
		
			System.out.print(c.getSubmitted_via());
			for(int k=0;k<max[8]-c.getSubmitted_via().length();k++)
			{
				System.out.print(" ");
			}
			
			System.out.print("|");
			
			String s1=c.getDate().get(c.getDate_send_to_company().MONTH)+"/"+c.getDate().get(c.getDate_send_to_company().DATE)+"/"+c.getDate().get(c.getDate_send_to_company().YEAR);
		
			System.out.print(s1);
			for(int k=0;k<max[9]-s1.length();k++)
			{
				System.out.print(" ");
			}
			
			System.out.print("|");
		
			System.out.print(c.getCmp_res_to_consume());
			for(int k=0;k<max[10]-c.getCmp_res_to_consume().length();k++)
			{
				System.out.print(" ");
			}
			
			System.out.print("|");
		
			System.out.print(c.getTimely_response());
			for(int k=0;k<max[11]-c.getTimely_response().length();k++)
			{
				System.out.print(" ");
			}
			
			System.out.print("|");
			
			System.out.print(c.getConsumer_dispute());
			for(int k=0;k<max[12]-c.getConsumer_dispute().length();k++)
			{
				System.out.print(" ");
			}
			
			System.out.print("|");
			
			
			String s2=Integer.toString(c.getCompliant_id());
		
			System.out.print(s2);
			for(int k=0;k<max[13]-s2.length();k++)
			{
				System.out.print(" ");
			}
			
			System.out.print("|");
			
			
			
			
		
			
			System.out.println();
		}
		printline(max);
	}

}


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

public class Complaint_Dao {
	private List<Complaint> listofcomplaints;
	
	public List<Complaint> getListofcomplaints() {
		return listofcomplaints;
	}
	public void setListofcomplaints(List<Complaint> listofcomplaints) {
		this.listofcomplaints = listofcomplaints;
	}
	public void loadCompliants()
	{
		listofcomplaints=new ArrayList<Complaint>();
		String s;
		 BufferedReader br = null;
	       try{	
	           br = new BufferedReader(new FileReader("complaints.csv"));
	           br.readLine();
		while((s=br.readLine())!=null) {
			 String[] a = s.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
		     Complaint c=new Complaint();
		     c.add_complaint(a[0], a[1],a[2], a[3], a[4], a[5], a[6], a[7],a[8], a[9], a[10], a[11], a[12],a[13]);
		      listofcomplaints.add(c);
		   }
		}
	       catch(Exception e)
	       {
	    	   System.out.println(e);
	    	   e.printStackTrace();
	       }
	       

	}
	public void getlist()
	{
		Iterator<Complaint> itr=listofcomplaints.iterator();
		while(itr.hasNext())
		{
			Complaint c=itr.next();
			System.out.println(c.toString());
		}
	}
}

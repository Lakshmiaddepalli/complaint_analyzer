

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Functionalities {
	public List<Complaint> complaints_By_year(int year,Complaint_Dao cdao)
	{
		
		List<Complaint> cr=new ArrayList<Complaint>() ;
		List<Complaint> clist=cdao.getListofcomplaints();
	
		for(Complaint c:clist)
		{
			if(c.getDate().get(c.getDate().YEAR)==year)
			{
				cr.add(c);
			}
			
		}
		return cr;
	}
	
	public List<Complaint> complaints_By_BankName(String bank,Complaint_Dao cdao)
	{
	
		List<Complaint> cr=new ArrayList<Complaint>() ;
		List<Complaint> clist=cdao.getListofcomplaints();
	
		for(Complaint c:clist)
		{
			if(c.getCompany().equals(bank))
			{
				cr.add(c);
			}
			
		}
		return cr;
	}
	public Complaint complaints_By_Id(int id,Complaint_Dao cdao)
	{
	System.out.println(id);
		List<Complaint> clist=cdao.getListofcomplaints();
	
		for(Complaint c:clist)
		{
			//System.out.println(c.getCompliant_id());
			if(c.getCompliant_id()==id)
			{
				//System.out.println(c);
				return c;
				
			}
			
		}
		return null;
	}
	public List<Complaint> complaints_closed(Complaint_Dao cdao)
	{
	
		List<Complaint> cr=new ArrayList<Complaint>() ;
		List<Complaint> clist=cdao.getListofcomplaints();
	
		for(Complaint c:clist)
		{
			if(c.getCmp_res_to_consume().equals("Closed with explanation")||c.getCmp_res_to_consume().equals("Closed"))
			{
				cr.add(c);
			}
			
		}
		return cr;
	}
	public List<Complaint> complaints_Timely_Response(Complaint_Dao cdao)
	{
	
		List<Complaint> cr=new ArrayList<Complaint>() ;
		List<Complaint> clist=cdao.getListofcomplaints();
	
		for(Complaint c:clist)
		{
			if(c.getTimely_response().equals("Yes"))
			{
				cr.add(c);
			}
			
		}
		return cr;
	}
	public long number_of_days_to_close_complaint(int id,Complaint_Dao cdao)
	{
		Functionalities fs=new Functionalities();
		Complaint c=fs.complaints_By_Id(id, cdao);
		return calendarDaysBetween(c.getDate(), c.getDate_send_to_company());
		
	}
	public void add_complaint(String date, String product, String sub_product,
			String issue, String sub_issue, String company, String state,
			String zipcode, String submitted_via, String date_send_to_company,
			String cmp_res_to_consume, String timely_response,
			String consumer_dispute,String id)
	{
		Complaint c=new Complaint();
		c.add_complaint(date, product, sub_product, issue, sub_issue, company, state, zipcode, submitted_via, date_send_to_company, cmp_res_to_consume, timely_response, consumer_dispute, id);
		FileWriter fw;
		try {
			fw = new FileWriter("complaints.csv",true);
			fw.append(c.getDate().get(c.getDate().MONTH)+"/"+c.getDate().get(c.getDate().DATE)+"/"+c.getDate().get(c.getDate().YEAR));
			fw.append(",");
			fw.append(c.getProduct());
			fw.append(",");
			fw.append(c.getSub_product());
			fw.append(",");
			fw.append(c.getIssue());
			fw.append(",");
			fw.append(c.getSub_issue());
			fw.append(",");
			fw.append(c.getCompany());
			fw.append(",");
			fw.append(c.getState());
			fw.append(",");
			fw.append(c.getZipcode());
			fw.append(",");
			fw.append(c.getSubmitted_via());
			fw.append(",");
			fw.append(c.getDate().get(c.getDate_send_to_company().MONTH)+"/"+c.getDate().get(c.getDate_send_to_company().DATE)+"/"+c.getDate().get(c.getDate_send_to_company().YEAR));
			fw.append(",");
			fw.append(c.getCmp_res_to_consume());
			fw.append(",");
			fw.append(c.getTimely_response());
			fw.append(",");
			fw.append(c.getConsumer_dispute());
			fw.append(",");
			fw.append(Integer.toString(c.getCompliant_id()));
			//fw.append("\r\n");
			fw.append(System.getProperty("line.separator"));
			fw.flush();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static long calendarDaysBetween(Calendar startCal, Calendar endCal) {


	    Calendar start = Calendar.getInstance();
	    start.setTimeZone(startCal.getTimeZone());
	    start.setTimeInMillis(startCal.getTimeInMillis());

	    Calendar end = Calendar.getInstance();
	    end.setTimeZone(endCal.getTimeZone());
	    end.setTimeInMillis(endCal.getTimeInMillis());
	    start.set(Calendar.HOUR_OF_DAY, 0);
	    start.set(Calendar.MINUTE, 0);
	    start.set(Calendar.SECOND, 0);
	    start.set(Calendar.MILLISECOND, 0);
	    end.set(Calendar.HOUR_OF_DAY, 0);
	    end.set(Calendar.MINUTE, 0);
	    end.set(Calendar.SECOND, 0);
	    end.set(Calendar.MILLISECOND, 0);
	    return TimeUnit.MILLISECONDS.toDays(
	            Math.abs(end.getTimeInMillis() - start.getTimeInMillis()));
	}

}

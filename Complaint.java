

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Complaint {
private Calendar date;
private String Product;
private String sub_product;
private String issue;
private String sub_issue;
private String company;
private String state;
private String Zipcode;
private String submitted_via;
private Calendar date_send_to_company;
private String cmp_res_to_consume;
private String Timely_response;
private String consumer_dispute;
private  int compliant_id;
public Complaint() {

}
public void add_complaint(String date, String product, String sub_product,
		String issue, String sub_issue, String company, String state,
		String zipcode, String submitted_via, String date_send_to_company,
		String cmp_res_to_consume, String timely_response,
		String consumer_dispute,String id)
{
	String datearray[]=returndatearray(date);
      setDate(new GregorianCalendar(Integer.parseInt(datearray[2]),Integer.parseInt(datearray[0]),Integer.parseInt(datearray[1])));
      setProduct(product);
      setSub_product(sub_product);
      setIssue(issue);
      setSub_issue(sub_issue);
      setCompany(company);
      setState(state);
      setZipcode(zipcode);
      setSubmitted_via(submitted_via);
      String datearray1[]=returndatearray(date_send_to_company);
      setDate_send_to_company(new GregorianCalendar(Integer.parseInt(datearray1[2]),Integer.parseInt(datearray1[0]),Integer.parseInt(datearray1[1])));
      setCmp_res_to_consume(cmp_res_to_consume);
      setTimely_response(timely_response);
      setConsumer_dispute(consumer_dispute);
      setCompliant_id(Integer.parseInt(id));
	
}
static public String [] returndatearray(String str)
{
	String datearray[]=str.split("/|-");
	return datearray;
}
public Calendar getDate() {
	return date;
}
public void setDate(Calendar date) {
	this.date = date;
}
public String getProduct() {
	return Product;
}
public void setProduct(String product) {
	Product = product;
}
public String getSub_product() {
	return sub_product;
}
public void setSub_product(String sub_product) {
	this.sub_product = sub_product;
}
public String getIssue() {
	return issue;
}
public void setIssue(String issue) {
	this.issue = issue;
}
public String getSub_issue() {
	return sub_issue;
}
public void setSub_issue(String sub_issue) {
	this.sub_issue = sub_issue;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getZipcode() {
	return Zipcode;
}
public void setZipcode(String zipcode) {
	Zipcode = zipcode;
}
public String getSubmitted_via() {
	return submitted_via;
}
public void setSubmitted_via(String submitted_via) {
	this.submitted_via = submitted_via;
}
public Calendar getDate_send_to_company() {
	return date_send_to_company;
}
public void setDate_send_to_company(Calendar date_send_to_company) {
	this.date_send_to_company = date_send_to_company;
}
public String getCmp_res_to_consume() {
	return cmp_res_to_consume;
}
public void setCmp_res_to_consume(String cmp_res_to_consume) {
	this.cmp_res_to_consume = cmp_res_to_consume;
}
public String getTimely_response() {
	return Timely_response;
}
public void setTimely_response(String timely_response) {
	Timely_response = timely_response;
}
public String getConsumer_dispute() {
	return consumer_dispute;
}
public void setConsumer_dispute(String consumer_dispute) {
	this.consumer_dispute = consumer_dispute;
}
public int getCompliant_id() {
	return compliant_id;
}
public void setCompliant_id(int compliant_id) {
	this.compliant_id = compliant_id;
}
@Override
public String toString() {
	return "Complaint [date=" + date + ", Product=" + Product
			+ ", sub_product=" + sub_product + ", issue=" + issue
			+ ", sub_issue=" + sub_issue + ", company=" + company + ", state="
			+ state + ", Zipcode=" + Zipcode + ", submitted_via="
			+ submitted_via + ", date_send_to_company=" + date_send_to_company
			+ ", cmp_res_to_consume=" + cmp_res_to_consume
			+ ", Timely_response=" + Timely_response + ", consumer_dispute="
			+ consumer_dispute + ", compliant_id=" + compliant_id + "]";
}



}

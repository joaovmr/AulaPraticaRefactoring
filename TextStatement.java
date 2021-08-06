import java.util.Enumeration;

public class TextStatement extends Statement {
  
 public String valueHead(Customer aCustomer) {
   	return "Rental Record for " + aCustomer.getName() + "\n";
 }

 public String valueRental(Rental each) {
   	return "\t" + each.getMovie().getTitle()+ "\t" +
         String.valueOf(each.getCharge()) + "\n";
  }

  public String valueFooter(Customer aCustomer) {
   	String result = "Amount owed is " +
	  String.valueOf(aCustomer.getTotalCharge()) + "\n";
	  result += "You earned " +
	  String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
	  " frequent renter points";
   	return result;
  }
}
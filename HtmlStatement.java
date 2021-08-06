import java.util.Enumeration;

public class HtmlStatement extends Statement {
  
   public String valueRental(Rental each) {
     return each.getMovie().getTitle()+ ": " +
        String.valueOf(each.getCharge()) + "<BR>\n";
   }
   public String valueFooter(Customer aCustomer) {
      String result = "<P>You owe <EM>" +
        String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
      result += "On this rental you earned <EM>" + 
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      "</EM> frequent renter points<P>";
      return result;
    }

   public String valueHead(Customer aCustomer) {
     return "<H1>Rentals for <EM>" + aCustomer.getName() + 
   		"</EM></H1><P>\n";
    }
}
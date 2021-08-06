import java.util.Enumeration;

public abstract class Statement {
 public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();

      String result = valueHead(aCustomer);

      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
         result += valueRental(each);
      }
      //add footer lines
      result += valueFooter(aCustomer);

      return result;
   }

   public abstract String valueHead(Customer aCustomer);
   public abstract String valueFooter(Customer aCustomer);
   public abstract String valueRental(Rental each);
}
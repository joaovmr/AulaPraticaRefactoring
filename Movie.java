public class Movie {

  public static final int  CHILDRENS = 2;
  public static final int  REGULAR = 0;
  public static final int  NEW_RELEASE = 1;

  private String _title;
  private Price _price;

  public Movie(String title, int priceCode) {
      _title = title;
      setPriceCode(priceCode);
  }

  public int getPriceCode() {
      return _price.getPriceCode();
  }

  public void setPriceCode(int arg) {
      switch (arg) {
         case REGULAR:
            _price = new RegularPrice();
            break;
         case CHILDRENS:
            _price = new ChildrensPrice();
            break;
         case NEW_RELEASE:
            _price = new NewReleasePrice();
            break;
         default:
            throw new IllegalArgumentException("Incorrect Price Code");
      }
   }

  public String getTitle (){
      return _title;
  }

  public double getCharge(int daysRented) {
     //Adicionar o trecho de código extraído.
     double thisAmount = 0;
    //determine amounts for each line
       switch (_price.getPriceCode()) {
         case Movie.REGULAR:
            thisAmount += 2;
            if (daysRented > 2)
               thisAmount += (daysRented - 2) * 1.5;
             break;
         case Movie.NEW_RELEASE:
            thisAmount += daysRented * 3;
            break;
         case Movie.CHILDRENS:
            thisAmount += 1.5;
            if (daysRented > 3)
               thisAmount += (daysRented - 3) * 1.5;
              break;
      }
    return thisAmount;
  }  

  public int getFrequentRenterPoints(int daysRented){
    //Adicionar o trecho de código extraído.
     if ((_price.getPriceCode() == Movie.NEW_RELEASE) &&
         daysRented > 1) return 2;
     return 1;
  }
}
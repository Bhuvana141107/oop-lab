public class sales {
   public static void main (String args[])
   {
      int itema=300; int itemb=700;
      double price;
      double price1=((itema *5-itemb/7)+(itemb*2));//sales of dairymilk
      double price2=(itemb*2);//sales of kitkat
      double price3=(itema*3);//sales of fivestar
      if (price1>price2 && price3<price1) {
      System.out.println("GOOD SALES FOR DAIRY MILK");
      }
      else if (price2>price1 && price3<price2){
      System.out.println("GOOD SALES FOR KITKAT");
      }
      else{
      System.out.println("GOOD SALES FOR FIVESTAR");
      }
  }
}

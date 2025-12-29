public class weekly_sales {
   public static void main (String args[])
   { 
     float temp=31;//average temperature of week
     int price=100;//price of each kg of apples
     boolean high_temp=true;//high temperature on a day
     char firstday='3';//number of kgs of apples sold on monday
     char secondday='4';//number of kgs of apples sold on tuesday
     char thirdday='5';//number of kgs of apples sold on wednesday
     char fourthday='6';//number of kgs of apples sold on thursday
     char fifthday='7';//number of kgs of apples sold on friday
     char sixthday='8';//number of kgs of apples sold on saturday
     char seventhday='9';//number of kgs of apples sold on sunday
     if (high_temp)//high temperature 
     {
        System.out.println("number of sales of apples(kgs) on first day: " + firstday);
        System.out.println("number of sales of apples(kgs) on Second day: " + secondday);
        System.out.println("number of sales of apples(kgs) on Third day: " + thirdday);
        System.out.println("number of sales of apples(kgs) on Fourth day: " + fourthday);
     }
     else//low temperature
     {
        System.out.println("number of sales of apples(kgs) on Fifth day: " + fifthday);
        System.out.println("number of sales of apples(kgs) on Sixth day: " + sixthday);
        System.out.println("number of sales of apples(kgs) on Seventh day: " + seventhday);
     }
   }
}
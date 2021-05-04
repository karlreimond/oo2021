import java.util.Calendar;
import java.util.ArrayList;
public class Kodutooklassiga{

   public static void main(String[] args){
      Kodutooklass tunninadalas = new Kodutooklass();
      Calendar calendar = Calendar.getInstance();
      int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
      System.out.println("Day: " + (calendar.get(Calendar.DATE)));
      System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1));
      System.out.println("Year: " + (calendar.get(Calendar.YEAR)));
      String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

      String nadalatund = tunninadalas.numbridpaevadeks(dayOfWeek);
      ArrayList<String> nadalatunnid = new ArrayList<>();


      nadalatunnid = tunninadalas.valjastatunnid(nadalatund);
	  
      System.out.println(nadalatund);
	  System.out.println(nadalatunnid);
   }





}
import java.util.ArrayList;
public class Kodutooklass{
	public static String numbridpaevadeks(int number){
		if(number == 1){
			return "Sunday";
		}
		if(number == 2){
			return "Monday";
		}
		if(number == 3){
			return "Tuesday";
		}
		if(number == 4){
			return "Wednesday";
		}
		if(number == 5){
			return "Thursday";
		}
		if(number == 6){
			return "Friday";
		}
		if(number == 7){
			return "Saturday";
		}else{
			return "sellist numbrit pole";
		}
	}
	public static ArrayList valjastatunnid(String paev){
		
		ArrayList<String> Monday = new ArrayList<String>();
		Monday.add("veebiproge");
		Monday.add("loodus");
		Monday.add("ajalugu");
		Monday.add("Matemaatika");
		
		ArrayList<String> Tuesday = new ArrayList<String>();
		Tuesday.add("veebiproge");
		Tuesday.add("loodus");
		Tuesday.add("ajalugu");
		Tuesday.add("Matemaatika");
		
		ArrayList<String> Wednesday = new ArrayList<String>();
		Wednesday.add("veebiproge");
		Wednesday.add("matemaatika");
		Wednesday.add("veebiproge");
		Wednesday.add("inglise keel");
		
		ArrayList<String> Thursday = new ArrayList<String>();
		Thursday.add("veebiproge");
		Thursday.add("veebiproge");
		Thursday.add("veebiproge");
		Thursday.add("inglise keel");
		
		ArrayList<String> Friday = new ArrayList<String>();
		Friday.add("veebiproge");
		Friday.add("veebiproge");
		Friday.add("veebiproge");
		Friday.add("inglise keel");
		
		ArrayList<String> Saturday = new ArrayList<String>();
		Saturday.add("tunde pole");
		
		ArrayList<String> Sunday = new ArrayList<String>();
		Sunday.add("tunde pole");
		
		if(paev.equals("Monday")){
			return Monday;
		}
		if(paev.equals("Tuesday")){
			return Tuesday;
		}
		if(paev.equals("Wednesday")){
			return Wednesday;
		}
		if(paev.equals("Thursday")){
			return Thursday;
		}
		if(paev.equals("Friday")){
			return Friday;
		}
		if(paev.equals("Saturday")){
			return Saturday;
		}
		if(paev.equals("Sunday")){
			return Sunday;
		}else{
			throw new RuntimeException("puudub paev");
		}
		
		
	
	}
	
}
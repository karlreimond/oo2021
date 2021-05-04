import java.util.ArrayList;
public class KorvpalliTrennid{
	public static ArrayList<String> valjastatrennid(String paev){
		
		ArrayList<String> Monday = new ArrayList<String>();
		Monday.add("Trenn kell 15.00");

		ArrayList<String> Tuesday = new ArrayList<String>();
		Tuesday.add("Trenn kell 16.00");
		
		ArrayList<String> Wednesday = new ArrayList<String>();
		Wednesday.add("Trenn kell 17.00");
		
		ArrayList<String> Thursday = new ArrayList<String>();
		Thursday.add("Trenn kell 18.00");

		
		ArrayList<String> Friday = new ArrayList<String>();
		Friday.add("Trenn kell 19.00");

		ArrayList<String> Saturday = new ArrayList<String>();
		Saturday.add("Trenni pole");
		
		ArrayList<String> Sunday = new ArrayList<String>();
		Sunday.add("Trenni pole");
		
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
	
	

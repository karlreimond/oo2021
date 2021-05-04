public class Proov5{
    public static void kuvaOlek(Voolujuht v){
        if(v.kasJuhib()){
            System.out.println("Juhib");
        } else {
            System.out.println("Ei juhi");
        }
    }
    public static void main(String[] arg){
        Lyliti l1=new Lyliti();
        Lyliti l2=new Lyliti();
        Lyliti l3=new Lyliti();
        Lyliti l4=new Lyliti();
		Lyliti l5=new Lyliti();
        Lyliti l6=new Lyliti();
        Lyliti l7=new Lyliti();
		Lyliti l8=new Lyliti();
		
		l1.seisund(true);
        l2.seisund(false);
        l3.seisund(false);
        l4.seisund(false);
        l5.seisund(true);
        l6.seisund(false);
        l7.seisund(false);
        l8.seisund(true);
		
		
        Roopyhendus r1=new Roopyhendus();
        r1.lisa(l1);
        r1.lisa(l2);
		Roopyhendus r2=new Roopyhendus();
        r2.lisa(l3);
        r2.lisa(l4);
		Roopyhendus r3=new Roopyhendus();
        r3.lisa(l6);
        r3.lisa(l7);
		Jadayhendus j1=new Jadayhendus();
        j1.lisa(r2); j1.lisa(l8);
		Roopyhendus r4=new Roopyhendus();
		r4.lisa(j1);
        r4.lisa(l5);
		Roopyhendus r5=new Roopyhendus();
        r2.lisa(j1);
        r2.lisa(r4);
		
		kuvaOlek(r3);
    }
}
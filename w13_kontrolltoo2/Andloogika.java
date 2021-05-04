public class Andloogika implements Sisend{
    boolean kanal1;
    boolean kanal2;
    String nimi;
    boolean valjund;
    public Andloogika(boolean kanal1, boolean kanal2, String nimi){
        this.kanal1 = kanal1;
        this.kanal2 = kanal2;
        this.nimi = nimi;
    }

    public boolean kysi(){
        if( kanal1 == true && kanal2 == true){
            System.out.println(nimi + " on true");
            valjund = true;
            return true;
        }
        else{
            System.out.println(nimi + " on false");
            valjund = false;
            return false;
        }

    }
}
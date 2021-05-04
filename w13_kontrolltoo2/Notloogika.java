public abstract class Notloogika implements Sisend{
    boolean kanal1;
    boolean valjund;
    String nimi;

    public Notloogika(boolean kanal1, String nimi) {
        this.kanal1 = kanal1;
        this.nimi = nimi;
    }

    public boolean kysi() {

        valjund = !kanal1;
        System.out.println(nimi +" on "+ Boolean.toString(valjund));
        return valjund;
    }
}
public class PohjaPindala implements AnumaArvutused{
	public int r;
	public int h;
		public PohjaPindala(int r, int h){
		this.r = r;
		this.h = h;
		}
    @Override
    public String pohjapindala() {
        double pohi = ((r*2)+ 3.14);
        return "Tassi põhjapindala on: " + pohi;
	}
	
    @Override
    public String veemaht() {
        double vesitassis = (3.14*(r*2)*h);
        return "Tassi vee ruumala on: " + vesitassis;
    }
    
}
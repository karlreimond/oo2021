import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
    // write your code here

     boolean sisend1 = true;
     boolean sisend2 = false;

    Andloogika a1 = new Andloogika(kysi(), sisend1, "nr 1");
        a1.kysi();

    Orloogika a2 = new Orloogika(a1.valjund, sisend1, "nr 2");
        a2.kysi();

    Andloogika a3 = new Andloogika(a2.valjund, sisend2, "nr 3");
        a3.kysi();

    Andloogika a4 = new Andloogika(a3.valjund, sisend2, "nr 4");
        a4.kysi();

    Notloogika a5 = new Notloogika(a4.valjund, "nr 5"){};
        a5.kysi();


    }
    public static boolean kysi(){
        Scanner kys = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Sisesta väärtus: ");
        boolean kanal = Boolean.parseBoolean(kys.nextLine());
        return kanal;
    }
}
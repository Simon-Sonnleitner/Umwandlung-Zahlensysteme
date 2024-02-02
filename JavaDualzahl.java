

public class JavaDualzahl
{

    JavaDualzahl()
    {

    }

    public int wandleBinInDez(int BinZahl)
    {
        int DezZahl = 0;
        for (int i = 0; BinZahl > 0 ; i++)
        {
            int restwert = BinZahl % 10;
            DezZahl = (int) (restwert * Math.pow(2 , i) + DezZahl);
            BinZahl = BinZahl / 10;

        }
        System.out.println("Die Lösung ist: " + DezZahl);
        return DezZahl;
    }
    public int wandleDezInBin(int DezZahl)
    {
        int Binaerzahl = 0;
        for (int i = 0; DezZahl > 0; i++)
        {
            int restwert = DezZahl % 2;
            Binaerzahl = (int) (restwert * Math.pow(10, i) + Binaerzahl);
            DezZahl = DezZahl / 2;
        }
        System.out.println("Die Lösung ist: " + Binaerzahl);
        return Binaerzahl;
    }

}

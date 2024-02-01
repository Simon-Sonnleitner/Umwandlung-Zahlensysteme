

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
            DezZahl = restwert * 2^i + DezZahl;
            BinZahl = BinZahl / 10;
            System.out.println(DezZahl);

        }
        System.out.println(DezZahl);
        return DezZahl;
    }

}

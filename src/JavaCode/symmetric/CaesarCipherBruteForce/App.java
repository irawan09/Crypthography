package JavaCode.symmetric.CaesarCipherBruteForce;

import static JavaCode.symmetric.TextColor.ANSI_RED;

public class App {
    public static void main(String[] args) {

        CaesarCipherBruteForce cracker = new CaesarCipherBruteForce();
        cracker.crack("WKLVCLVCMXVWCDQCH DPSOH");
        System.out.println(ANSI_RED+"The number of encrypted key is 3");
    }
}

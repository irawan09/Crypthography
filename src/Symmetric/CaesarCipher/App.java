package Symmetric.CaesarCipher;

import static Symmetric.TextColor.ANSI_BLUE;
import static Symmetric.TextColor.ANSI_RED;

public class App {
    public static void main(String[] args) {

        String text = "My name is Kevin and I am a working as a software engineer at a multinational company and my main interests are algorithms and machine learning";

        CaesarCipher cipher = new CaesarCipher();

        String cipherText = cipher.encrypt(text, 10);
        System.out.println(ANSI_RED+cipherText);

        System.out.println(ANSI_BLUE+cipher.decrypt(cipherText, 10));
    }
}

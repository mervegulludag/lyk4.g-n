package CaesarCipher;

import java.util.Scanner;

public class CaesarCipher {
	private static int anahtar;
	private static String mesaj;
	
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("anahtarı girin:");
		anahtar=input.nextInt();
		input.nextLine();
		Scanner input2=new Scanner(System.in);
		System.out.println("şifrelenecek mesajı girin:");
		mesaj=input2.nextLine();
		String şifreli=encrypt(mesaj,anahtar);
		System.out.println(şifreli);
		System.out.println(dencrypt(şifreli,anahtar));
	}
	 
	public static String encrypt(String msg, int key) {
		if(key < 0) key = 26-(-key%26);
        String result = "";
        for(int i = 0; i < msg.length();i++){
            char ch = msg.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isUpperCase(ch)){
                    result += (char)('A' + (ch + key - 'A')%26);
                }
                else{
                    result += (char)('a' + (ch + key - 'a')%26);
                }
            }
            else{
                result += ch;
            }
        }
        return result;
	}
	
	public static String dencrypt(String mesaj, int key) {
		return encrypt(mesaj,-key);
	}
	
}

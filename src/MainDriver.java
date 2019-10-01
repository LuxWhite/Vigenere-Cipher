import java.util.Scanner;
public class MainDriver {
    public static void main (String[] arg )
    {
        vCipher user1 = new vCipher();

        System.out.println("!--------Welcome to vCipher example-------!");
        System.out.println("Enter plain text u wish to encrypt: ");
        Scanner input = new Scanner(System.in);
        String plainText = input.nextLine();

        String keyText = "VIGENERECIPHER";
        System.out.println("------------------vCipher---------------------");

        String encryption = user1.cipher(plainText,keyText);
        System.out.println("Encrypted text : "+encryption);

        System.out.print("Do you wish to decrypt ?  Y/N: ");
        Scanner ans = new Scanner(System.in);
        String response = ans.nextLine();

        switch (response.toUpperCase()){
            case "Y":
                System.out.println();
                System.out.println("Key: "+keyText);
                System.out.println("Decrypted text: "+user1.decrypt(encryption,keyText));
                break;
            case "N":
                System.out.println("alrighty then" );
                break;
        }
        System.out.println("------------------------FIN-----------------------------");
    }
}

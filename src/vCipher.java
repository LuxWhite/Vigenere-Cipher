public class vCipher {

    /*public String keyGenerator (String text, String key)
    {
        int t = text.length();
        for (int i = 0; ;i++)
        {
            if (t == i)
                i = 0;
            if (key.length() == text.length())
                break;
            key += (key.charAt(i));
        }
        return key;
    }*/

    public String cipher(String text, String key)
    {
        String cipherText = "";
        text = text.toUpperCase();

        for (int i = 0, x=0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z')
                continue;
            cipherText += (char) ((c + key.charAt(x) -2 *'A') %26 + 'A');
            x = ++x % key.length();
            /*int convert = (text.charAt(i) + key.charAt(i)) %26;

            convert += 'A';
            cipherText += (char)(convert);
            */
        }
        return cipherText;
    }


    public String decrypt(String cipherText, String key)
    {
        String decryptionText = "";
        cipherText = cipherText.toUpperCase();

        for (int x =0,s=0; x<cipherText.length();x++){
            char c = cipherText.charAt(x);
            if ((c < 'A' || c >'Z'))
                continue;

                decryptionText += (char)((c - key.charAt(s) + 26) %26 + 'A');
                s = ++ s % key.length();
        /*for (int i = 0; i < cipherText.length() &&
                                i < key.length(); i++){

            int convert = (cipherText.charAt(1) -
                            key.charAt(i) +26) %26;

            convert += 'A';
            decryptionText += (char)(convert);
            */
        }
        return decryptionText;
    }
}

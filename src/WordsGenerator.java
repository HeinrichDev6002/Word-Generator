/**
 * @author: Henrique S.M
 * This project is made for Izanagi, her version has a different feature
 */
interface Alphabet{
    final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
}

public class WordsGenerator implements Alphabet {


    public static String generate(int[] i) throws Exception {
        StringBuilder str = new StringBuilder();
        if(i.length != 0) {
            for(int j = 0; j < i.length; j++) {
                if(i[j] >= ALPHABET.length()) {
                    throw new Exception("Posição inválida");
                }

                str.append(ALPHABET.charAt(i[j]));
            }
            return str.toString();
        }
        return null;
    }
}
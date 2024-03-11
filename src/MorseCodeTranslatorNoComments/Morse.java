package MorseCodeTranslatorNoComments;
import java.util.HashMap;
public class Morse {
    HashMap<String,String> morseToLetters = new HashMap<>();
    public Morse(){
        morseToLetters.put("*-","A");
        morseToLetters.put("-***","B");
        morseToLetters.put("-*-*","C");
        morseToLetters.put("-**","D");
        morseToLetters.put("*","E");
        morseToLetters.put("**-*","F");
        morseToLetters.put("--*","G");
        morseToLetters.put("****","H");
        morseToLetters.put("**","I");
        morseToLetters.put("*---","J");
        morseToLetters.put("-*-","K");
        morseToLetters.put("*-**","L");
        morseToLetters.put("--","M");
        morseToLetters.put("-*","N");
        morseToLetters.put("---","O");
        morseToLetters.put("*--*","P");
        morseToLetters.put("--*-","Q");
        morseToLetters.put("*-*","R");
        morseToLetters.put("***","S");
        morseToLetters.put("-","T");
        morseToLetters.put("**-","U");
        morseToLetters.put("***-","V");
        morseToLetters.put("*--","W");
        morseToLetters.put("-**-","X");
        morseToLetters.put("-*--","Y");
        morseToLetters.put("--**","Z");
        morseToLetters.put("*----","1");
        morseToLetters.put("**---","2");
        morseToLetters.put("***--","3");
        morseToLetters.put("****-","4");
        morseToLetters.put("*****","5");
        morseToLetters.put("-****","6");
        morseToLetters.put("--***","7");
        morseToLetters.put("---**","8");
        morseToLetters.put("----*","9");
        morseToLetters.put("-----","0");
        morseToLetters.put("*-*-*-",".");
        morseToLetters.put("--**--",",");
        morseToLetters.put("**--**","?");
        morseToLetters.put("-*-*--","!");
    }
    public String getLettersFromMorse(String morse) {
        StringBuilder textResult = new StringBuilder();

        String [] morseWords = morse.trim().split("\\s+/\\s+");

        for (int i = 0; i <morseWords.length; i++){
            String morseWord = morseWords[i];
            String[] morseLetters = morseWord.split("\\s+");

            for (int j = 0; j < morseLetters.length; j++){
                String morseLetter = morseLetters[j];
                String letter = morseToLetters.getOrDefault(morseLetter,"Not correct morse code. Try again!");
                textResult.append(letter);
            }
            textResult.append(" ");
        }

        return textResult.toString().trim();
    }

}

package MorseCodeTranslatorNoComments;
import java.util.HashMap;
public class Letters {
    HashMap<String,String> lettersToMorse = new HashMap<>();
    public  Letters(){
        lettersToMorse.put("A","*-");
        lettersToMorse.put("B","-***");
        lettersToMorse.put("C","-*-*");
        lettersToMorse.put("D","-**");
        lettersToMorse.put("E","*");
        lettersToMorse.put("F","**-*");
        lettersToMorse.put("G","--*");
        lettersToMorse.put("H","****");
        lettersToMorse.put("I","**");
        lettersToMorse.put("J","*---");
        lettersToMorse.put("K","-*-");
        lettersToMorse.put("L","*-**");
        lettersToMorse.put("M","--");
        lettersToMorse.put("N","-*");
        lettersToMorse.put("O","---");
        lettersToMorse.put("P","*--*");
        lettersToMorse.put("Q","--*-");
        lettersToMorse.put("R","*-*");
        lettersToMorse.put("S","***");
        lettersToMorse.put("T","-");
        lettersToMorse.put("U","**-");
        lettersToMorse.put("V","***-");
        lettersToMorse.put("W","*--");
        lettersToMorse.put("X","-**-");
        lettersToMorse.put("Y","-*--");
        lettersToMorse.put("Z","--**");
        lettersToMorse.put("1","*----");
        lettersToMorse.put("2","**---");
        lettersToMorse.put("3","***--");
        lettersToMorse.put("4","****-");
        lettersToMorse.put("5","*****");
        lettersToMorse.put("6","-****");
        lettersToMorse.put("7","--***");
        lettersToMorse.put("8","---**");
        lettersToMorse.put("9","----*");
        lettersToMorse.put("0","-----");
        lettersToMorse.put(".","*-*-*-");
        lettersToMorse.put(",","--**--");
        lettersToMorse.put("?","**--**");
        lettersToMorse.put("!","-*-*--");
    }
    public String getMorseCodeLetter(String letter) {
        letter = letter.toUpperCase();
        return lettersToMorse.getOrDefault(letter, "Not a correct letter. Try Again!");
    }
    public String getMorseCodeWord(String text) {
        StringBuilder morseResult = new StringBuilder();

        for (char character : text.toUpperCase().toCharArray()) {
            if (character == ' ') {
                morseResult.append("/ ");
            } else {
                String morseCode = getMorseCodeLetter(String.valueOf(character));
                morseResult.append(morseCode).append(" ");
            }
        }
        return morseResult.toString().trim();
    }
}



import java.util.*;
import java.util.regex.*;

public class Translator {

    // Tokenize text (preserve spaces, punctuation, newlines)
    public static List<String> tokenize(String text) {
        List<String> tokens = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\n|\\s|[^\\w\\s]|\\w+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            tokens.add(matcher.group());
        }
        return tokens;
    }

    // Preserve capitalization
    public static String matchCase(String original, String translated) {
        if (original.equals(original.toUpperCase())) {
            return translated.toUpperCase();
        }
        if (Character.isUpperCase(original.charAt(0))) {
            return translated.substring(0, 1).toUpperCase() + translated.substring(1);
        }
        return translated;
    }

    // Translate full text
    public static String translateText(String text, Arbol<Association> tree) {
        List<String> tokens = tokenize(text);
        StringBuilder result = new StringBuilder();
        for (String token : tokens) {
            if (token.matches("\\w+")) {
                Association temp = new Association(token.toLowerCase(), "");
                Association found = tree.search(temp);
                if (found != null) {
                    result.append(matchCase(token, found.getPalabraEspaniol()));
                } else {
                    result.append("\"").append(token).append("\"");
                }
            } else {
                result.append(token);
            }
        }
        return result.toString();
    }
}
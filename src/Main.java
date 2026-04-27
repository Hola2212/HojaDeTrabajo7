import java.util.Vector;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FileReaderUtil reader = new FileReaderUtil();
        FileWritter writer = new FileWritter();

        // 1. Load dictionary
        Vector<String> dictLines = reader.ReadFile("src/diccionario.txt");
        Arbol<Association> tree = new Arbol<>();

        for (String line : dictLines) {

            line = line.trim();

            if (line.isEmpty()) continue;

            String[] parts = line.split(",\\s*");

            if (parts.length < 2) {
                System.out.println("Invalid line skipped: " + line);
                continue;
            }

            String english = parts[0].toLowerCase();
            String spanish = parts[1];

            tree.add(new Association(english, spanish));
        }

        // 2. Read input text
        Vector<String> textLines = reader.ReadFile("src/texto.txt");

        StringBuilder fullText = new StringBuilder();

        for (String line : textLines) {
            fullText.append(line).append("\n");
        }

        // 3. Translate
        String translated = Translator.translateText(fullText.toString(), tree);

        // 4. Write output
        writer.WriteToTarget("src/resultado.txt", translated);

        System.out.println("Translation completed.");
    }
}
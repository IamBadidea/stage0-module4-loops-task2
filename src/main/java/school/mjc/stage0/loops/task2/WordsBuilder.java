package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public static void main(String[] args) {
        WordsBuilder wb = new WordsBuilder();
        wb.buildPhrase('s', 'e', 'x');
    }
    public void buildPhrase(char... chars) {
        int i = 0;

        while (i < chars.length) {
            System.out.print(chars[i]);
            i++;
        }
    }
}

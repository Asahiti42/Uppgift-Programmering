package Uppgift1Inlämning;

public class Counter {
    private int lineCount = 0;
    private int charCount = 0;

    public void addLine(String line) {
        lineCount++;
        charCount += line.length();
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getCharCount() {
        return charCount;
    }
}
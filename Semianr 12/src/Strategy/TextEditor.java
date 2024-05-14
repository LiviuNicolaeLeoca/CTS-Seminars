package Strategy;

public class TextEditor {
    private TextFormatter formatter;

    public TextEditor(TextFormatter formatter)
    {
        this.formatter=formatter;
    }

    public void setFormatter(TextFormatter formatter)
    {
        this.formatter=formatter;
    }

    public String formatText(String text)
    {
        return formatter.format(text);
    }
}

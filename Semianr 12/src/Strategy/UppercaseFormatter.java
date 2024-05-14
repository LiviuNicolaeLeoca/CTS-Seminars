package Strategy;

public class UppercaseFormatter implements TextFormatter{
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}

package Strategy;

public class CamelCaseFormatter implements TextFormatter{
    @Override
    public String format(String text) {
        String[] words=text.split(" ");
        StringBuilder result = new StringBuilder(words[0].toLowerCase());
        for(int i =0;i<words.length;i++)
        {
            result.append(words[i].substring(0,1).toUpperCase()).append(words[i].substring(1).toLowerCase());
        }
        return result.toString();
    }
}

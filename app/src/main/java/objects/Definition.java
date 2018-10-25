package objects;

public class Definition {
    private String word;
    private String description;

    public Definition (String word, String description) {
        this.word = word;
        this.description = description;
    }

    public String getWord() {
        return word;
    }

    public String getDescription() {
        return description;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

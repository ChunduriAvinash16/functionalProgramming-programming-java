package CommonStreamAPIQuestionsPractice;

public class Notes {
    int id;
    String name;
    int tagId;

    public Notes(int id, String name, int tagId) {
        this.id = id;
        this.name = name;
        this.tagId = tagId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTagId() {
        return tagId;
    }
}

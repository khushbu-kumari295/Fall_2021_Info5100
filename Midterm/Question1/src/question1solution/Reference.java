package question1solution;

public class Reference extends Book{

    String category;

    public Reference(String title, double price, String publishYear, String category) {
        super(title, price, publishYear);
        this.category = category;
    }

    public Reference(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    String description() {
        return getTitle()+ " all information is real.";
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

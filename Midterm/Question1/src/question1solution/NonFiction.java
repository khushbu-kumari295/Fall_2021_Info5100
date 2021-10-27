package question1solution;

public class NonFiction extends Book implements iBorrowable{
    int startDay;
    int endDay;
    public NonFiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    String description() {
        return getTitle() + "all events are true and based on real facts.";
    }

    @Override
    public void setBorrowDate(int day) {
        this.startDay = day;
    }

    @Override
    public void setReturnDate(int day) {
        this.endDay = day;
    }

    @Override
    public boolean isAvailable(int day) {
        return day >= startDay || day <= endDay;
    }
}

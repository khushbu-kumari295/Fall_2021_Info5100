package question1solution;

public class Fiction extends Book implements iBorrowable{

    int startDay;
    int endDay;
    public Fiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    String description() {
        return getTitle()+ "all events are imaginary and not based on real facts";
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

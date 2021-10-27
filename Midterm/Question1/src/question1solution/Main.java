package question1solution;

public class Main {

    public static void main(String[] args) {
        Fiction fiction = new Fiction("Frankenstein(title) ", 400.00, "2009");
        NonFiction nonFiction = new NonFiction("Anne Frank(title)", 200.00, "2003");
        Reference reference = new Reference("World Maps(title)", 300.00, "2005", "dictionaries");

        System.out.println(fiction.description());
        System.out.println(nonFiction.description());
        System.out.println(reference.description());

        fiction.setBorrowDate(5);
        fiction.setReturnDate(7);
        System.out.println(fiction.isAvailable(2));


        nonFiction.setBorrowDate(8);
        nonFiction.setReturnDate(10);
        System.out.println(nonFiction.isAvailable(9));

    }
}

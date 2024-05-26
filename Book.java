public class Book {
    public String name;
    public int pages;
    public int currentPage;


    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
        this.currentPage = 0;
    }
    public void TurnPage() {
        if (currentPage < pages) {
            currentPage++;
        } else {
            System.out.println("du är redan i slutet av den här boken");
        }
    }
}

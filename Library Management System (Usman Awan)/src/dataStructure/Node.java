package dataStructure;

/**
 * Node Class
 *
 */
public final class Node {

    private Node Next;
    private Node Previous;
    private int bookid, shelf;
    private String booktitle, authorname, catagory, date;
    private int quantity;

    private double price;

    public Node getNext() {
        return Next;
    }

    public void setNext(Node Next) {
        this.Next = Next;
    }

    public Node getPrevious() {
        return Previous;
    }

    public void setPrevious(Node Previous) {
        this.Previous = Previous;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public void setShelf(int shelf) {
        this.shelf = shelf;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBookTitle(String booktitle) {
        this.booktitle = booktitle;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getBookid() {
        return bookid;
    }

    public int getShelf() {
        return shelf;
    }

    public double getPrice() {
        return price;
    }

    public String getBookTitle() {
        return booktitle;
    }

    public String getAuthorname() {
        return authorname;
    }

    public String getCatagory() {
        return catagory;
    }

    public String getDate() {
        return date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}

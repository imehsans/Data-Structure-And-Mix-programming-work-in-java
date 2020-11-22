package dataStructure;

import gui.ShowAll;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Doubly Linked List Class
 *
 */
public class DLL {

    private Node Head;
    private Node Tail;
    private final ShowAll tableFrame;

    public DLL() {
        tableFrame = new ShowAll();
        fillSampleData();   //Add Data to LinkedList from Object's 2D Array
    }

    public void insertData(final int bookid, final int bookshelf, final String booktitle, final String authorname,
            final String catagory, final String date, final int quantity, final double price) {
        if (Head == null) {
            insertAtFirst(bookid, bookshelf, booktitle, authorname, catagory, date, quantity, price);
        } else {
            insertAtLast(bookid, bookshelf, booktitle, authorname, catagory, date, quantity, price);
        }
    }

    private void insertAtFirst(final int bookid, final int bookshelf, final String booktitle, final String authorname,
            final String catagory, final String date, final int quantity, final double price) {
        Node firstNode = new Node();
        firstNode.setBookid(bookid);
        firstNode.setShelf(bookshelf);
        firstNode.setBookTitle(booktitle);
        firstNode.setAuthorname(authorname);
        firstNode.setCatagory(catagory);
        firstNode.setDate(date);
        firstNode.setQuantity(quantity);
        firstNode.setPrice(price);
        firstNode.setNext(null);
        firstNode.setPrevious(null);
        Head = firstNode;
        Tail = firstNode;
    }

    private void insertAtLast(final int bookid, final int bookshelf, final String booktitle, final String authorname,
            final String catagory, final String date, final int quantity, final double price) {
        Node lastNode = new Node();
        lastNode.setBookid(bookid);
        lastNode.setShelf(bookshelf);
        lastNode.setBookTitle(booktitle);
        lastNode.setAuthorname(authorname);
        lastNode.setCatagory(catagory);
        lastNode.setDate(date);
        lastNode.setQuantity(quantity);
        lastNode.setPrice(price);
        lastNode.setNext(null);
        lastNode.setPrevious(Tail);
        Tail.setNext(lastNode);
        Tail = lastNode;
    }

    public boolean deleteAll() {
        if (Head == null) {
            return false;
        }
        Head = null;
        Tail = null;
        return true;
    }

    public Node searchByValue(int bookid) {
        Node move = Head;
        while (move != null) {
            if (move.getBookid() == bookid) {
                return move;
            }
            move = move.getNext();
        }
        return null;
    }

    private void DeleteFirst() {
        Head = Head.getNext();
    }

    private void DeleteLast() {
        Tail.getPrevious().setNext(null);
    }

    public void deleteSpecifiedValue(int bookid) {
        Node move = Head;

        while (move != null) {
            if (move.getBookid() == bookid) {
                if (move == Head) {
                    DeleteFirst();
                    break;
                } else if (move == Tail) {
                    DeleteLast();
                    break;
                } else {
                    move.getPrevious().setNext(move.getNext());
                    break;
                }
            }
            move = move.getNext();
        }
    }

    private final Object[][] SAMPLE_DATA = {
        {100, 4123, "C LANGUAGE", "KENATHKAR", "COMPUTER", "3-3-2018", 50, 3230.10},
        {200, 2344, "PYTHON 8", "ZED A.SHAW", "COMPUTER", "6-3-2016", 50, 4230.20},
        {300, 1344, "JAVASCRIPT", "DEITAL", "COMPUTER", "4-3-2015", 50, 2230.30},
        {400, 5433, "VISUAL C#", "DAVID CHAPMAN", "COMPUTER", "3-3-2017", 50, 1230.10},
        {500, 2455, "CALCULUS", "THOMAS", "MATHEMATICS", "1-3-2018", 50, 2230.40}
    };

    private void fillSampleData() {
        /**
         * Add Data to LinkedList from Object 2D Array
         */
        for (int i = 0; i < SAMPLE_DATA.length; i++) {
            insertData((Integer) SAMPLE_DATA[i][0], (Integer) SAMPLE_DATA[i][1], SAMPLE_DATA[i][2].toString(),
                    SAMPLE_DATA[i][3].toString(), SAMPLE_DATA[i][4].toString(), SAMPLE_DATA[i][5].toString(),
                    (Integer) SAMPLE_DATA[i][6], (Double) SAMPLE_DATA[i][7]);
        }
    }

    public void printAll() {
        JTable table = tableFrame.getTable();
        DefaultTableModel model = new DefaultTableModel();
        String[] columns = {"Book ID", "Book Shelf", "Book Title", "Author Name", "Catagory", "Date", "Quantity", "Price"};
        model.setColumnIdentifiers(columns);

        Node move = Head;
        while (move != null) {
            String[] row = {String.valueOf(move.getBookid()), String.valueOf(move.getShelf()), move.getBookTitle(),
                move.getAuthorname(), move.getCatagory(), move.getDate(), String.valueOf(move.getQuantity()),
                String.valueOf(move.getPrice())};
            model.addRow(row);
            
            move = move.getNext();
        }

        table.setModel(model);
        tableFrame.setVisible(true);
    }
}

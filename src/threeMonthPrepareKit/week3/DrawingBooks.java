package threeMonthPrepareKit.week3;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年09月07日 2:39 PM
 */
public class DrawingBooks {
    public static void main(String[] args) {

        System.out.println(pageCount(6,2));
    }

    /**
     * A teacher asks the class to open their books to a page number.
     * A student can either start turning pages from the front of the book or from the back of the book.
     * They always turn pages one at a time. When they open the book, page  is always on the right side:
     * When they flip page 1, they see pages 2 and 3.
     * Each page except the last page will always be printed on both sides.
     * The last page may only be printed on the front, given the length of the book.
     * If the book is  pages long, and a student wants to turn to page ,
     * what is the minimum number of pages to turn? They can start at the beginning or the end of the book.
     *
     * Given  and , find and print the minimum number of pages that must be turned in order to arrive at page .
     * @param n total page
     * @param p target paeg
     * @return minimum flips
     */
    public static int pageCount(int n, int p) {
        // Write your code here
        //look 2side of the page as 1 page
        //book: 01  23  45  67
        if(n-p > p-1){
            return p/2;
        }

        return n/2 - p/2;
    }
}

import java.util.Arrays;
import java.util.Comparator;

public class BookSearch {
     public static int linearSearch(Book[] books, String targetTitle) {
          for (int i = 0; i < books.length; i++) {
               if (books[i].getTitle().equalsIgnoreCase(targetTitle)) {
                    return i;
               }
          }
          return -1;
     }

     public static int binarySearch(Book[] books, String targetTitle) {
          int low = 0;
          int high = books.length - 1;

          while (low <= high) {
               int mid = (low + high) / 2;
               int cmp = books[mid].getTitle().compareToIgnoreCase(targetTitle);

               if (cmp == 0)
                    return mid;
               else if (cmp < 0)
                    low = mid + 1;
               else
                    high = mid - 1;
          }

          return -1;
     }

     public static void sortByTitle(Book[] books) {
          Arrays.sort(books, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
     }
}

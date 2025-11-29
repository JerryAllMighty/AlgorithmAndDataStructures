package Sort;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class BJ1302 {

    static Book[] list;

    static class Book {
        private String name;
        private int count;

        public Book(String name, int count) {
            this.name = name;
            this.count = count;
        }

        public static void getCount(String bookName, int index) {
            for (int i = 0; i < list.length; i++) {
                Book book = list[i];
                if (book != null
                        && book.name.equals(bookName)) {
                    book.count++;
                    list[index] = book;
                    return;
                }
            }
            list[index] = new Book(bookName, 1);

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        list = new Book[n];
        for (int i = 0; i < n; i++) {
            String bookName = br.readLine();
            Book.getCount(bookName, i);
        }

        Arrays.sort(list, new Comparator<>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o2.count == o1.count) {
                    return o1.name.compareTo(o2.name);
                }
                return o2.count - o1.count;

            }
        });
        bw.write(list[0].name);
        bw.flush();
        bw.close();
        br.close();
    }
}

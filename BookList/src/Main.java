import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<Book> book_list=new ArrayList<>();
        book_list.add(new Book("Şeker Portakalı",182,"Jose Mauro De Vasconcelos","06.09.2019"));
        book_list.add(new Book("Kürk Mantolu Madonna",160,"Sabahattin Ali","14.10.2019"));
        book_list.add(new Book("Simyacı",184,"Paulo Coelho",",28.09.2021"));
        book_list.add(new Book("Emir Demir, İksirin Peşinde",172,"Hilal Çelenk","27.05.2022"));
        book_list.add(new Book("Devrimle Doğanlar",96,"Fyodor Gladkov ","28.05.2022"));
        book_list.add(new Book("Öteki",96,"Erdinç Aydın","27.05.20221"));
        book_list.add(new Book("Kayıp İnsanlar",144,"Maksim Gorki","28.05.2022"));
        book_list.add(new Book("Çekmecemi Karıştıran Cesetle",118,"Yaşar Bedri ","28.05.2022"));
        book_list.add(new Book("Hayvan Çiftliği",152,"George Orwell ","04.10.2019"));
        book_list.add(new Book("Balıkçı ve Oğlu",140,"Zülfü Livaneli ","01.06.2021"));

        Map<String,String> maplist=new TreeMap<String,String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        book_list.forEach(i->{
            maplist.put(i.getBook_name(),i.getAuthor_name());

        });
        ArrayList<Book> bookpage=new ArrayList<>();
        book_list.stream().forEach(i->{
            if(i.getBook_page()>100){
                bookpage.add(i);
            }
        });




    }
}

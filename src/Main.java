import enums.Gender;
import enums.Genre;
import enums.Language;
import model.Book;
import model.User;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Language> users = Arrays.asList(Language.ENGLISH,Language.KYRGYZ,Language.RUSSIAN);

        User user1 = new User(5,"Madina","Halikova","Madinahalikova656@gmail.com",0220113321, Gender.FEMALE,30000,"болЪшая книга");
        User user2 = new User(7,"Aibike","Bekmurza kyzy","BekmurzakyzyAibike611@gmail.com",0220273321, Gender.FEMALE,4000,"акча бул сeн");
        User user3 = new User(2,"Mirlam","alimbekov","Alimbekovmirlan55@gmail.com",0220513321,Gender.MALE,65000,"озунду жeн");
        User user4 = new User(8,"Nuriza","Gulbaeva","Dulbaevanuriza5@gmail.com",0220443321, Gender.FEMALE,2300,"дуйнону дунгуроткон 100 инсан");
        User user5 = new User(4,"asan","Jumabekov","Jumabekovasan3@gmail.com",0220213377,Gender.MALE,5700,"Хроника2");
        List<User> userList = new ArrayList<>(Arrays.asList(user1,user2,user3,user4,user5));

        List<Genre> genres = Arrays.asList(Genre.DETECTIVE,Genre.FANTASY,Genre.HISTORICAL,Genre.ROMANCE);
        Book book = new Book(1L,"Хроника2",Genre.FANTASY,BigDecimal.valueOf(1500),"Геннадий Елагин",Language.ENGLISH,LocalDate.of(2022,12,13));
        Book book1 = new Book(3L,"акча бул сeн",Genre.ROMANCE,BigDecimal.valueOf(3500),"Геннадий Елагин",Language.KYRGYZ, LocalDate.of(2022,11,23));
        Book book2= new Book(5L,"озунду жeн",Genre.HISTORICAL,BigDecimal.valueOf(3500),"Геннадий Елагин",Language.KYRGYZ,LocalDate.of(2002,9,25));
        Book book3= new Book(4L,"дуйнону дунгуроткон 100 инсан",Genre.FANTASY, BigDecimal.valueOf(20000),"Геннадий Елагин",Language.ENGLISH,LocalDate.of(2022,23,10));
        Book book4= new Book(6L,"олЪшая книга",Genre.FANTASY,BigDecimal.valueOf(2500),"Геннадий Елагин",Language.RUSSIAN,LocalDate.of(2022,8,17));
        List<Book> books = new ArrayList<>(Arrays.asList(book,book1,book2,book3,book4));


        }
}
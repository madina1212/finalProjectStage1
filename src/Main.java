import enums.Gender;
import enums.Genre;
import enums.Language;
import model.Book;
import model.User;


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
        Book book = new Book(1L,"Хроника2",Genre.FANTASY,500,"Геннадий Елагин",Language.ENGLISH,2012);
        Book book1 = new Book(3L,"акча бул сeн",Genre.ROMANCE,600,"Геннадий Елагин",Language.KYRGYZ, LocalDate.ofYearDay());
        Book book2= new Book(5L,"озунду жeн",Genre.HISTORICAL,800,"Геннадий Елагин","русский",2013);
        Book book3= new Book(4L,"дуйнону дунгуроткон 100 инсан",Genre.FANTASY,1500,"Геннадий Елагин","русский",2020);
        Book book4= new Book(6L,"олЪшая книга",Genre.FANTASY,2300,"Геннадий Елагин","русский",20119);
        List<Book> books = new ArrayList<>(Arrays.asList(book,book1,book2,book3,book4));


        }
}
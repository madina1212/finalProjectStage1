import model.Book;
import model.User;
import service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User3 implements UserService {
    List<User>users = new ArrayList<>();

    @Override
    public String createUser(List<User> users) {
        his.users.addAll(users);
        return "WAS SUCCESSFUL!!!";
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }

    @Override
    public User findUserById(Long id) {
        List<User>users1 = new ArrayList<>();
        for (User user : users) {
            if(id.equals(user.getId())){
                users1.add(user);
                return (User) users1;
            }
        }
        return null;
    }

    @Override
    public String removeUserByName(String name) {
        for (User user : users) {
            if(user.getName().equals(name)){
                this.users.remove(user);
            }
        }
        return "WAS SUCCESSFUL!!!";
    }

    @Override
    public void updateUser(Long id) {

    }

    @Override
    public void groupUsersByGender() {


    }

    @Override
    public String buyBooks(String name, List<Book> books) {
        List<Book> bug = new ArrayList<>();
        System.out.println("Kidepkanaga kim barad");
        String names = new Scanner(System.in).nextLine();
        for (Book book : bug) {
            if (book.getName().equals(name)) {
                System.out.println("kaisy kidepdi  alasyn");

            }

        }
        return names;
    }
}




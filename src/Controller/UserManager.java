package Controller;

import Model.User;

import java.util.ArrayList;

public class UserManager implements IGeneral<User> {

    static ArrayList<User> users = new ArrayList<>();
    static {
        users.add(new User("_kawa",23,"1"));
        users.add(new User("_kudo",28,"2"));
        users.add(new User("_shinichi",45,"3"));
    }


    @Override
    public void showAll() {
        for (User user: users) {
            System.out.println(user);
        }
    }

    @Override
    public int findById(String id) {
        for (User user : users
             ) {
            if (user.getId().equals(id)){
                return users.indexOf(user);
            }
        }
        return -1;
    }

    @Override
    public void addUser(User i) {
        users.add(i);
    }

    @Override
    public void remove(int index) {
        users.remove(index);
    }

}

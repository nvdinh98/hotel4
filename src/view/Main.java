package view;

import Controller.UserManager;
import Model.User;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        int choice = -1;
        do {
            menu();
            System.out.println("nhap so muon tim");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    ShowAllUSer(userManager);
                    break;
                case 2:
                    addUser(userManager);
                    break;
                case 3:
                    removeUser(userManager);
                    break;
                case 4:
                    System.exit(4);
                    break;


            }

        }
        while (choice != -1);
    }
    public static void addUser(UserManager userManager) {
        User user = inputUser();
        userManager.addUser(user);
        userManager.showAll();
    }

    public static User inputUser() {
        System.out.println("2.Thêm User");
        scanner.nextLine();
        System.out.println("nhap ten user");
        String name = scanner.nextLine();
        System.out.println("nhap tuoi user");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhap code user");
        String id = scanner.nextLine();
        return new User(name, age, id);
    }

    public static void ShowAllUSer(UserManager userManager) {
        System.out.println("Hien thi danh sach USer");
        userManager.showAll();
    }
    public static void removeUser(UserManager userManager){
        System.out.println("3.Xoá User");
        scanner.nextLine();
        System.out.println("nhap id muon xoa");
        String id = scanner.nextLine();
        int index = userManager.findById(id);
        if (index != -1){
            userManager.remove(index);
        } else {
            System.out.println("ko co id nao co the xoa");
        }
    }


    public static void menu() {
        System.out.println("------MENU-------");
        System.out.println("1.Hiển thị danh sách User");
        System.out.println("2.Thêm User");
        System.out.println("3.Xoá User");
        System.out.println("4.Exit");

    }

}

package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class CustomerRelationshipManagement {
    private String name;
    private String emaill;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmaill() {
        return emaill;
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CustomerRelationshipManagement(String name, String emaill, String phoneNumber) {
        this.name = name;
        this.emaill = emaill;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,String[]> hashMap = new HashMap<>();
        while (true){
            System.out.println("lua chon:");
            System.out.println("1. them khach hang");
            System.out.println("2. tim khach hang theo ten");
            System.out.println("3. hien thi tat ca khach hang");
            System.out.println("4. thoat");

            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:

                    System.out.print("nhap ten: ");
                    String name = scanner.nextLine();

                    System.out.print("nhap email: ");
                    String email = scanner.nextLine();

                    System.out.print("nhap so dien thoai: ");
                    String phoneNumber = scanner.nextLine();

                    hashMap.put(name, new String[]{email, phoneNumber});
                    System.out.println("khach hang da them thanh cong!");
                    break;

                case 2:
                    System.out.print("nhap ten: ");
                    name = scanner.nextLine();

                    if (hashMap.containsKey(name)) {
                        String[] hashmap = hashMap.get(name);
                        System.out.println("ten: " + name);
                        System.out.println("email: " + hashmap[0]);
                        System.out.println("so dien thoai: " + hashmap[1]);
                    } else {
                        System.out.println("khong tim thay khach hang!");
                    }

                case 3:
                    for (String hashmap : hashMap.keySet()) {
                        String[] hashmap1 = hashMap.get(hashmap);
                        System.out.println("Name: " + hashmap);
                        System.out.println("Email: " + hashmap1[0]);
                        System.out.println("Phone number: " + hashmap1[1]);
                        System.out.println();
                    }

                    break;

                case 4:
                    System.out.println("byebye!");
                    return;

                default:
                    System.out.println("nhap khong hop le vui long nhap lai!");
                    break;
            }
        }
    }
}

package Interfaces;

import classes.Profile;
import enums.Image;
import enums.Status;
import exceptions.MyException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ServiceProfileImpl implements ServiceProfile{
    private static int counter;
    @Override
    public void installWhatsApp(List<Profile>profiles) {

        try {

            System.out.println("Write phone number");
            int phoneNumber = new Scanner(System.in).nextInt();

            System.out.println("Write username");
            String userName = new Scanner(System.in).nextLine();

            System.out.println("Write password");
            String password = new Scanner(System.in).nextLine();

            Profile profile = new Profile(counter++,userName,phoneNumber,password,"[]",Status.HELLO_I_USE_WHATSAPP,new ArrayList<>());

            profiles.add(profile);
            System.out.println(profile);

        }catch (InputMismatchException e){
            System.out.println(e.getMessage()+"write only number");
        }
    }

    @Override
    public void goToProfile(List<Profile> profiles) {
        for (Profile profile:profiles) {
            System.out.println(profile);
        }
    }

    @Override
    public void getAllWhatsAppStatus(List<Profile>profiles) {
        for (Status status:Status.values()) {
            System.out.println(status);
        }

    }

    @Override
    public void changeProfilePhoto(List<Profile>profiles) {
        try {
            System.out.println("Write username");
            String userName = new Scanner(System.in).nextLine();
            System.out.println("Write password");
            String password = new Scanner(System.in).nextLine();
            System.out.println("Put new photo link:");
            String image = new Scanner(System.in).nextLine();
            for (Profile p : profiles) {
                if (p.getUsername().equals(userName) && p.getPassword().equals(password)) {
                    System.out.println(p.toString());
                    p.setImage(image);
                    System.out.println(p + "\nYour profile successfully changed");

                } else {
                    throw new MyException("Wrong answer or username");
                }
            }

//
        } catch (Exception e) {
            System.out.println("error");
        }
    }
    @Override
    public void changeWhatsAppStatus(List<Profile>profiles) {
        try {
            List<Profile> list = new ArrayList<>();
            System.out.println("Write username");
            String userName = new Scanner(System.in).nextLine();
            System.out.println("Write password");
            String password = new Scanner(System.in).nextLine();
            for (Profile p : profiles) {
                if (p.getUsername().equals(userName) && p.getPassword().equals(password)) {
                    System.out.println("You status " + Status.AT_WORK +
                            "1 -> " + Status.HELLO_I_USE_WHATSAPP +
                            "2 -> " + Status.BUSY +
                            "3 -> " + Status.AT_THE_CINEMA +
                            "4->" + Status.AT_WORK);
                } else {
                    throw new MyException("wrong password or username");
                }
                int a = new Scanner(System.in).nextInt();
                switch (a) {
                    case 1 -> p.setStatus(Status.HELLO_I_USE_WHATSAPP);
                    case 2 -> p.setStatus(Status.BUSY);
                    case 3 -> p.setStatus(Status.AT_THE_CINEMA);
                    case 4 -> p.setStatus(Status.AT_WORK);
                    default -> System.out.println("error");

                }
                System.out.println(p.toString());
            }


        }
        catch (MyException e){
            System.out.println(e.getMessage()+"select from the list");
        }
    }
    @Override
    public void addContact(List<Profile>profiles) {
        try {
            System.out.println("write username");
            String username = new Scanner(System.in).nextLine();
            System.out.println("write password");
            String password = new Scanner(System.in).nextLine();
            System.out.println("Enter contact whatsapp phone number:");
//
            for (Profile p : profiles) {
                if (p.getUsername().equals(username) && p.getPassword().equals(password)) {
                    int phoneNumber1 = new Scanner(System.in).nextInt();
                    System.out.println("This number is not install whatsapp!");
                }
                }
                int a = new Scanner(System.in).nextInt();
                switch (a) {
                    case 1:
                        System.out.println("write phone number");
                        int phoneNumber1 = new Scanner(System.in).nextInt();
                        System.out.println("write username");
                        String username1 = new Scanner(System.in).nextLine();
                        System.out.println("write password");
                        String password1 = new Scanner(System.in).nextLine();
                        Profile profile = new Profile(counter++, username1, phoneNumber1, password1, "!", Status.HELLO_I_USE_WHATSAPP, new ArrayList<>());
                        profiles.add(profile);
                        System.out.println(profile);
                        break;}
                    int b = new Scanner(System.in).nextInt();
                switch (b){
                    case 6:
                        System.out.println("write username");
                        String username2 = new Scanner(System.in).nextLine();
                        System.out.println("write password");
                        String password2 = new Scanner(System.in).nextLine();
                        System.out.println("Enter contact whatsapp phone number:");
                        int phoneNumber2 = new Scanner(System.in).nextInt();

                        for (Profile pp : profiles) {
                            if (phoneNumber2 == pp.getPhoneNumber()) {
                                System.out.println("Contact successfully added to your contact");


                            }
                        }
                }
            }catch (InputMismatchException e){
            System.out.println(e.getMessage()+"Error");
        }
        }



    @Override
    public void sendMessage(List<Profile>profiles) {
        System.out.println("Write username");
        String userName = new Scanner(System.in).nextLine();
        System.out.println("Write password");
        String password = new Scanner(System.in).nextLine();
        for (Profile p:profiles) {
            if (p.getUsername().equals(userName)&& p.getPassword().equals(password)){

                System.out.println("Your contacts"+userName);
            }
        }


    }

    @Override
    public void deleteWhatsApp(List<Profile>profiles) {
        System.out.println("write username");
        String username = new Scanner(System.in).nextLine();
        System.out.println("write password");
        String password = new Scanner(System.in).nextLine();
        for (Profile p:profiles) {
            if (p.getUsername().equals(username)&& p.getPassword().equals(password)){
                System.out.println(profiles.remove(p.getUsername()));
            }
        }

    }
}


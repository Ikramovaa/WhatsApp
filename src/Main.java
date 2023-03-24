import Interfaces.ServiceProfileImpl;
import classes.Profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        ServiceProfileImpl serviceProfile=new ServiceProfileImpl();
        List<Profile>profiles=new ArrayList<>();
        while (true){
            try {
                System.out.println("1->Install " +
                        "\n2->Go to profile" +
                        "\n3->Get all whatsapp status" +
                        "\n4->Change profile photo" +
                        "\n5->Change whatsapp status" +
                        "\n6->Add contact" +
                        "\n7->Send Message" +
                        "\n8->Delete whatsapp");

                int sc= new  Scanner(System.in).nextInt();
                switch (sc){
                    case 1:serviceProfile.installWhatsApp(profiles);
                    break;
                    case 2:serviceProfile.goToProfile(profiles);
                    break;
                    case 3:serviceProfile.getAllWhatsAppStatus(profiles);
                    break;
                    case 4:serviceProfile.changeProfilePhoto(profiles);
                    break;
                    case 5:serviceProfile.changeWhatsAppStatus(profiles);
                    break;
                    case 6:serviceProfile.addContact(profiles);
                    break;
                    case 7:serviceProfile.sendMessage(profiles);
                    break;
                    case 8:serviceProfile.deleteWhatsApp(profiles);
                }
            }catch (Exception e){
                System.out.println("Error");
            }
        }


}


}
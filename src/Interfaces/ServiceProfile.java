package Interfaces;

import classes.Profile;
import exceptions.MyException;

import java.util.List;

public interface ServiceProfile {
    void installWhatsApp(List<Profile> profiles);

    void goToProfile(List<Profile> profiles);

    void getAllWhatsAppStatus(List<Profile>profiles);
    void changeProfilePhoto(List<Profile>profiles) throws MyException;
    void changeWhatsAppStatus(List<Profile>profiles);
    void addContact(List<Profile>profiles);
    void sendMessage(List<Profile>profiles);
    void deleteWhatsApp(List<Profile>profiles);


}

package fichiers_code;

import java.util.ArrayList;

public class CampusGroup extends Group {
    // Attributs
    private ArrayList<Announcement> AnnouncementList;

    // Constructor
    public CampusGroup(String name) {
        super(name, new GroupManager());
        AnnouncementList = new ArrayList<Announcement>();
    }

    // Getters
    public ArrayList<Announcement> getAnnoucementList() {
        return this.AnnouncementList;
    }

    // Methods
    public void viewAnnoucements() {
        for (Announcement announcement : AnnouncementList) {
            System.out.println(announcement.toString());
        }
    }

    public void postAnnouncement(Announcement announcement) {
        AnnouncementList.add(announcement);
        notifyEveryoneNewMessage();
    }

    public void removeAnnouncement(Announcement announcement) {
        AnnouncementList.remove(announcement);// Supprimer un message du chat de groupe
    }

}
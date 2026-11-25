@FunctionalInterface
interface ShareAction{
    void share(ShareFile file);
}
class ShareFile{
    String name;

    ShareFile(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
}

public class ShareButton {
    public static void main(String[] args) {
        ShareFile photos=new ShareFile("vacation.png");

        ShareAction instagram = (file) ->{
            System.out.println("Posting "+ file.getName()+ " to Instagram");
        };

        ShareAction whatsapp = (file) ->{
            System.out.println("Posting "+ file.getName()+ " to WhatsApp");
        };

        ShareAction mail=(file) ->{
            System.out.println("Posting "+ file.getName()+ " to Mail");
        };
        shareOnSmartPhone(photos, instagram);
        shareOnSmartPhone(photos, whatsapp);
        shareOnSmartPhone(photos, mail);

    }
    static void shareOnSmartPhone(ShareFile file, ShareAction action){
        System.out.println("Tap the share button");
        action.share(file);
    }
}

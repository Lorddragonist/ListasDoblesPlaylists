import java.util.Scanner;

public class Song {
    private String name;
    private String status;

    private String menu = "Options";
    private String[] menuOptions = {
            "1. Play",
            "2. Stop",
            "3. Add to PlayList",
            "4. Back to main menu"
    };

    public Song(String name) {
        this.name = name;
        Scanner option = new Scanner(System.in);
        int opt;
        do {
            System.out.println(this.menu);

            for (int i = 0; i < menuOptions.length; i++) {
                System.out.println(menuOptions[i]);
            }

            opt = option.nextInt();
            System.out.println(menuOptions[opt - 1]);
            switch (opt) {
                case 1:
                    this.setStatus("Playing");
                    break;
                case 2:
                    this.setStatus("Stopped");
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        } while (opt != 4);
    }

    public void setStatus(String status) {
        this.status = status;
        System.out.println(status + " " + this.name);
    }
}

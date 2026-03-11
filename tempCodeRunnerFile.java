// Class that stores the banner pattern
class BannerPattern {

    String[] pattern = {
        "  ***     ***    ******    ***** ",
        " ** **   ** **   **  **    **     ",
        "**   ** **   **  **  **    **     ",
        "**   ** **   **  **  **    **     ",
        "**   ** **   **  ******     ***   ",
        "**   ** **   **  **            ** ",
        "**   ** **   **  **            ** ",
        " ** **   ** **   **        **  ** ",
        "  ***     ***    **         ***** "
    };

    // Method to display banner
    void displayBanner() {
        for (String line : pattern) {
            System.out.println(line);
        }
    }
}

// Main class
public class OOPSBannerApp {

    public static void main(String[] args) {

        BannerPattern banner = new BannerPattern();
        banner.displayBanner();

    }
}
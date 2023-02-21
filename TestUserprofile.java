import java.util.Scanner;

public class TestUserProfile {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to UserProfile Creator!");
        
        // Get user's name
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        
        // Display list of genres
        System.out.println("Please choose your favourite genre from the following list:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Drama");
        System.out.println("4. Romance");
        
        // Get user's genre choice
        System.out.print("Enter the number of your favourite genre: ");
        int genreChoice = scanner.nextInt();
        scanner.close();
        
        // Determine the chosen genre
        String genre;
        switch (genreChoice) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Comedy";
                break;
            case 3:
                genre = "Drama";
                break;
            case 4:
                genre = "Romance";
                break;
            default:
                genre = "Unknown";
                break;
        }
        
        // Create user profile
        UserProfile userProfile = new UserProfile(name, genre);
        
        // Display confirmation message
        System.out.println("User profile created: " + userProfile.toString());
    }
    
    public static class UserProfile {
        private String name;
        private String favouriteGenre;
        
        public UserProfile(String name, String favouriteGenre) {
            this.name = name;
            this.favouriteGenre = favouriteGenre;
        }
        
        public String getName() {
            return name;
        }
        
        public String getFavouriteGenre() {
            return favouriteGenre;
        }
        
        public String toString() {
            return "Name: " + name + ", Favourite Genre: " + favouriteGenre;
        }
    }
}

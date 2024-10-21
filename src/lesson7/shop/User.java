package lesson7.shop;

public class User {
    private String username;
    private int level;
    private String pathToImage;

    public User() {
    }

    public User(String username, String pathToImage, int level) {
        this.username = username;
        this.pathToImage = pathToImage;
        this.level = level;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPathToImage() {
        return pathToImage;
    }

    public void setPathToImage(String pathToImage) {
        this.pathToImage = pathToImage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

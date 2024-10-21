package lesson7.shop;

public class Komment {
    public static Komment komment;
    public static Komment comment;
    private User user;
    private int reiting;
    private String dostoinstva;
    private String nedostatki;
    private String comments;

    public Komment() {
    }

    public Komment(User user, String comments, String nedostatki, int reiting, String dostoinstva) {
        this.user = user;
        this.comments = comments;
        this.nedostatki = nedostatki;
        this.reiting = reiting;
        this.dostoinstva = dostoinstva;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getDostoinstva() {
        return dostoinstva;
    }

    public void setDostoinstva(String dostoinstva) {
        this.dostoinstva = dostoinstva;
    }

    public String getNedostatki() {
        return nedostatki;
    }

    public void setNedostatki(String nedostatki) {
        this.nedostatki = nedostatki;
    }

    public int getReiting() {
        return reiting;
    }

    public void setReiting(int reiting) {
        this.reiting = reiting;
    }
}

package fr.wildcodeschool.githubtracker.model;

public class Githuber {
    private String name;
    private String email;
    private String login;
    private static int id;
    private int idGithuber;
    private String avatarUrl;

    public Githuber(String name, String email, String login, String avatarUrl) {
        this.name = name;
        this.email = email;
        this.login = login;
        this.idGithuber = id++;
        this.avatarUrl = avatarUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getIdGithuber() {
        return idGithuber;
    }

    public void setIdGithuber(int idGithuber) {
        this.idGithuber = idGithuber;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}

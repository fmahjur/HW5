package entity;

import java.util.Date;

public class Article {
    private int id;
    private String title;
    private String brief;
    private String content;
    private Date createDate;
    private boolean isPublished;
    private User user;

    public Article(int id, String title, String brief, String content, Date createDate, boolean isPublished, User user) {
        this.id = id;
        this.title = title;
        this.brief = brief;
        this.content = content;
        this.createDate = createDate;
        this.isPublished = isPublished;
        this.user = user;
    }
}

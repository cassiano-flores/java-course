package enumeration.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//class Post for Exercise48
public class Post {

    //date format
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    //attributes
    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    //associations
    private List<Comment> comments = new ArrayList<>();
    
    public Post() {
    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    /*
    Comments doesnt have a setComments because we dont change the List Comment, only the comments by the addComment and removeComment
    
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
    */

    public void addComment(Comment comment){        //new comment in the List
        comments.add(comment);
    }

    public void removeComment(Comment comment){     //remove a comment in the List
        comments.remove(comment);
    }

    //testing StringBuilder, can be used when we have a long String, this is very useful in toString methods
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");                  //append function works like a sysout
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments:\n");

        for (int i=0; i<comments.size(); i++){

            sb.append(comments.get(i) + "\n");   //print every comment done (comment.toString())
        }
        return sb.toString();
    }

    /*
    toString without StringBuilder, its similar, but slower

    public String toString() {
        return title +
               "\n" + likes + " Likes - " + sdf.format(moment) +
               "\n" + content +
               "\nComments: \n" + 
               comments;
    }
    */
}
package enumeration.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import enumeration.entities.Comment;
import enumeration.entities.Post;

//practicing associations, this class is like a social media, write Posts with title, content, etc, and we have some Comments
public class Exercise48 {
    
    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  //a data format


        System.out.print("How many posts do you want to write? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){

            System.out.print("\nMoment: ");

            if (i==0){
                sc.nextLine();   //consumes break line just in the first case
            }   //we need to consume the break line whenever you have a sc.nextLine() and before a sc.nextInt()
                //the break line must be between these scanners

            Date moment = sdf.parse(sc.nextLine());

            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Content: ");
            String content = sc.nextLine();

            System.out.print("Likes: ");
            int likes = sc.nextInt();

            Post post = new Post(moment, title, content, likes);  //Post association

            //--------------------------------------------------------------

            System.out.print("\nHow many comments in this post? ");
            int m = sc.nextInt();
            sc.nextLine();   //consumes break line

            for (int j=0; j<m; j++){

                System.out.print("Comment #" + (j+1) + ": ");
                String text = sc.nextLine();

                Comment comment = new Comment(text);   //Comment association

                post.addComment(comment);    //add new comment in the List
            }

            System.out.println("\n-------------------------------------");
            System.out.println(post);
            //System.out.println(post + "\nComments: \n" + post.getComments());
            System.out.println("-------------------------------------");
        }

        sc.close();
    }
}
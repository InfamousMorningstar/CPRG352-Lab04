
package model;
import java.io.*;

/**
 *
 * author 827097
 * Created on : Feb 11, 2022
 */
public class Note {
    private String title;
    private String content;

    public Note() {
    }

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
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
    public String[] viewNote(String path) throws IOException {
        String[] endString = new String[2];
        
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        String nTitle = br.readLine();
        String nContent = br.readLine();
        String nextLine = br.readLine();
        
        while ((nextLine = br.readLine()) != null) {
            nContent += nextLine + "<br>";
        }
        
        endString[0] = nTitle;
        endString[1] = nContent;
            return endString;    
    }
    
    
    public void editNote(String path, String givenTitle, String givenContent) throws IOException {
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)))) {
            String writeToFile = givenTitle + givenContent;
            
            pw.write(writeToFile);
        }
    }
    
}

package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Note;


/**
 *
 * @author 827097
 */
public class NoteServlet extends HttpServlet {

    
       
    
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Note note = new Note();
        
        if(request.getParameter("edit") == null) {
            String path = getServletContext().getRealPath("/WEB-INF/note.txt");
            
            String[] fillNote = note.viewNote(path);
            
            request.setAttribute("nTitle", fillNote[0]);
            request.setAttribute("nContent", fillNote[1]);
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
            
            
            
        }
        else if (request.getParameter("edit").equals("")) {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nTitle = request.getParameter("nTitle");
        String nContent = request.getParameter("nContent");
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        Note note = new Note();
        
        if (nTitle == null || nTitle.equals("") || nContent == null || nContent.equals("")) {
            nTitle = "N/A";
            nContent = "N/A";
        }
       
        note.editNote(path, nTitle, nContent);
        
        String[] fillNote = note.viewNote(path);
        
        request.setAttribute("nTitle", fillNote[0]);
        request.setAttribute("nContent", fillNote[1]);
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        
    }

  
}

<%-- 
    Document   : editnote
    Created on : Feb 11, 2022, 1:25:41 PM
    Author     : 827097
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <header>
        <h1>Simple Note Keeper</h1>
        </header>
        
        <form method="post" action="note">
            <h3>Edit note</h3>
            <div>
                <label for="nTitle">Title:</label>
                <br>
                <input type ="text" name ="nTitle" id ="nTitle">
            </div>
            <br>
             <div>
                    <label for= "nContent">Contents:</label><br>
                    <textarea type="text" name = "nContent" id = "nContent" rows="4" cols="50"></textarea>
             </div>
            <br>
            
            <formbuttons>
                <button type="submit" name="submit" id="submit">Save</button>
            </formbuttons>
            <br>
            <br>
        </form>
        
        <footer>
            <a href="note.txt">View Note</a>
            
        </footer>
        
    </body>
</html>

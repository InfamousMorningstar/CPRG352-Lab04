<%-- 
    Document   : viewnote
    Created on : Feb 11, 2022, 1:25:28 PM
    Author     : 827097
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple note keeper</h1>
        <h3>View Note</h3>
    <nTitle><b>Title:</b><br> <titleFill>${nTitle}</titleFill></nTitle>
    <br>
    <br>
    <nContent><b>Content:</b> <br> <conFill>${nContent}</confill> </nContent>
    <br>
    
    <foorter>
        <a href ="note?edit">Edit note </a>
    </foorter>
            
    </body>
</html>

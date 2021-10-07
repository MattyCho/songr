# Songr

Created using Spring Initializr. Runs from localhost:8080.

## Routes
- `/` - root/home page - Fake Songr site name and lorem ipsum paragraph with basic css styling.
- `/hello` - page just prints out "Hello, World!"
- `/capitalize/{word}` - {word} can be any string. Prints to the page {word} in all capital letters.
- `/albums` - pulls and displays all album information from the database. The user can add their own album of choice 
to the database by using the form. The page will automatically update after submitting. Songs can also be added to 
each album.
- `/frank` - pulls up all the information on one album, Frank Sinatra's Come Fly with Me.

## Languages and Tools
Java, SpringMVC/Initializr, PostgreSQL/pgAdmin.
package com.library

class Book {
String title
String author
String isbn
Date dateBorrowed
Date returnDate
String student

String toString(){
"$title, $author, $isbn"
}

    static constraints = {
	title()
	author()
	isbn maxSize:13
	dateBorrowed()
	returnDate()
	student()
    }
}

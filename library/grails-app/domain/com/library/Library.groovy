package com.library

class Library {
String location
String openingHours



static hasMany=[students:Student, books:Book, librarians:Librarian]

String toString(){
"$location, $openingHours"
}
    static constraints = {
	location()
	openingHours()
	
	
    }
}

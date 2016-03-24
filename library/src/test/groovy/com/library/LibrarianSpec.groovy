package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Librarian)
class LibrarianSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
        when:"A Librarian has a name and an email"

def librarian=new Librarian(name: 'Anne',
		      email: 'Anne_R@hotmail.co.uk')

then:"the toString method will merge them."
librarian.toString()=='Anne, Anne_R@hotmail.co.uk'
    }
}

package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Library)
class LibrarySpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
        when: "A library has a location and openingHours"

	def library=new Library(location: 'Sheffield Hallam',
				openingHours: '24 hour')

then: "the toString method will merge them."

library.toString()=='Sheffield Hallam, 24 hour'
    }
}

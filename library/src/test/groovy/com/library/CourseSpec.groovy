package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Course)
class CourseSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
        when:"A Course has title, code and department"

def course=new Course(title: 'E-Business',
		      code: 'WSD102',
		      department: 'Computing')

then:"the to string method will merge them."
course.toString()=='E-Business, WSD102, Computing'
    }
}

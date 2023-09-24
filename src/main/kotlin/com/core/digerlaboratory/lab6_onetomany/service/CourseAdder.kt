package com.core.digerlaboratory.lab6_onetomany.service

import com.core.digerlaboratory.lab6_onetomany.domain.course.Course
import com.core.digerlaboratory.lab6_onetomany.domain.course.CourseRepository
import com.core.digerlaboratory.lab6_onetomany.domain.lecture.Lecture
import org.springframework.stereotype.Service

@Service
class CourseAdder(
    private val courseRepository: CourseRepository,
) {

    fun execute(lecture: Lecture): Course {
        val course = Course(
            lecture = lecture,
            name = "Course Name"
        )
        lecture.addCourses(course)
        return courseRepository.save(course)
    }
}
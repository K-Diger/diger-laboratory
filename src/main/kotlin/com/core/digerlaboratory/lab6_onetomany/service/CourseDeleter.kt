package com.core.digerlaboratory.lab6_onetomany.service

import com.core.digerlaboratory.lab6_onetomany.domain.course.Course
import com.core.digerlaboratory.lab6_onetomany.domain.course.CourseRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class CourseDeleter(
    private val courseRepository: CourseRepository,
) {

    fun execute(course: Course) {
        courseRepository.delete(course)
    }
}
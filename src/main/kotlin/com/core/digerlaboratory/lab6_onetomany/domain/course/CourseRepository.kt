package com.core.digerlaboratory.lab6_onetomany.domain.course

import com.core.digerlaboratory.lab6_onetomany.domain.course.Course
import org.springframework.data.jpa.repository.JpaRepository

interface CourseRepository : JpaRepository<Course, Long> {
}
package com.core.digerlaboratory.lab6_onetomany.domain.repository

import com.core.digerlaboratory.lab6_onetomany.domain.Course
import org.springframework.data.jpa.repository.JpaRepository

interface CourseRepository : JpaRepository<Course, Long> {
}
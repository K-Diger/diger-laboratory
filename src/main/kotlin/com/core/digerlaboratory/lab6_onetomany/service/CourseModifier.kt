package com.core.digerlaboratory.lab6_onetomany.service

import com.core.digerlaboratory.lab6_onetomany.domain.course.CourseRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class CourseModifier(
    private val courseRepository: CourseRepository,
) {

    fun execute() {
        courseRepository.findById(1L).get().editName("수정된 이름")
    }
}
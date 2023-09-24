package com.core.digerlaboratory.lab6_onetomany.service

import com.core.digerlaboratory.lab6_onetomany.domain.lecture.LectureRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class LectureModifier(
    private val lectureRepository: LectureRepository,
) {

    fun execute() {
        lectureRepository.findById(1L).get().editName("수정된 과목 이름")
    }
}
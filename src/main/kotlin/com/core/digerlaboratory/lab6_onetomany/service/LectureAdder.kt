package com.core.digerlaboratory.lab6_onetomany.service

import com.core.digerlaboratory.lab6_onetomany.domain.lecture.Lecture
import com.core.digerlaboratory.lab6_onetomany.domain.lecture.LectureRepository
import org.springframework.stereotype.Service

@Service
class LectureAdder(
    private val lectureRepository: LectureRepository,
) {

    fun execute() : Lecture {
        val newLecture = Lecture(name = "X")
        return lectureRepository.save(newLecture)
    }
}
package com.core.digerlaboratory.lab6_onetomany.service

import com.core.digerlaboratory.lab6_onetomany.domain.*
import com.core.digerlaboratory.lab6_onetomany.domain.repository.CourseRepository
import com.core.digerlaboratory.lab6_onetomany.domain.repository.LectureRepository
import com.core.digerlaboratory.lab6_onetomany.domain.repository.UserRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class Adder(
    private val userRepository: UserRepository,
    private val courseRepository: CourseRepository,
    private val lectureRepository: LectureRepository,
) {

    fun addLecture() {
        val newLecture = Lecture()
        lectureRepository.save(newLecture)
    }

    fun addUsersToCourse() {
        val newUser1 = User()
        val newUser2 = User()
        val newUser3 = User()
        val newUser4 = User()
        val newUser5 = User()

        val users = mutableListOf(newUser1, newUser2, newUser3, newUser4, newUser5)

        userRepository.saveAll(users)

        val newCourse = Course(
            name = "강의 1",
            lecture = lectureRepository.findByIdOrNull(1)!!,
            users = users
        )

        courseRepository.save(newCourse)
    }

}
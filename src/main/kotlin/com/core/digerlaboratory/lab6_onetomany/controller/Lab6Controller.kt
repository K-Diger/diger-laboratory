package com.core.digerlaboratory.lab6_onetomany.controller

import com.core.digerlaboratory.lab6_onetomany.domain.course.CourseRepository
import com.core.digerlaboratory.lab6_onetomany.service.*
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/lab6")
class Lab6Controller(
    private val lectureAdder: LectureAdder,
    private val userAdder: UserAdder,
    private val courseAdder: CourseAdder,

    private val lectureModifier: LectureModifier,
    private val userModifier: UserModifier,
    private val courseModifier: CourseModifier,


    private val courseDeleter: CourseDeleter,
    private val courseRepository: CourseRepository,
) {

    @GetMapping
    fun lab6() {
        val newUser = userAdder.execute()
        val newLecture = lectureAdder.execute()
        val newCourse = courseAdder.execute(newLecture)
        println("------------------ 유저, 과목, 강의 생성 완료 ------------------")

        lectureModifier.execute()
        println("-----------------------------------------------------------")
        userModifier.execute()
        println("-----------------------------------------------------------")
        courseModifier.execute()
        println("-----------------------------------------------------------")
    }

    @GetMapping("/deleteCourse")
    fun lab6Delete() {
        courseDeleter.execute(courseRepository.findById(1L).get())
    }
}
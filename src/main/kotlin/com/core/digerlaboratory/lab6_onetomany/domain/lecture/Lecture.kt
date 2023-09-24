package com.core.digerlaboratory.lab6_onetomany.domain.lecture

import com.core.digerlaboratory.lab6_onetomany.domain.course.Course
import jakarta.persistence.*

@Entity
class Lecture(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L,

    @Column
    var name: String,

    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    val courses: MutableList<Course> = mutableListOf(),
) {

    fun editName(newName: String) {
        this.name = newName
    }

    fun addCourses(course: Course) {
        this.courses.add(course)
    }
}
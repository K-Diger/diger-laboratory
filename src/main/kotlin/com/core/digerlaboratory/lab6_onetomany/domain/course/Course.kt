package com.core.digerlaboratory.lab6_onetomany.domain.course

import com.core.digerlaboratory.lab6_onetomany.domain.user.User
import com.core.digerlaboratory.lab6_onetomany.domain.lecture.Lecture
import jakarta.persistence.*

@Entity
class Course(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L,

    @Column
    var name: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lecture_id")
    val lecture: Lecture,

    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    val users: MutableList<User> = mutableListOf()
) {

    fun editName(newName: String) {
        this.name = newName
    }
}
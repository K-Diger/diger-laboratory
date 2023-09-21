package com.core.digerlaboratory.lab6_onetomany.domain

import jakarta.persistence.*

@Entity
class Lecture(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L,

    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    val courses: MutableList<Course> = mutableListOf(),
)
package com.core.digerlaboratory.lab6_onetomany.domain.user

import jakarta.persistence.*

@Entity
class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L,

    @Column
    var name: String,
) {

    fun editName(newName: String) {
        this.name = newName
    }
}
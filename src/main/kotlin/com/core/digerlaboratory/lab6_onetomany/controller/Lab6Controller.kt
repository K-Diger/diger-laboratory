package com.core.digerlaboratory.lab6_onetomany.controller

import com.core.digerlaboratory.lab6_onetomany.service.Adder
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/lab6")
class Lab6Controller(
    private val adder: Adder
) {

    @GetMapping
    fun lab6() {
        adder.addLecture()
        adder.addUsersToCourse()
    }
}
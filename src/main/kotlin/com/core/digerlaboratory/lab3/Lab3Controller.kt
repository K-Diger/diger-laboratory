package com.core.digerlaboratory.lab3

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/lab3")
class Lab3Controller(
    private val lab3Service: Lab3Service,
) {

    @GetMapping
    fun lab3(): String {
        lab3Service.useNaturalFor()
        lab3Service.useForEach()
        lab3Service.useRepeat()
        lab3Service.useMap()
        println("=== 비교 종료 ===")
        return ""
    }

}
package com.core.digerlaboratory.lab1_controller_private

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/lab1")
class TestController1 {

    @GetMapping
    private fun lab1(): String {
        return "실행이 되네?"
    }
}
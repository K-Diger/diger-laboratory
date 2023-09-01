package com.core.digerlaboratory.lab2

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/lab2")
class TestController2(
    private val labService2: LabService2,
) {

    @GetMapping
    fun lab2(): String {
        labService2.asyncMethod()
        return "비동기 메서드 호출 중...";
    }

}
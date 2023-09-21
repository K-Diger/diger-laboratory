package com.core.digerlaboratory.lab2_async_private

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/lab2")
class Lab2Controller(
    private val lab2Service: Lab2Service,
) {

    @GetMapping
    fun lab2(): String {
        repeat(10) {
            println("저는 컨트롤러에서 로깅되고 있어요 - ${it}")
        }
        lab2Service.asyncMethod()
        repeat(10) {
            println("저는 컨트롤러에서 비동기 메서드를 호출하고 로깅되고 있어요 - ${it}")
        }
        return "비동기 메서드 호출 중...";
    }

}
package com.core.digerlaboratory.lab2

import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service

@Service
class LabService2 {

    @Async
    @Throws(InterruptedException::class)
    internal fun asyncMethod() {
        println(addAsyncMethod())
        Thread.sleep(3000)
        println("비동기 메서드 완료")
    }

    private fun addAsyncMethod() {
        println("처리중 . . . . . . .")
    }
}
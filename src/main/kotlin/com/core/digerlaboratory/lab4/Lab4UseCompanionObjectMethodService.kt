package com.core.digerlaboratory.lab4

import org.springframework.stereotype.Service

@Service
class Lab4UseCompanionObjectMethodService {

    fun useCompanionObjectMethod() {
        companionMethod()
    }

    companion object {

        private const val VALUE = 100

        fun companionMethod() {
            println(VALUE)
        }
    }
}
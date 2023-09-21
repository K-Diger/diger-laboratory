package com.core.digerlaboratory.lab4_companion_object_vs_object

import org.springframework.stereotype.Service

@Service
class Lab4UseObjectMethodService {

    fun useObjectMethod() {
        RealObject.objectMethod()
    }

    object RealObject{
        private const val VALUE = 100

        fun objectMethod() {
            println("objectMethod - ${VALUE}")
        }
    }

}
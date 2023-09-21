package com.core.digerlaboratory.lab3_for_foreach_repeat_map

import org.springframework.stereotype.Service

@Service
class Lab3Service {

    private val count = 10000000
    private var targetCollection = MutableList(count) { it + 1 }
    private var tempCollection = MutableList(count) { it + 1 }
    private var startTime: Long = 0
    private var endTime: Long = 0

    fun useNaturalFor() {
        startLog("naturalFor")
        for (i: Int in 0..targetCollection.size) {
            tempCollection.add(i)
        }
        endLog("naturalFor")
        totalLog()
        reInitCollection()
    }

    fun useForEach() {
        startLog("for-each")
        for (i in targetCollection) {
            tempCollection.add(i)
        }
        endLog("for-each")
        totalLog()
        reInitCollection()
    }

    fun useRepeat() {
        startLog("repeat")
        repeat(targetCollection.size) {
            tempCollection.add(it)
        }
        endLog("repeat")
        totalLog()
        reInitCollection()
    }

    fun useMap() {
        startLog("map")
        targetCollection.map { tempCollection.add(it) }
        endLog("map")
        totalLog()
        reInitCollection()
    }

    private fun reInitCollection() {
        this.tempCollection = MutableList(count) { it + 1 }
    }

    private fun startLog(methodName: String) {
        startTime = System.currentTimeMillis()
        println("$methodName startTime = $startTime mills")
    }

    private fun endLog(methodName: String) {
        endTime = System.currentTimeMillis()
        println("$methodName end = $endTime mills")
    }

    private fun totalLog() {
        println("실행 시간 : ${endTime - startTime} mills\n-------------------------------------")
        startTime = 0
        endTime = 0
    }

}
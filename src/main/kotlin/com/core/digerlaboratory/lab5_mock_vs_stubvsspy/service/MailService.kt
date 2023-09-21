package com.core.digerlaboratory.lab5_mock_vs_stubvsspy.service


interface MailService {
    fun send(message: String)
}

class MailServiceImpl : MailService {

    private val messages = mutableListOf<String>()
    override fun send(message: String) {
        messages.add(message)
    }

    fun numberSent(): Int {
        return messages.size
    }
}
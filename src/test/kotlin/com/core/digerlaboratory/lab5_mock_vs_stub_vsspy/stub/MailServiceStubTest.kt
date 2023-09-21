package com.core.digerlaboratory.lab5_mock_vs_stub_vsspy.stub

import com.core.digerlaboratory.lab5_mock_vs_stubvsspy.Order
import com.core.digerlaboratory.lab5_mock_vs_stubvsspy.service.MailServiceImpl
import org.junit.jupiter.api.Test

class MailServiceStubTest {

    @Test
    fun testMailServiceSend() {
        val order = Order("STUB", 51)

        val mailer = MailServiceImpl()

        order
    }
}
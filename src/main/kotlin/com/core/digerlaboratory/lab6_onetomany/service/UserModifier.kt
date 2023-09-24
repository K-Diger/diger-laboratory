package com.core.digerlaboratory.lab6_onetomany.service

import com.core.digerlaboratory.lab6_onetomany.domain.user.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class UserModifier(
    private val userRepository: UserRepository,
) {

    fun execute() {
        userRepository.findById(1L).get().editName("수정된 유저 이름")
    }
}
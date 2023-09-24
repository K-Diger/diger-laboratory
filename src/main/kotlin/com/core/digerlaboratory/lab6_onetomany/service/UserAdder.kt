package com.core.digerlaboratory.lab6_onetomany.service

import com.core.digerlaboratory.lab6_onetomany.domain.user.User
import com.core.digerlaboratory.lab6_onetomany.domain.user.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class UserAdder(
    private val userRepository: UserRepository,
) {

    fun execute(): User {
        return userRepository.save(User(name = "X"))
    }
}
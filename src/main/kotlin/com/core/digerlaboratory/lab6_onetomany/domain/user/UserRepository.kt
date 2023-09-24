package com.core.digerlaboratory.lab6_onetomany.domain.user

import com.core.digerlaboratory.lab6_onetomany.domain.user.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
}
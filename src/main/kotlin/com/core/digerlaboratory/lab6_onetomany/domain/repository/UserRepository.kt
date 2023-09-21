package com.core.digerlaboratory.lab6_onetomany.domain.repository

import com.core.digerlaboratory.lab6_onetomany.domain.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
}
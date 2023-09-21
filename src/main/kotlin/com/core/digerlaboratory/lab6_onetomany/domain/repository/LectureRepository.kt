package com.core.digerlaboratory.lab6_onetomany.domain.repository

import com.core.digerlaboratory.lab6_onetomany.domain.Lecture
import org.springframework.data.jpa.repository.JpaRepository

interface LectureRepository : JpaRepository<Lecture, Long> {
}
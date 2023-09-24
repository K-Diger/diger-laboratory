package com.core.digerlaboratory.lab6_onetomany.domain.lecture

import com.core.digerlaboratory.lab6_onetomany.domain.lecture.Lecture
import org.springframework.data.jpa.repository.JpaRepository

interface LectureRepository : JpaRepository<Lecture, Long> {
}
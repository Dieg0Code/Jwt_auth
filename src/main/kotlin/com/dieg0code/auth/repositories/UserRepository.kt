package com.dieg0code.auth.repositories

import com.dieg0code.auth.models.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Int> {
}
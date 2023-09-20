package com.eigframework.details

import com.eigframework.abs.CommunDetails
import com.eigframework.enums.Gender
import com.eigframework.enums.PersonType
import java.time.LocalDate
import java.util.*

class PersonDetails(
    id: UUID = UUID.randomUUID(),
    val username: String,
    val email: String,
    val password: String,
    val phone: String,
    val birthday: LocalDate,
    val gender: Gender = Gender.NONE,
    val personType: PersonType = PersonType.USER,
    createdAt: LocalDate = LocalDate.now(),
    updatedAt: LocalDate = LocalDate.now(),
    deletedAt: LocalDate,
    createdBy: UUID,
    updatedBy: UUID,
    deletedBy: UUID,
) : CommunDetails(id, createdAt, updatedAt, deletedAt, createdBy, updatedBy, deletedBy) {
}
package com.eigframework.core.details

import com.eigframework.core.abs.CommunDetails
import java.time.LocalDate
import java.util.*

class PersonNamesDetails (
    id: UUID = UUID.randomUUID(),
    val firstname: String,
    val lastname: String,
    val fullname: String,
    val personDetails: PersonDetails,
    createdAt: LocalDate = LocalDate.now(),
    updatedAt: LocalDate = LocalDate.now(),
    deletedAt: LocalDate,
    createdBy: UUID,
    updatedBy: UUID,
    deletedBy: UUID,
) : CommunDetails(id, createdAt, updatedAt, deletedAt, createdBy, updatedBy, deletedBy)  {

    override fun equals(other: Any?): Boolean = if(other is PersonNamesDetails) firstname == other.firstname else false

    override fun hashCode(): Int = 31 * super.hashCode() + firstname.hashCode()

    override fun toString(): String = toString("person=$personDetails,firstname=$firstname,lastname=$lastname,fullname=$fullname")

}
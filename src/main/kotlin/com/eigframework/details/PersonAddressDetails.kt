package com.eigframework.details

import com.eigframework.abs.CommunDetails
import com.eigframework.enums.Address
import java.time.LocalDate
import java.util.*

class PersonAddressDetails (
    id: UUID = UUID.randomUUID(),
    val portNumber: String,
    val state: String,
    val city: String,
    val address: Address,
    val personDetails: PersonDetails,
    createdAt: LocalDate = LocalDate.now(),
    updatedAt: LocalDate = LocalDate.now(),
    deletedAt: LocalDate,
    createdBy: UUID,
    updatedBy: UUID,
    deletedBy: UUID,
) : CommunDetails(id, createdAt, updatedAt, deletedAt, createdBy, updatedBy, deletedBy)  {

    override fun equals(other: Any?): Boolean = if(other is PersonAddressDetails) id == other.id else false

    override fun hashCode(): Int = 31 * super.hashCode() + id.hashCode()

    override fun toString(): String = toString("person=$personDetails,portNumber=$portNumber,state=$state,city=$city,address=$address")

}
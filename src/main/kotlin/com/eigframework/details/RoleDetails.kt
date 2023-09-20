package com.eigframework.details

import com.eigframework.abs.CommunDetails
import java.time.LocalDate
import java.util.UUID

class RoleDetails(
    id: UUID = UUID.randomUUID(),
    val name: String,
    val description: String,
    val group: String,
    createdAt: LocalDate = LocalDate.now(),
    updatedAt: LocalDate = LocalDate.now(),
    deletedAt: LocalDate,
    createdBy: UUID,
    updatedBy: UUID,
    deletedBy: UUID,
) : CommunDetails(id, createdAt, updatedAt, deletedAt, createdBy, updatedBy, deletedBy)  {

    override fun equals(other: Any?): Boolean = if(other is RoleDetails) name == other.name else false

    override fun hashCode(): Int = 31 * super.hashCode() + name.hashCode()

    override fun toString(): String = toString("name=$name,description=$description,group=$group")

}
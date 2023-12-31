package com.eigframework.core.abs

import java.time.LocalDateTime
import java.util.UUID

abstract class CommunDetails(
    val id: UUID? = UUID.randomUUID(),
    val createdAt: LocalDateTime? = LocalDateTime.now(),
    val updatedAt: LocalDateTime? = LocalDateTime.now(),
    val deletedAt: LocalDateTime?,
    val createdBy: UUID?,
    val updatedBy: UUID?,
    val deletedBy: UUID?,
    ) {

    override fun equals(other: Any?): Boolean = if(other is CommunDetails) id == other.id else false

    override fun hashCode(): Int = id.hashCode()

    override fun toString(): String = toString("")

    private fun classToString(text: String): String = "${javaClass.name}[$text]";

    protected fun toString(text: String) = classToString("id=$id,$text,createdAt=$createdAt,updatedAt=$updatedAt,deletedAt=$deletedAt,createdBy=$createdBy,updatedBy=$updatedBy,deletedBy=$deletedBy")

}
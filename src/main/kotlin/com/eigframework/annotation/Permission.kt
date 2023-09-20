package com.eigframework.annotation

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
annotation class Permission(val value: String) {
}
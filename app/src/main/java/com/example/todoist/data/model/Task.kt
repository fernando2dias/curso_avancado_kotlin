package com.example.todoist.data.model

data class Task(
    val id: Long,
    val content: String,
    val completed: Boolean,
    val created: String
)

package com.example.todoist.data.model

import com.google.gson.annotations.SerializedName

data class UpsertTaskBody(
    val content: String,
    @SerializedName("section_id")
    val sectionId: Long,
    @SerializedName("due_string")
    val dueString: String?
)

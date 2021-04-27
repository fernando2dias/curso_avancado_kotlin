package com.example.todoist.presentation.scene.main

import androidx.lifecycle.ViewModel
import com.example.todoist.data.repository.TodoistRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val todoistRepository: TodoistRepository
) : ViewModel() {


}
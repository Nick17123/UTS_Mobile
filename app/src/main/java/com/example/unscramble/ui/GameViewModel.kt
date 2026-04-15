package com.example.unscramble.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

// membuat class GameViewMode didalam package Ui dengan ekstensi compose.
class GameViewModel: ViewModel() {
    //menambahkan variabel uiState dengan tipe MutableStateFlow<GameUiState>
    private val _uiState = MutableStateFlow(GameUiState())
}
package com.example.unscramble.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

// membuat class GameViewMode didalam package Ui dengan ekstensi compose.
class GameViewModel: ViewModel() {
    // menambahkan variabel uiState dengan tipe MutableStateFlow<GameUiState>
    // merupakan backing property umtuk menghindari update dari classes lain
    private val _uiState = MutableStateFlow(GameUiState())
    // membuat variabel uiState dengan tipe StateFlow<GameUiState>
    val uiState : StateFlow<GameUiState>

}
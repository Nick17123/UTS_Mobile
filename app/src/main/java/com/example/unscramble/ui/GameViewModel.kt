package com.example.unscramble.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import com.example.unscramble.data.allWords

// membuat class GameViewMode didalam package Ui dengan ekstensi compose.
class GameViewModel: ViewModel() {
    // menambahkan variabel uiState dengan tipe MutableStateFlow<GameUiState>
    // merupakan backing property umtuk menghindari update dari classes lain
    private val _uiState = MutableStateFlow(GameUiState())
    // membuat variabel uiState dengan tipe StateFlow<GameUiState>
    //val uiState : StateFlow<GameUiState>
    // mengakses backing property _uiState menggunakan fungsi asStateFlow() untuk mendapatkan StateFlow yang immutable (read-only).
    val uiState : StateFlow<GameUiState> = _uiState.asStateFlow()

    // menambahkan variabel currentWord dengan tipe String untuk menyimpan kata saat ini.
    private lateinit var currentWord: String

    // menambahkan methode pickRandomWordAndShuffle() untuk memilih kata secara acak dari daftar kata yang ada
    // dalam variabel allWords. Kemudian mengacak kata tersebut menggunakan fungsi shuffleCurrentWord().
    private fun pickRandomWordAndShuffle(): String {
        // memilih kata secara acak dari daftar kata yang ada dalam variabel allWords.
        currentWord = allWords.random()
        if (usedWords.contains(currentWord)) {
            return pickRandomWordAndShuffle()
        } else {
            usedWords.add(currentWord)
            return shuffleCurrentWord(currentWord)
        }
    }

}
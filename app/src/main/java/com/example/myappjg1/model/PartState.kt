package com.example.myappjg1.model

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateMap
import com.example.myappjg1.R

@Composable
fun rememberPartVisibilityState(): SnapshotStateMap<String, Boolean> {
    return remember {
        mutableStateMapOf(
            "arms" to true,
            "ears" to false,
            "eyebrows" to true,
            "eyes" to true,
            "glasses" to true,
            "hat" to true,
            "mouth" to false,
            "mustache" to false,
            "nose" to true,
            "shoes" to true
        )
    }
}

val imageResMap = mapOf(
    "arms" to R.drawable.arms,
    "ears" to R.drawable.ears,
    "eyebrows" to R.drawable.eyebrows,
    "eyes" to R.drawable.eyes,
    "glasses" to R.drawable.glasses,
    "hat" to R.drawable.hat,
    "mouth" to R.drawable.mouth,
    "mustache" to R.drawable.mustache,
    "nose" to R.drawable.nose,
    "shoes" to R.drawable.shoes
)

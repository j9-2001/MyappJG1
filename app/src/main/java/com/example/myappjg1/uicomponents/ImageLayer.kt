package com.example.myappjg1.uicomponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.snapshots.SnapshotStateMap
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.myappjg1.R
import com.example.myappjg1.model.imageResMap

@Composable
fun ImageLayer(parts: SnapshotStateMap<String, Boolean>) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.body),
            contentDescription = "body"
        )
        parts.forEach { (key, isVisible) ->
            if (isVisible) {
                imageResMap[key]?.let { resId ->
                    Image(
                        painter = painterResource(id = resId),
                        contentDescription = key
                    )
                }
            }
        }
    }
}
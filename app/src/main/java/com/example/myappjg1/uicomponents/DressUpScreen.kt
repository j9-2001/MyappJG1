package com.example.myappjg1

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.example.dressup.ui.PartCheckboxList
import com.example.myappjg1.model.rememberPartVisibilityState
import com.example.myappjg1.uicomponents.ImageLayer

@Composable
fun DressUpScreen() {
    val orientation = LocalConfiguration.current.orientation
    val isPortrait = orientation == Configuration.ORIENTATION_PORTRAIT
    val parts = rememberPartVisibilityState()

    if (isPortrait) {
        Column(modifier = Modifier.fillMaxSize()) {
            Text(
                text = "202010658 이종구",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                style = MaterialTheme.typography.titleLarge
            )
            Box(modifier = Modifier.weight(1f).fillMaxWidth()) {
                ImageLayer(parts = parts)
            }
            PartCheckboxList(parts = parts, isPortrait = true)
        }
    } else {
        Row(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text(
                    text = "202010658 이종구",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    style = MaterialTheme.typography.titleLarge
                )
                ImageLayer(parts = parts)
            }
            Column(modifier = Modifier.weight(1f).fillMaxHeight()) {
                PartCheckboxList(parts = parts, isPortrait = false)
            }
        }
    }
}
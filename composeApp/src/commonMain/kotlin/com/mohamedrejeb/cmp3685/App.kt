package com.mohamedrejeb.cmp3685

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mohamedrejeb.cmp3685.theme.AppTheme

@Composable
internal fun App(
    systemAppearance: (isLight: Boolean) -> Unit = {}
) = AppTheme(systemAppearance) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Button(
            onClick = {}
        ) {
            Text("Button")
        }
    }
}
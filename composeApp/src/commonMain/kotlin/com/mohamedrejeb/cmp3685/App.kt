package com.mohamedrejeb.cmp3685

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.mohamedrejeb.cmp3685.theme.AppTheme

@Composable
internal fun App(
    systemAppearance: (isLight: Boolean) -> Unit = {}
) = AppTheme(systemAppearance) {
    var switch by remember {
        mutableStateOf(false)
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row {
            Button(
                onClick = {}
            ) {
                Text("Button")
            }

            Switch(
                checked = switch,
                onCheckedChange = { switch = it }
            )
        }
    }
}
package com.example.coinsphere.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = AccentBlue,
    background = Background,
    surface = Surface,
    onPrimary = TextMain,
    onBackground = TextMain,
    onSurface = TextMain,
    secondary = TextDim
)

private val LightColorScheme = lightColorScheme(
    primary = AccentBlue,
    background = Background, // mantenemos mismo esquema
    surface = Surface,
    onPrimary = TextMain,
    onBackground = TextMain,
    onSurface = TextMain,
    secondary = TextDim
)

@Composable
fun CoinSphereTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

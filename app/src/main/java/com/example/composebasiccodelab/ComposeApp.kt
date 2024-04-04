package com.example.composebasiccodelab

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.example.composebasiccodelab.ui.theme.ComposeBasicCodelabTheme

@Composable
fun ComposeApp(modifier: Modifier = Modifier) {

    var shouldShowOnboarding by rememberSaveable { mutableStateOf(true) }

    Surface(modifier) {
        if (shouldShowOnboarding) {
            OnboardingScreen(onContinueClicked = { shouldShowOnboarding = false })
        } else {
            GreetingsList()
        }
    }
}

@PreviewLightDark
@Composable
fun ComposeAppPreview() {
    ComposeBasicCodelabTheme {
        ComposeApp(Modifier.fillMaxSize())
    }
}

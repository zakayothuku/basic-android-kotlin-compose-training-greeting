package com.example.composebasiccodelab

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.example.composebasiccodelab.ui.theme.ComposeBasicCodelabTheme

@Composable
fun GreetingCard(name: String, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.padding(vertical = 4.dp, horizontal = 8.dp),
        colors = CardDefaults.cardColors(
            contentColor = MaterialTheme.colorScheme.background,
            containerColor = MaterialTheme.colorScheme.primary
        )
    ) {
        GreetingContent(name = name)
    }
}

@Composable
@PreviewLightDark
fun GreetingCardPreview() {
    ComposeBasicCodelabTheme {
        GreetingCard(name = "World")
    }
}
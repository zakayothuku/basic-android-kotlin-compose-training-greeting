package com.example.composebasiccodelab

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.example.composebasiccodelab.ui.theme.ComposeBasicCodelabTheme

@Composable
fun GreetingsList(
    modifier: Modifier = Modifier,
    names: List<String> = List(1000) { "$it" }
) {
    LazyColumn(modifier = modifier.padding(vertical = 8.dp)) {
        items(items = names) { name ->
            GreetingCard(name = name)
        }
    }
}

@Composable
@PreviewLightDark
fun GreetingsPreview() {
    ComposeBasicCodelabTheme {
        GreetingsList()
    }
}

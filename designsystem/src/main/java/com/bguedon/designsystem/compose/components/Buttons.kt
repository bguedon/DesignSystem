package com.bguedon.designsystem.compose.components

import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bguedon.devtest.ui.theme.DevTestTheme
import com.bguedon.devtest.ui.theme.borderStroke


@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    content: @Composable RowScope.() -> Unit,
) {
    Button(modifier = modifier,
        onClick = onClick) {
        content()
    }
}

@Composable
fun SecondaryButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    content: @Composable RowScope.() -> Unit,
) {
    OutlinedButton(
        modifier = modifier,
        border = BorderStroke(1.dp, MaterialTheme.colors.borderStroke),
        colors = ButtonDefaults.outlinedButtonColors(backgroundColor = MaterialTheme.colors.secondary,
            contentColor = MaterialTheme.colors.onSecondary),
        onClick = onClick) {
        content()
    }
}

@Preview(name = "Light")
@Preview(name = "Dark", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun previewButtons() {
    DevTestTheme {
        Surface {
            Column(Modifier.padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround) {
                PrimaryButton(modifier = Modifier.fillMaxWidth()) {
                    Text(text = "Primary")
                }
                SecondaryButton(modifier = Modifier.fillMaxWidth()) {
                    Text(text = "Secondary")
                }
            }
        }
    }
}
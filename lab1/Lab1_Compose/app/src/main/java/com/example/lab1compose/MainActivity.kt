package com.example.lab1compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab1compose.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab1ComposeTheme {
                Scaffold { padding ->
                    MainScreen(Modifier.padding(bottom = padding.calculateBottomPadding()))
                }
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    var email by remember { mutableStateOf("") }

    Column(modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            stringResource(R.string.title_text),
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .fillMaxWidth()
                .background(StatusBarColor)
                .statusBarsPadding()
                .background(TitleBackgroundColor)
                .padding(16.dp)
        )

        Image(
            painterResource(R.drawable.img),
            contentDescription = null,
            modifier = Modifier.padding(bottom = 25.dp).size(175.dp)
        )

        ButtonRow()
        Spacer(Modifier.height(30.dp))
        ButtonRow()

        Row(Modifier.padding(top = 35.dp), verticalAlignment = Alignment.CenterVertically) {
            Text(
                stringResource(R.string.email_label),
                color = EmailTextColor,
                fontSize = 13.sp,
                modifier = Modifier.weight(0.3f).padding(start = 15.dp)
            )
            TextField(
                value = email,
                onValueChange = { email = it },
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = EditTextIndicatorColor,
                    unfocusedIndicatorColor = EditTextIndicatorColor,
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent
                ),
                modifier = Modifier.weight(0.7f).padding(end = 85.dp)
            )
        }
    }
}

@Composable
fun ButtonRow() {
    Row(Modifier.fillMaxWidth()) {
        Box(Modifier.weight(1f), contentAlignment = Alignment.Center) {
            GreyButton(stringResource(R.string.button_text))
        }
        Box(Modifier.weight(1f), contentAlignment = Alignment.Center) {
            GreyButton(stringResource(R.string.button_text))
        }
    }
}

@Composable
fun GreyButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = GreyButtonColor,
            contentColor = Color.Black
        ),
        shape = RectangleShape,
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(text)
    }
}

@Preview(showSystemUi = true)
@Composable
fun MainPreview() {
    Lab1ComposeTheme { MainScreen() }
}
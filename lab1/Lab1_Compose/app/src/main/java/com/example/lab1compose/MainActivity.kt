package com.example.lab1compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import com.example.lab1compose.ui.theme.EditTextIndicatorColor
import com.example.lab1compose.ui.theme.EmailTextColor
import com.example.lab1compose.ui.theme.GreyButtonColor
import com.example.lab1compose.ui.theme.Lab1ComposeTheme
import com.example.lab1compose.ui.theme.StatusBarColor
import com.example.lab1compose.ui.theme.TitleBackgroundColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab1ComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(
                        modifier = Modifier.padding(bottom = innerPadding.calculateBottomPadding())
                    )
                }
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    var emailText by remember { mutableStateOf("") }

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.title_text),
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .background(StatusBarColor)
                .statusBarsPadding()
                .background(TitleBackgroundColor)
                .padding(16.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = null,
            modifier = Modifier
                .padding(bottom = 25.dp)
                .size(175.dp)
        )

        Row(modifier = Modifier.fillMaxWidth()){
            Box(
                modifier = Modifier.weight(1f),
                contentAlignment = Alignment.Center
            ){
                GreyButton(text = stringResource(id = R.string.button_text))
            }

            Box(
                modifier = Modifier.weight(1f),
                contentAlignment = Alignment.Center
            ){
                GreyButton(text = stringResource(id = R.string.button_text))
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        Row(modifier = Modifier.fillMaxWidth()){
            Box(
                modifier = Modifier.weight(1f),
                contentAlignment = Alignment.Center
            ){
                GreyButton(text = stringResource(id = R.string.button_text))
            }

            Box(
                modifier = Modifier.weight(1f),
                contentAlignment = Alignment.Center
            ){
                GreyButton(text = stringResource(id = R.string.button_text))
            }
        }
        
        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 35.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                text = stringResource(id = R.string.email_label),
                fontSize = 13.sp,
                color = EmailTextColor,
                modifier = Modifier.weight(0.3f).padding(start = 15.dp)
            )

            TextField(
                value = emailText,
                onValueChange = { emailText = it },
                modifier = Modifier
                    .weight(0.7f)
                    .padding(end = 85.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                singleLine = true,
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = EditTextIndicatorColor,
                    unfocusedIndicatorColor = EditTextIndicatorColor,
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent
                )
            )
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainPreview() {
    Lab1ComposeTheme {
        MainScreen()
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
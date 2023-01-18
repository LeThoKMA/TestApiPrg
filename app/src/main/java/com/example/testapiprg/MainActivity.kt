package com.example.testapiprg

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.testapiprg.data.model.RegisterRequest
import com.example.testapiprg.ui.theme.TestApiPrgTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            DefaultPreview()
        }

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
   var myViewModel : RegisterViewModel = viewModel()
    var name by remember {mutableStateOf("") }
    var email by remember{ mutableStateOf("") }
    var pass by remember {
        mutableStateOf("")
    }

    Scaffold(topBar = {
        TopAppBar(
            title = {
                Text(
                    text = "Đăng ký",
                    color = Color.White,
                    modifier = Modifier.padding(end = 4.dp)
                )

            },
            navigationIcon = {
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Filled.Menu,
                        contentDescription = "Menu Btn",
                        tint = Color.White
                    )
                }
            },

            backgroundColor = Color(0xFFEE4D2D),
            contentColor = Color.Gray,
            elevation = 2.dp

        )}
    ) {
Column() {
    TextField(value = name , onValueChange ={name = it})
    TextField(value = email , onValueChange ={email = it})
    TextField(value = pass , onValueChange ={pass = it})
    Button(onClick = {
        myViewModel.withFlow()
//        myViewModel.register(request = RegisterRequest("",email,name,pass,""))
    })
    {
        Text(text = "Register")
    }
}
    }



}
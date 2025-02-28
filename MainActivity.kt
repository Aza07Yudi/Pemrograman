package com.example.theapps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.theapps.ui.theme.Purple40
import com.example.theapps.ui.theme.TheappsTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.sp
import java.nio.file.WatchEvent
import java.time.format.TextStyle


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TheappsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        log = "Sign In",
                        us = "Username",
                        pas = "Password",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Sign(content: @Composable () -> Unit){
    MaterialTheme{
        Surface {
            content()
        }
    }
}

@Composable
fun Greeting(name: String, log: String, us: String, pas: String, modifier: Modifier = Modifier) {
    var text1 by remember { mutableStateOf("") }
    var text2 by remember { mutableStateOf("") }
    Column  (
        //Di isi dengan fungsi-fungsi tipografi
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 20.dp)

    )
    {
        Text(
            text = log,
            style = MaterialTheme.typography.displaySmall,
            modifier = modifier
        )



        Text(
            text = us,
            color = Purple40,
            style = MaterialTheme.typography.titleMedium,
            modifier = modifier
        )

        Spacer(modifier = Modifier.height(16.dp)) //Spasi

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .border(0.dp, Color.Transparent)
                .padding(0.dp)
        ){
            if (text1.isEmpty()){
                Text(
                    text = "Username",
                    style = androidx.compose.ui.text.TextStyle(color = Color.Gray, fontSize = 16.sp)
                )
            }

            BasicTextField(
                value = text1,
                onValueChange = {text1 = it},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp),
                textStyle = androidx.compose.ui.text.TextStyle(color = Color.Black, fontSize = 16.sp)
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(2.dp)
                .background(Color(0xFF6200EE))
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = pas,
            color = Purple40,
            style = MaterialTheme.typography.titleMedium,
            modifier = modifier
        )

        Spacer(modifier = Modifier.height(16.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .border(0.dp, Color.Transparent) // border transparan
                .padding(0.dp) // padding box-nya
        ){
            if (text2.isEmpty()){
                Text(
                    text = "Password",
                    style = androidx.compose.ui.text.TextStyle(color = Color.Gray, fontSize = 16.sp)
                )
            }

            BasicTextField(
                value = text2,
                onValueChange = {text2 = it},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp),
                textStyle = androidx.compose.ui.text.TextStyle(color = Color.Black, fontSize = 16.sp)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(2.dp) // untuk tebal atau tinggi garis
                .background(Color(0xFF6200EE)) // untuk warna garis
        )



        Spacer(modifier = Modifier.height(4.dp))

        Button(onClick = {},
            modifier = Modifier.fillMaxWidth(),
            shape = RectangleShape
        ) {
            Text(text = "Login")

        }

    }

}

        /*TextField(
            value = text1,
            onValueChange = {text1 = it},
            placeholder = {Text("Username")},
            modifier = Modifier.fillMaxWidth().padding(0.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent
            ),
            shape = MaterialTheme.shapes.small

        )*/

        /*TextField(
            value = text2,
            onValueChange = {text2 = it},
            placeholder = {Text("Password")},
            modifier = Modifier.fillMaxWidth().padding(0.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent
            ),
            shape = MaterialTheme.shapes.small

        )*/



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TheappsTheme {
        Greeting("Androidxxxx","x","x","x")
    }
}
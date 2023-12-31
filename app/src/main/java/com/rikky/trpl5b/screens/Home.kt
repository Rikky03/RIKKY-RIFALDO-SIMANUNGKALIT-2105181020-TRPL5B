package  com.rikky.trpl5b.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.*
import androidx.navigation.NavHostController
import com.rikky.trpl5b.Routes

@Composable
fun Home(navController: NavHostController) {

    //Create a basic counter to display on screen
    var counter by remember {
        mutableStateOf(0)
    }
    val gradientBrush = Brush.verticalGradient(
        colors = listOf(Color(0xFFECF3D5), Color(0xFFA4B891)),
        startY = 0f,
        endY = 1000f
    )
    //Box composable to center Items
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = gradientBrush),
        contentAlignment = Alignment.TopCenter
    ) { //navbar start
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(0xFF262B26))
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home",
                tint = Color(0xFFF7FFE5),
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .size(25.dp)
            )
            Text(
                text = "Home",
                color = Color(0xFFF7FFE5),
                fontSize = 20.sp,
                fontFamily = FontFamily.Default
            )
        } //navbar end

        //A Column composable
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = "Home, Counter is $counter", color = Color.Black)

            Spacer(modifier = Modifier.height(20.dp))
            //Add a row composable to arrange the buttons horizontally
                Row {
                //Add a button to increment the counter
                Button(
                    onClick = { counter++ },
                    content = { Text("Tambah Angka", color = Color(0xFFF7FFE5)) },
                    modifier = Modifier
                        .padding(horizontal = 15.dp, vertical = 5.dp)
                        .background(
                            color = Color(0xFF657561),
                            shape = RoundedCornerShape(3.dp)
                        )
                        .height(40.dp)
                        .width(200.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFF657561)),
                    elevation = ButtonDefaults.elevatedButtonElevation(
                        defaultElevation = 0.dp,
                        pressedElevation = 4.dp
                    )
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {navController.navigate(Routes.Profile.route)},
                content = { Text("Profil", color = Color(0xFFF7FFE5)) },
                modifier = Modifier
                    .padding(horizontal = 15.dp, vertical = 5.dp)
                    .background(
                        color = Color(0xFF657561),
                        shape = RoundedCornerShape(3.dp)
                    )
                    .height(40.dp)
                    .width(200.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFF657561)),
                elevation = ButtonDefaults.elevatedButtonElevation(
                    defaultElevation = 0.dp,
                    pressedElevation = 4.dp
                )
            )

            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {navController.navigate(Routes.Setting.route + "/$counter")},
                content = { Text("Setting", color = Color(0xFFF7FFE5)) },
                modifier = Modifier
                    .padding(horizontal = 15.dp, vertical = 5.dp)
                    .background(
                        color = Color(0xFF657561),
                        shape = RoundedCornerShape(3.dp)
                    )
                    .height(40.dp)
                    .width(200.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFF657561)),
                elevation = ButtonDefaults.elevatedButtonElevation(
                    defaultElevation = 0.dp,
                    pressedElevation = 4.dp
                )
            )

        }

    }
}
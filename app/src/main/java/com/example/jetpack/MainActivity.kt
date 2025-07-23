package com.example.jetpack

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.util.Patterns
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack.ui.theme.JetpackTheme
import com.example.jetpack.ui.theme.ProductList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    WelcomeMessage(
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                    AddTwoNumber(
//                        10, 20,
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                    Sum()
//                    ModernLoginScreen()
//                    SignUpScreen()
//                    profileCard()
//                    login()
//                    ProductCard()
                    ProductList()
                }
            }
        }
    }
}

//@Composable
//fun WelcomeMessage(modifier: Modifier) {
//    Text(
//        text = "Hello kotlin",
//        modifier = modifier
//    )
//}
//
//@Composable
//fun AddTwoNumber(a: Int, b: Int, modifier: Modifier = Modifier) {
//    val sum = a + b
//    Text(
//        text = "Sum of $a and $b is $sum",
//        modifier = Modifier
//    )
//}
//
//@Composable
//fun Sum() {
//    val a = remember { mutableStateOf("") }
//    val b = remember { mutableStateOf("") }
//    val result = remember { mutableStateOf<Int?>(null) }
//
//    val errorA = remember { mutableStateOf("") }
//    val errorB = remember { mutableStateOf("") }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        // First TextField
//        TextField(
//            value = a.value,
//            onValueChange = {
//                a.value = it
//                // Clear error while typing
//                errorA.value = ""
//            },
//            label = { Text("Enter first number") },
//            keyboardOptions = KeyboardOptions.Default.copy(
//                keyboardType = KeyboardType.Number
//            ),
//            isError = errorA.value.isNotEmpty()
//        )
//        if (errorA.value.isNotEmpty()) {
//            Text(
//                text = errorA.value,
//                color = MaterialTheme.colorScheme.error,
//                style = MaterialTheme.typography.bodySmall
//            )
//        }
//
//        // Second TextField
//        TextField(
//            value = b.value,
//            onValueChange = {
//                b.value = it
//                // Clear error while typing
//                errorB.value = ""
//            },
//            label = { Text("Enter second number") },
//            keyboardOptions = KeyboardOptions.Default.copy(
//                keyboardType = KeyboardType.Number
//            ),
//            isError = errorB.value.isNotEmpty()
//        )
//        if (errorB.value.isNotEmpty()) {
//            Text(
//                text = errorB.value,
//                color = MaterialTheme.colorScheme.error,
//                style = MaterialTheme.typography.bodySmall
//            )
//        }
//
//        Button(onClick = {
//            val numberA = a.value.toIntOrNull()
//            val numberB = b.value.toIntOrNull()
//            var valid = true
//
//            if (numberA == null) {
//                errorA.value = "Please enter a valid number"
//                valid = false
//            }
//
//            if (numberB == null) {
//                errorB.value = "Please enter a valid number"
//                valid = false
//            }
//
//            if (valid) {
//                result.value = numberA!! + numberB!!
//            } else {
//                result.value = null
//            }
//        }) {
//            Text("Calculate Sum")
//        }
//
//        result.value?.let {
//            Text(
//                text = "Result: $it",
//                modifier = Modifier.padding(top = 16.dp),
//                style = MaterialTheme.typography.titleMedium
//            )
//        }
//    }
//}
//@Composable
//fun ModernLoginScreen() {
//    val context = LocalContext.current
//    val regNo = remember { mutableStateOf("") }
//    val password = remember { mutableStateOf("") }
//    val error = remember { mutableStateOf("") }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(32.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        // Top Logo Placeholder
//        Icon(
//            imageVector = Icons.Default.AccountBox,
//            contentDescription = "Logo",
//            tint = Color.Black,
//            modifier = Modifier.size(48.dp)
//        )
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        Text(
//            text = "Login",
//            style = MaterialTheme.typography.headlineMedium.copy(
//                fontWeight = FontWeight.Bold
//            )
//        )
//        Text(
//            text = "Sign in to continue.",
//            color = Color.Gray,
//            style = MaterialTheme.typography.bodyMedium
//        )
//
//        Spacer(modifier = Modifier.height(32.dp))
//
//        // REGISTRATION NUMBER
//        OutlinedTextField(
//            value = regNo.value,
//            onValueChange = {
//                regNo.value = it
//                error.value = ""
//            },
//            label = { Text("Name") },
//            shape = RoundedCornerShape(16.dp),
//            modifier = Modifier.fillMaxWidth()
//        )
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        // PASSWORD
//        OutlinedTextField(
//            value = password.value,
//            onValueChange = {
//                password.value = it
//                error.value = ""
//            },
//            label = { Text("Password") },
//            shape = RoundedCornerShape(16.dp),
//            visualTransformation = PasswordVisualTransformation(),
//            modifier = Modifier.fillMaxWidth()
//        )
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        if (error.value.isNotEmpty()) {
//            Text(
//                text = error.value,
//                color = Color.Red,
//                style = MaterialTheme.typography.bodySmall
//            )
//            Spacer(modifier = Modifier.height(8.dp))
//        }
//
//        // LOGIN BUTTON
//        Button(
//            onClick = {
//                if (regNo.value == "12200993" && password.value == "abc") {
//                    Toast.makeText(context, "Login Successfully", Toast.LENGTH_SHORT).show()
//                } else {
//                    error.value = "Wrong regno or password"
//                }
//            },
//            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
//            shape = RoundedCornerShape(12.dp),
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(50.dp)
//        ) {
//            Text("Log in", color = Color.White)
//        }
//
//        Spacer(modifier = Modifier.height(24.dp))
//
//        // Footer Links
//        Text(
//            text = "Forgot Password?",
//            color = Color.Gray,
//            style = MaterialTheme.typography.bodySmall
//        )
//        Text(
//            text = "Signup !",
//            color = Color.Gray,
//            style = MaterialTheme.typography.bodySmall
//        )
//    }
//}

//fun LoginScreen() {
//    val context = LocalContext.current
//    val regNo = remember { mutableStateOf("") }
//    val password = remember { mutableStateOf("") }
//    val errorMessage = remember { mutableStateOf("") }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(24.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text("Login", style = MaterialTheme.typography.headlineMedium)
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        TextField(
//            value = regNo.value,
//            onValueChange = {
//                regNo.value = it
//                errorMessage.value = ""
//            },
//            label = { Text("Registration Number") },
//            keyboardOptions = KeyboardOptions(
//                keyboardType = KeyboardType.Number,
//                imeAction = ImeAction.Next
//            ),
//            isError = errorMessage.value.isNotEmpty()
//        )
//
//        Spacer(modifier = Modifier.height(12.dp))
//
//        TextField(
//            value = password.value,
//            onValueChange = {
//                password.value = it
//                errorMessage.value = ""
//            },
//            label = { Text("Password") },
//            visualTransformation = PasswordVisualTransformation(),
//            keyboardOptions = KeyboardOptions(
//                keyboardType = KeyboardType.Password,
//                imeAction = ImeAction.Done
//            ),
//            isError = errorMessage.value.isNotEmpty()
//        )
//
//        if (errorMessage.value.isNotEmpty()) {
//            Text(
//                text = errorMessage.value,
//                color = MaterialTheme.colorScheme.error,
//                style = MaterialTheme.typography.bodySmall
//            )
//        }
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        Button(onClick = {
//            if (regNo.value == "12200993" && password.value == "abc") {
//                Toast.makeText(context, "Login Successfully", Toast.LENGTH_SHORT).show()
//                errorMessage.value = ""
//            } else {
//                errorMessage.value = "Wrong regno or password"
//            }
//        }) {
//            Text("Login")
//        }
//    }
//}

//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun SignUpScreen(){
//    var fullName by remember { mutableStateOf("") }
//    var email by remember { mutableStateOf("") }
//    var password by remember { mutableStateOf("") }
//    var confirmPassword by remember { mutableStateOf("") }
//    var phone by remember { mutableStateOf("") }
//    var gender by remember { mutableStateOf("Select Gender") }
//
//    var showPassword by remember { mutableStateOf(false) }
//    var showConfirmPassword by remember { mutableStateOf(false) }
//
//    var errors by remember {
//        mutableStateOf(
//            mapOf<String, String?>()
//        )
//    }
//
//    val genderOptions = listOf("Male", "Female", "Other")
//    var genderExpanded by remember { mutableStateOf(false) }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(24.dp),
//        verticalArrangement = Arrangement.Center
//    ) {
//        Text("Sign Up", style = MaterialTheme.typography.headlineMedium)
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        // Full Name
//        OutlinedTextField(
//            value = fullName,
//            onValueChange = {
//                fullName = it
//                errors = errors - "fullName"
//            },
//            label = { Text("Full Name") },
//            isError = errors["fullName"] != null,
//            modifier = Modifier.fillMaxWidth()
//        )
//        errors["fullName"]?.let {
//            Text(it, color = Color.Red)
//        }
//
//        Spacer(modifier = Modifier.height(12.dp))
//
//        // Email
//        OutlinedTextField(
//            value = email,
//            onValueChange = {
//                email = it
//                errors = errors - "email"
//            },
//            label = { Text("Email") },
//            isError = errors["email"] != null,
//            modifier = Modifier.fillMaxWidth()
//        )
//        errors["email"]?.let {
//            Text(it, color = Color.Red)
//        }
//
//        Spacer(modifier = Modifier.height(12.dp))
//
//        // Password
//        OutlinedTextField(
//            value = password,
//            onValueChange = {
//                password = it
//                errors = errors - "password"
//            },
//            label = { Text("Password") },
//            isError = errors["password"] != null,
//            modifier = Modifier.fillMaxWidth(),
//            visualTransformation = if (showPassword) VisualTransformation.None else PasswordVisualTransformation(),
//            trailingIcon = {
//                val icon = if (showPassword) Icons.Default.Visibility else Icons.Default.VisibilityOff
//                IconButton(onClick = { showPassword = !showPassword }) {
//                    Icon(imageVector = icon, contentDescription = "Toggle Password")
//                }
//            }
//        )
//        errors["password"]?.let {
//            Text(it, color = Color.Red)
//        }
//
//        Spacer(modifier = Modifier.height(12.dp))
//
//        // Confirm Password
//        OutlinedTextField(
//            value = confirmPassword,
//            onValueChange = {
//                confirmPassword = it
//                errors = errors - "confirmPassword"
//            },
//            label = { Text("Confirm Password") },
//            isError = errors["confirmPassword"] != null,
//            modifier = Modifier.fillMaxWidth(),
//            visualTransformation = if (showConfirmPassword) VisualTransformation.None else PasswordVisualTransformation(),
//            trailingIcon = {
//                val icon = if (showConfirmPassword) Icons.Default.Visibility else Icons.Default.VisibilityOff
//                IconButton(onClick = { showConfirmPassword = !showConfirmPassword }) {
//                    Icon(imageVector = icon, contentDescription = "Toggle Confirm Password")
//                }
//            }
//        )
//        errors["confirmPassword"]?.let {
//            Text(it, color = Color.Red)
//        }
//
//        Spacer(modifier = Modifier.height(12.dp))
//
//        // Phone
//        OutlinedTextField(
//            value = phone,
//            onValueChange = {
//                phone = it
//                errors = errors - "phone"
//            },
//            label = { Text("Phone") },
//            isError = errors["phone"] != null,
//            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Phone),
//            modifier = Modifier.fillMaxWidth()
//        )
//        errors["phone"]?.let {
//            Text(it, color = Color.Red)
//        }
//
//        Spacer(modifier = Modifier.height(12.dp))
//
//        // Gender Dropdown
//        ExposedDropdownMenuBox(
//            expanded = genderExpanded,
//            onExpandedChange = { genderExpanded = !genderExpanded }
//        ) {
//            OutlinedTextField(
//                value = gender,
//                onValueChange = {},
//                readOnly = true,
//                label = { Text("Gender") },
//                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = genderExpanded) },
//                modifier = Modifier.menuAnchor().fillMaxWidth()
//            )
//
//            ExposedDropdownMenu(
//                expanded = genderExpanded,
//                onDismissRequest = { genderExpanded = false }
//            ) {
//                genderOptions.forEach { option ->
//                    DropdownMenuItem(
//                        text = { Text(option) },
//                        onClick = {
//                            gender = option
//                            genderExpanded = false
//                            errors = errors - "gender"
//                        }
//                    )
//                }
//            }
//        }
//
//        errors["gender"]?.let {
//            Text(it, color = Color.Red)
//        }
//
//        Spacer(modifier = Modifier.height(24.dp))
//
//        // Submit Button
//        Button(
//            onClick = {
//                val newErrors = mutableMapOf<String, String?>()
//
//                if (fullName.isBlank()) newErrors["fullName"] = "Name is required"
//                if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) newErrors["email"] = "Invalid email"
//                if (password.length < 6) newErrors["password"] = "Password must be at least 6 characters"
//                if (password != confirmPassword) newErrors["confirmPassword"] = "Passwords do not match"
//                if (phone.length != 10) newErrors["phone"] = "Invalid phone number"
//                if (gender == "Select Gender") newErrors["gender"] = "Please select gender"
//
//                if (newErrors.isEmpty()) {
//                    println("Submitted: $fullName, $email, $phone, $gender")
//                }
//
//                errors = newErrors
//            },
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            Text("Sign Up")
//        }
//    }
//}
@Composable
fun profileCard() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.image),
                    contentDescription = "Profile",
                    modifier = Modifier
                        .size(100.dp)
                        .clip(RoundedCornerShape(50.dp))
                )
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    "Harshdeep kaur", style = MaterialTheme.typography.headlineSmall
                )
                Text(
                    "Software ", style = MaterialTheme.typography.bodyLarge
                )
                Text(
                    "Building App", style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Composable
fun login() {

    val context = LocalContext.current
    val regNo = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
//        val error = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Top Logo Placeholder
//            Icon(
//                imageVector = Icons.Default.AccountBox,
//                contentDescription = "Logo",
//                tint = Color.Black,
//                modifier = Modifier.size(48.dp)
//            )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Login",
            style = MaterialTheme.typography.headlineMedium.copy(
                fontWeight = FontWeight.Bold
            )
        )
//            Text(
//                text = "Sign in to continue.",
//                color = Color.Gray,
//                style = MaterialTheme.typography.bodyMedium
//            )

        Spacer(modifier = Modifier.height(32.dp))

        // REGISTRATION NUMBER
        OutlinedTextField(
            value = regNo.value,
            onValueChange = {
                regNo.value = it
            },
            label = { Text("Email id") },
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))


        OutlinedTextField(
            value = password.value,
            onValueChange = {
                password.value = it
            },
            label = { Text("Password") },
            shape = RoundedCornerShape(16.dp),
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {

                Toast.makeText(context, "Login Successfully", Toast.LENGTH_SHORT).show()

            },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text("Log in", color = Color.White)
        }

        Spacer(modifier = Modifier.height(24.dp))

//            // Footer Links
        Text(
            text = "Forgot Password?",
            color = Color.Gray,
            style = MaterialTheme.typography.bodySmall
        )
//            Text(
//                text = "Signup !",
//                color = Color.Gray,
//                style = MaterialTheme.typography.bodySmall
//            )
    }
}

@Composable
fun ProductCard() {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(), shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Column(
            modifier = Modifier
                .background(color = Color.White)
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.image),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(300.dp)
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                "Bad Cat",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
            Text(
                "$10,000",
                fontSize = 18.sp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                "*4.5 (120 Reviews)❤",
                fontSize = 14.sp,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(12.dp))
            Button(
                onClick = {

                },
                modifier = Modifier.align(Alignment.End)
            ) {
                Text("AddTo cart")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackTheme {
//        WelcomeMessage(modifier = Modifier)
//        AddTwoNumber(10, 20, modifier = Modifier)
//        Sum()
//        LoginScreen()ModernLoginScreen

//        SignUpScreen()
//        profileCard()
//        login()
        ProductList()
    }

}

package com.example.restaurante

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurante.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configura um listener para o botão de login
        binding.buttonEntrar.setOnClickListener {
            // Obtém o nome de usuário e a senha inseridos nos campos de texto
            val username = binding.editUsername.text.toString().trim()
            val password = binding.editPassword.text.toString().trim()

            // Verifica se o nome de usuário e a senha estão corretos
            if (username == "abc" && password == "123") {
                // Se estiverem corretos, inicia a MainActivity passando o nome de usuário como um extra
                val i = Intent(this, MainActivity::class.java)
                i.putExtra("username", username)
                startActivity(i)
                finish()
            } else {
                // Caso contrário, exibe uma mensagem de erro usando Toast
                Toast.makeText(applicationContext, "Errou", Toast.LENGTH_LONG).show()
            }
        }
    }
}

package com.example.restaurante

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtém o nome de usuário passado como extra da LoginActivity e exibe uma mensagem de boas-vindas na tela.
        val username = intent.extras?.getString("username")
        if (!username.isNullOrEmpty()) {
            binding.textOla.text = "Olá $username"
        }

        // Configura um listener para o botão "Fechar" que encerra a aplicação.
        binding.buttonFechar.setOnClickListener {
            finishAffinity()
        }

        // Configura um listener para o checkbox "Pizza" que exibe a quantidade e o preço da pizza selecionada.
        binding.checkPizza.setOnClickListener {
            if (binding.checkPizza.isChecked()) {
                binding.editQuantidadePizza.setText("1")
                binding.textPrecoPizza.visibility = View.VISIBLE
            } else {
                binding.editQuantidadePizza.setText("0")
                binding.textPrecoPizza.visibility = View.GONE
            }
        }

        // Configura um listener para o checkbox "Salada" que exibe a quantidade e o preço da salada selecionada.
        binding.checkSalada.setOnClickListener {
            if (binding.checkSalada.isChecked()) {
                binding.editQuantidadeSalada.setText("1")
                binding.textPrecoSalada.visibility = View.VISIBLE
            } else {
                binding.editQuantidadeSalada.setText("0")
                binding.textPrecoSalada.visibility = View.GONE
            }
        }

        // Configura um listener para o checkbox "Hamburger" que exibe a quantidade e o preço do hambúrguer selecionado.
        binding.checkHamburger.setOnClickListener {
            if (binding.checkHamburger.isChecked()) {
                binding.editQuantidadeHamburguer.setText("1")
                binding.textPrecoHamburguer.visibility = View.VISIBLE
            } else {
                binding.editQuantidadeHamburguer.setText("0")
                binding.textPrecoHamburguer.visibility = View.GONE
            }
        }
    }
}

package com.example.restaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.restaurante.databinding.ActivityPedidoBinding

class PedidoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPedidoBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPedidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtém os valores de quantidade de pizza, salada e hambúrguer passados como extras da Activity anterior.
        val i = intent
        val quantidadePizza = i.getStringExtra("quantidadePizza").toString().toInt()
        val quantidadeSalada = i.getStringExtra("quantidadeSalada").toString().toInt()
        val quantidadeHamburguer = i.getStringExtra("quantidadeHamburguer").toString().toInt()

        // Cria uma string contendo o resumo do pedido com as quantidades e preços calculados.
        val texto = "Resumo do Pedido\n" +
                "Pizza: $quantidadePizza Preço: ${quantidadePizza * 8}\n" +
                "Salada: $quantidadeSalada Preço: ${quantidadeSalada * 10}\n" +
                "Hamburguer: $quantidadeHamburguer Preço: ${quantidadeHamburguer * 12}\n"

        // Define o texto do TextView `textResumo` com o resumo do pedido.
        binding.textResumo.text = texto
    }
}

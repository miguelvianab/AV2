package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Cria um Handler para a thread principal e posta um atraso de 2000 milissegundos (2 segundos).
        // Isso garante que a splash screen seja exibida por 2 segundos antes de iniciar a próxima atividade.
        Handler(Looper.getMainLooper()).postDelayed({
            val i = intent
            val j = Intent(this, PedidoActivity::class.java)
            j.putExtras(i)
            startActivity(j)
            finish() // Finaliza a SplashActivity para que não seja retornada ao pressionar o botão "Voltar".
        }, 2000)
    }
}

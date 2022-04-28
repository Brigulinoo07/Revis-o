package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao: Button = findViewById(R.id.btn)
        botao.setOnClickListener{teste()}
    }
    fun teste(){

        val num1: EditText = findViewById(R.id.numeroo1)
        val num2: EditText = findViewById(R.id.numeroo2)

        val num3: Int = Integer.parseInt(num1.toString())
        val num4: Int = Integer.parseInt(num2.toString())

        if(num3.lenght()!=0 && num4.lenght!=0)
        {
            if(num3>num4)
            {
                Toast.makeText(this, "Campo 1 maior que o campo 2", Toast.LENGTH_SHORT).show()
            }
            else {
                if (num4 > num3) {
                    Toast.makeText(this, "Campo 2 maior que o campo 1", Toast.LENGTH_SHORT).show()
                }
            }
            else{
            if(num3==num4)
            {
                Toast.makeText(this, "Campo 1 igual ao campo 2", Toast.LENGTH_SHORT).show()
            }
             }
            else{
             Toast.makeText(this, "Número inválido", Toast.LENGTH_SHORT).show()
             }
        }

    }
}
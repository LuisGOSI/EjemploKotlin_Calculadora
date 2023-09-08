package com.example.ejemplo1diseodeapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //atributos de clase
    private lateinit var etNum1 : EditText
    private lateinit var etNum2 : EditText
    private lateinit var btnSumar : Button
    private lateinit var btnRestar : Button
    private lateinit var btnDividir : Button
    private lateinit var btnMultiplicar : Button
    private lateinit var tvResultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inicializamos los atributos y los relacionamos con su elemento de la UI
        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        btnSumar = findViewById(R.id.btnSumar)
        btnRestar = findViewById(R.id.btnRestar)
        btnDividir = findViewById(R.id.btnDividir)
        btnMultiplicar = findViewById(R.id.btnMultiplicar)
        tvResultado = findViewById(R.id.tvResultado)


        //Agregamos un listener al boton en el evento onClick:
        btnSumar.setOnClickListener(){

            //Validamos que las cajas de texto no esten vacias
            if (etNum1.text.isEmpty() || etNum2.text.isEmpty()){
                tvResultado.text = "Debes escribir un numero entero"
            }else{

                //Declaramos variables locales para obtener los valores de las cajas de texto
                var num1 : Int = etNum1.text.toString().toInt()
                var num2 : Int = etNum2.text.toString().toInt()

                //Hacemos la operacion
                var resultado : Int = num1 + num2


                // Mostramos el resultado en el TextView
                tvResultado.text = "El resultado es: $resultado"
            }

        }
        btnRestar.setOnClickListener(){

            //Validamos que las cajas de texto no esten vacias
            if (etNum1.text.isEmpty() || etNum2.text.isEmpty()){
                tvResultado.text = "Debes escribir un numero entero"
            }else{

                //Declaramos variables locales para obtener los valores de las cajas de texto
                var num1 : Int = etNum1.text.toString().toInt()
                var num2 : Int = etNum2.text.toString().toInt()

                //Hacemos la operacion
                var resultado : Int = num1 - num2


                // Mostramos el resultado en el TextView
                tvResultado.text = "El resultado es: $resultado"
            }

        }
        btnDividir.setOnClickListener(){

            //Validamos que las cajas de texto no esten vacias
            if (etNum1.text.isEmpty() || etNum2.text.isEmpty()){
                tvResultado.text = "Debes escribir un numero entero"
            }else{

                //Declaramos variables locales para obtener los valores de las cajas de texto
                var num1 : Int = etNum1.text.toString().toInt()
                var num2 : Int = etNum2.text.toString().toInt()

                //Hacemos la operacion
                var resultado : Int = num1 / num2


                // Mostramos el resultado en el TextView
                tvResultado.text = "El resultado es: $resultado"
            }

        }
        btnMultiplicar.setOnClickListener(){

            //Validamos que las cajas de texto no esten vacias
            if (etNum1.text.isEmpty() || etNum2.text.isEmpty()){
                tvResultado.text = "Debes escribir un numero entero"
            }else{

                //Declaramos variables locales para obtener los valores de las cajas de texto
                var num1 : Int = etNum1.text.toString().toInt()
                var num2 : Int = etNum2.text.toString().toInt()

                //Hacemos la operacion
                var resultado : Int = num1 * num2


                // Mostramos el resultado en el TextView
                tvResultado.text = "El resultado es: $resultado"
            }

        }

    }
}
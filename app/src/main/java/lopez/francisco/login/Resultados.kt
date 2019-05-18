package lopez.francisco.login

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_indice_masa_corporal.*
import kotlinx.android.synthetic.main.activity_resultados.*

class Resultados : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados)

        val Resultado = intent.extras.getFloat("Resultado")

        //val recuperamos_variable_float = intent.getFloatExtra("Resultado")

        tv1.text = "Tu resultado es: $Resultado"




        if (Resultado <= 18.4) {

            tvResultado.text = "Desnutrido"

        } else if (Resultado > 18.5 && Resultado < 24.9) {

            tvResultado.text = "Normal"

        } else if (Resultado > 25 && Resultado < 29.9) {

            tvResultado.text = "Sobrepeso"

        } else {

            tvResultado.text = "Obesidad"

        }
    }
}

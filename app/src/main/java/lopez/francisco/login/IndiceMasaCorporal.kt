package lopez.francisco.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_indice_masa_corporal.*

class IndiceMasaCorporal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indice_masa_corporal)


        val nombre = intent.extras.get("nombre")
        Toast.makeText(applicationContext, "Como estas ?", Toast.LENGTH_LONG).show()

        tvleyentaBienvenido.text = "Bienvenido $nombre"

        btnCalcular.setOnClickListener {

            var Altura = etAltura.text.trim().toString()
            var Peso = etPeso.text.trim().toString()

            var alturacuadrada =(Altura.toFloat()*Altura.toFloat())

            var resultado = (Peso.toFloat() / alturacuadrada.toFloat())



            val i = Intent(applicationContext, Resultados::class.java)

            i.putExtra("Resultado", resultado)

            startActivity(i)
        }
    }
}

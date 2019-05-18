package lopez.francisco.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnIniciar.setOnClickListener {


            val user= etUsuario.text.trim().toString()

            val pass = etContrasena.text.trim().toString()

            if (user.equals("Diana") && pass.equals("123")) {
                toast(
                    "Datos Correctos", Toast.LENGTH_LONG

                )
                val i = Intent(applicationContext, IndiceMasaCorporal::class.java)
                i.putExtra("nombre",etUsuario.text.trim().toString())
                startActivity(i)
            } else {

                toast(
                    "Tienes datos incorrectos", Toast.LENGTH_LONG
                )

            }
        }
    }

    fun toast(mensaje: String, duration: Int = Toast.LENGTH_LONG) {
        Toast.makeText(this, mensaje, duration).show()
    }
}
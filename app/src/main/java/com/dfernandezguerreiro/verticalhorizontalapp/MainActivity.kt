package com.dfernandezguerreiro.verticalhorizontalapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.toast


class MainActivity : AppCompatActivity() {

    var horizontal=false; //variable horizontal
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.fragment, Detalle.newInstance(), "detalle")
                    .commit()
        }


        //Hacemos el setOnClickListener del botón
        button.setOnClickListener{

            //si el textView es diferente a null...
            if(textView!=null) {
                horizontal=true; //...horizontal es true
            }

            //si es true muestra el toast
            if(horizontal){
                toast("HORIZONTAL")
            }else{
                //si es false creamos un Intent que llama a la Activity2

                val myIntent=Intent(this, Main2Activity::class.java).apply {
                    putExtra("id", 5) //<- Puedo mandar datos a la otra Activity
                }
                startActivity(myIntent)


                //Inicia el Activity2, simplificado con Anko
                startActivity(intentFor<Main2Activity>("id" to 5))
            }

        }


    }


}

package com.dfernandezguerreiro.verticalhorizontalapp

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class Detalle : Fragment() {

    //2
    companion object {

        fun newInstance(): Detalle {
            return Detalle()
        }
    }

    //3
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_detalle, container, false)
    }

}

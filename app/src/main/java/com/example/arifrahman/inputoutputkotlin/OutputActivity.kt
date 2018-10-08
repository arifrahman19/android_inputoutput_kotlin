package com.example.arifrahman.inputoutputkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_output.*


class OutputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output)

        supportActionBar?.title = ("Output Data")
        supportActionBar?.subtitle = ("Belajar bersama Kami")
        //judul dan subtitle

        val bundle = intent.extras
        //mengambil data dari intent

        outputNama.text = ("Nama : " + bundle.getCharSequence(MainActivity.NAMA))
        outputPassword.text = ("Password : " + bundle.getCharSequence(MainActivity.PASSWORD))
        outputEmail.text = ("Email : " + bundle.getCharSequence(MainActivity.EMAIL))
        outputjenisKelamin.text = ("Jenis Kelamin : " + bundle.getCharSequence(MainActivity.JENIS_KELAMIN))
        //menampilkan data berdasarkan key
    }
}

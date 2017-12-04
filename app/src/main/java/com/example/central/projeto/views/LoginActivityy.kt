package com.example.central.projeto.views

import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.preference.PreferenceManager
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.central.projeto.R
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login_actitvity.*

/**
 * Created by Central on 27/10/2017.
 */
class LoginActivityy : AppCompatActivity() {

    val progress: ProgressDialog by lazy { ProgressDialog(this) }
    var fbAuth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_actitvity)
        checkloguin()
        btnLogar.setOnClickListener {view ->
            SignIn(view,edtEmail.text.toString(), edtSenha.text.toString())
        }
    }




    fun checkloguin(){
        FirebaseAuth.getInstance()
        // other setup code
        val mPrefs = PreferenceManager.getDefaultSharedPreferences(this)
        if (mPrefs.getBoolean("conectado", false)) {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        } else {
        }
    }

    fun activityIndex() {
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }

    fun SignIn(view: View, usuario: String, senha: String){

        if(edtEmail.text.toString().isNotEmpty() && edtSenha.text.toString().isNotEmpty()){
            fbAuth.signInWithEmailAndPassword(usuario, senha).addOnCompleteListener(this, OnCompleteListener<AuthResult> { task ->
                if(task.isSuccessful){
                    progress.setCancelable(false)
                    progress.setMessage("Entrando ...")
                    progress.show()
                    sharedPref()
                    activityIndex()
                }else{
                    showMessage(view,"E-mail ou senha inválidos!")
                }
            })
        }else{
            showMessage(view,"Preencha os campos!")
        }

    }

    fun sharedPref(){

        if(cbManterConectado.isChecked == true){
            var pref = PreferenceManager.getDefaultSharedPreferences(this)
            var editor = pref.edit()

            //save infos
            editor.putBoolean("conectado", true)
            editor.commit()
        }else{
        }
    }

    fun showMessage(view: View, message: String){
        Snackbar.make(view, message, Snackbar.LENGTH_SHORT).setAction("Action", null).show()
    }

}
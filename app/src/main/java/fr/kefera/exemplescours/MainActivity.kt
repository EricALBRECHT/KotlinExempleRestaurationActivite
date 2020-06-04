package fr.kefera.exemplescours

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ActivityLifecycle","OnCreate")

        setContentView(R.layout.activity_main)
        restoreState(savedInstanceState)
    }
    var clickcount = 0
    fun clickCountButton(button:View){
        clickcount += 1
        updateDisplay()
    }
    fun updateDisplay(){
        textView.text = "${clickcount} clics"
    }
    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putInt("clickcount", clickcount)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        restoreState(savedInstanceState)
    }

    private fun restoreState(savedInstanceState: Bundle?) {
        clickcount = savedInstanceState?.getInt("clickcount") ?: 0
        updateDisplay()
    }


    override fun onResume() {
        super.onResume()
        Log.i("ActivityLifecycle","OnResume")

    }

    override fun onStart() {
        super.onStart()
        Log.i("ActivityLifecycle","OnStart")
    }
    override fun onPause() {
        super.onPause()
        Log.i("ActivityLifecycle","OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ActivityLifecycle","OnStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("ActivityLifecycle","OnRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ActivityLifecycle","OnDestroy")
    }

}
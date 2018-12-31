package android.com.UI_AND_THEMES.check

import android.com.fastadaptertest.R
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

class FirstActivity : AppCompatActivity(), View.OnClickListener {


    private var buttonReference: Button? = null

    override fun onClick(v: View?) {

            when (v?.id) {

                R.id.onclick -> {

                    var intent = Intent(this, SecndActivity::class.java)
                    startActivity(intent)
                }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        findingIdsHere()
        makingEventListenerHere()

    }

    private fun makingEventListenerHere() {

        buttonReference!!.setOnClickListener(this)

    }

    private fun findingIdsHere() {
//         buttonReference = findViewById<Button>(R.id.onclick) as Button
        buttonReference = findViewById(R.id.onclick)
    }


}
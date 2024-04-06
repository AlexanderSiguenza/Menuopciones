package edu.udb.tiposmenusandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.Menu
import android.view.MenuItem


open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.options_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_option1 -> {
                val intent = Intent(this, Option1Activity::class.java)
                startActivity(intent)
                true
            }
            R.id.action_option2 -> {
                val intent = Intent(this, Option2Activity::class.java)
                startActivity(intent)
                true
            }
            R.id.action_option3 -> {
                val intent = Intent(this, Option3Activity::class.java)
                startActivity(intent)
                true
            }
            R.id.action_option4 -> {
                val intent = Intent(this, Option4Activity::class.java)
                startActivity(intent)
                true
            }
            R.id.action_option5 -> {
                val intent = Intent(this, Option5Activity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}

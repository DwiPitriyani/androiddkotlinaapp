package dwi.polbeng.ac.id.androiddkotlinaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import dwi.polbeng.ac.id.androiddkotlinaapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvCounter.text = "1"
    }
    fun addNumber(view: View){
        val currVal = binding.tvCounter.text.toString().toInt()
        val nextVal = currVal + 1
        binding.tvCounter.text = nextVal.toString()
    }
    fun resetNumber(view: View){
        binding.tvCounter.text = "0"
    }
    fun subtractNumber(view: View){
        val currVal = binding.tvCounter.text.toString().toInt()
        val nextVal = currVal - 1
        binding.tvCounter.text = nextVal.toString()
    }
}

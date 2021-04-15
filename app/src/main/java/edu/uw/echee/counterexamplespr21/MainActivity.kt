package edu.uw.echee.counterexamplespr21

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import edu.uw.echee.counterexamplespr21.databinding.ActivityMainBinding

const val TAG = "MainActivity"
private const val COUNT_VALUE_KEY = "COUNT_VALUE_KEY"

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    // Value that we want to maintain on Activity configuration changes
    private var countValue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(root) }
        with(binding) {
            if (savedInstanceState != null) {
                // recreating the activity because it has saveInstanceState
                countValue = savedInstanceState.getInt(COUNT_VALUE_KEY, 0)
            }

            tvCountNum.text = countValue.toString()

            btnIncrease.setOnClickListener {
                countValue++
                tvCountNum.text = countValue.toString()
            }
            Log.i(TAG, "onCreate()")
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        // Save data
        outState.putInt(COUNT_VALUE_KEY, countValue)
        super.onSaveInstanceState(outState)
    }










    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy()")

    }
}

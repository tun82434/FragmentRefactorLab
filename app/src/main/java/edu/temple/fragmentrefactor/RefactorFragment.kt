package edu.temple.fragmentrefactor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RefactorFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_refactor, container, false).apply {
            val displayTextView = findViewById<TextView>(R.id.displayTextView2)
            val nameEditText = findViewById<EditText>(R.id.nameEditText2)
            val changeButton = findViewById<Button>(R.id.changeButton2)

            changeButton.setOnClickListener {
                val name = nameEditText.text

                displayTextView.text = if (name.isNotBlank()) {
                    "Hello, $name!"
                } else {
                    "Please enter your name"
                }
            }
        }
    }


}
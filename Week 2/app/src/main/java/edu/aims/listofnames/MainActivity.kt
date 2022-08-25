package edu.aims.listofnames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.children
import edu.aims.listofnames.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val names = arrayListOf(Person("Jenn","reading"),
        Person("Jim","Watching Startrek"),
        Person("Jill","Swimming"),
        Person("Joe"),
        Person("Jim","Watching Startrek"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        // set content view after binding
        val view = binding.root
        setContentView(view)

        val mainGroup = binding.mainGroup

        var count = 0;
        for(i in mainGroup.children)
        {
            if(i is TextView)
            {
                var content = names[count].name
                if(names[count].favoriteHobby != null) {
                    content += " " + names[count].favoriteHobby
                }

                i.text = content
                count++;
            }
        }


    }
}
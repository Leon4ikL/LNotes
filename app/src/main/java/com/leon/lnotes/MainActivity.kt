package com.leon.lnotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.leon.feature_home_screen.api.HomeScreenFragment
import com.leon.lnotes.database.AppDatabase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentManager = supportFragmentManager
        if(fragmentManager.findFragmentById(R.id.fragment_container_view) == null){
            fragmentManager.commit {
                add<HomeScreenFragment>(R.id.fragment_container_view, FRAGMENT_HOME_SCREEN)
            }
        }
    }

    private companion object {

        private const val FRAGMENT_HOME_SCREEN = "home"
    }
}
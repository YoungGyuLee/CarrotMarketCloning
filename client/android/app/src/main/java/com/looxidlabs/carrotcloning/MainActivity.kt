package com.looxidlabs.carrotcloning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toolbar
import androidx.fragment.app.Fragment
import com.google.android.material.appbar.MaterialToolbar
import com.looxidlabs.carrotcloning.home.ui.HomeFragment

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var toolBar : MaterialToolbar

    lateinit var btnHomeTab : ImageButton
    lateinit var btnTownTab : ImageButton
    lateinit var btnNearTab : ImageButton
    lateinit var btnChatTab : ImageButton
    lateinit var btnProfileTab : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeView()
        addFragment(HomeFragment())
        toolBar.title = "하계동"

    }

    private fun initializeView(){
        toolBar = findViewById(R.id.main_tool_bar)

        btnHomeTab = findViewById(R.id.btn_main_home)
        btnTownTab = findViewById(R.id.btn_main_town)
        btnNearTab = findViewById(R.id.btn_main_near)
        btnChatTab = findViewById(R.id.btn_main_chat)
        btnProfileTab = findViewById(R.id.btn_main_profile)

    }

    private val addFragment = {fragment : Fragment ->
        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        transaction.add(R.id.fl_main, fragment)
        transaction.commit()
    }

    private val replaceFragment = {fragment : Fragment ->
        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        transaction.replace(R.id.fl_main, fragment)
        transaction.commit()
    }

    override fun onClick(v: View?) {
        when(v){

        }
    }
}
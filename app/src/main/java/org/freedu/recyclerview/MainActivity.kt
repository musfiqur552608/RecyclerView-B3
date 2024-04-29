package org.freedu.recyclerview

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import org.freedu.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val player = ArrayList<Player>()

        player.add(Player("Musfiqur Rahim", "He is Right handed batsman", R.drawable.musfiq))
        player.add(Player("Tamim Iqbal", "He is left handed batsman", R.drawable.tamim))
        player.add(Player("Sakib Al Hasan", "He is a number 1 Allrounder", R.drawable.sakib))
        player.add(Player("Mahmudullah Riyad", "He is Right handed batsman", R.drawable.mahmudullah))
        player.add(Player("Mashrafe Bin Mortaza", "He is Right handed bowler", R.drawable.mashrafe))

        binding.recyclerView.adapter = PlayerAdapter(player)

    }
}
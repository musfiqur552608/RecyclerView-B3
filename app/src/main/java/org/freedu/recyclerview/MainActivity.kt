package org.freedu.recyclerview

import android.content.Intent
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

        player.add(Player("Musfiqur Rahim", "He is Right handed batsman", R.drawable.musfiq,"He is Right handed batsman"))
        player.add(Player("Tamim Iqbal", "He is left handed batsman", R.drawable.tamim, "He is left handed batsman"))
        player.add(Player("Sakib Al Hasan", "He is a number 1 Allrounder", R.drawable.sakib, "He is a number 1 Allrounder"))
        player.add(Player("Mahmudullah Riyad", "He is Right handed batsman", R.drawable.mahmudullah, "He is Right handed batsman"))
        player.add(Player("Mashrafe Bin Mortaza", "He is Right handed bowler", R.drawable.mashrafe, "He is Right handed bowler"))

        var playerAdapter = PlayerAdapter(player)
        binding.recyclerView.adapter = playerAdapter

        playerAdapter.onClick = {
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("name",it.playerName)
            intent.putExtra("details",it.longDetails)
            intent.putExtra("image",it.playerImage)
            startActivity(intent)
        }



    }
}
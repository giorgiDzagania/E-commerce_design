package com.example.ecommercedesign.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ecommercedesign.data.ItemRepository
import com.example.ecommercedesign.databinding.ActivityMainBinding
import com.example.ecommercedesign.data.Item

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val mainAdapter = MainAdapter()
    private val itemRepository = ItemRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUp()
    }

    private fun setUp() {
        initRecyclerView()
        initAdapter()
    }

    private fun initRecyclerView() {
        binding.recyclerView.apply {
            adapter = mainAdapter
            layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
        }
    }

    private fun initAdapter() {
        mainAdapter.submitList(itemRepository.itemList)
    }

}
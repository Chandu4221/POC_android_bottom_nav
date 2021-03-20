package com.example.menuui_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.menuui_demo.data.DishItem
import com.example.menuui_demo.databinding.ActivityMainBinding
import com.example.menuui_demo.dist_item_adapter.DishItemAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//view binding syntax
        binding = ActivityMainBinding.inflate(layoutInflater);

        setContentView(binding.root);


        var dishes = mutableListOf<DishItem>(
            DishItem(
                "Toyo Eatery",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean pulvinar, dui ac pharetra laoreet, justo nulla ultricies orci, vitae rutrum est felis in metus."
            ),
            DishItem(
                "Kokomo",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean pulvinar, dui ac pharetra laoreet, justo nulla ultricies orci, vitae rutrum est felis in metus."
            ),
            DishItem(
                "City Eats NYC",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean pulvinar, dui ac pharetra laoreet, justo nulla ultricies orci, vitae rutrum est felis in metus."
            ),
            DishItem(
                "Le Bernardian",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean pulvinar, dui ac pharetra laoreet, justo nulla ultricies orci, vitae rutrum est felis in metus."
            ),
            DishItem(
                "Toyo Eatery",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean pulvinar, dui ac pharetra laoreet, justo nulla ultricies orci, vitae rutrum est felis in metus."
            ),
            DishItem(
                "Kokomo",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean pulvinar, dui ac pharetra laoreet, justo nulla ultricies orci, vitae rutrum est felis in metus."
            ),
            DishItem(
                "City Eats NYC",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean pulvinar, dui ac pharetra laoreet, justo nulla ultricies orci, vitae rutrum est felis in metus."
            ),
            DishItem(
                "Le Bernardian",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean pulvinar, dui ac pharetra laoreet, justo nulla ultricies orci, vitae rutrum est felis in metus."
            ),
            DishItem(
                "Toyo Eatery",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean pulvinar, dui ac pharetra laoreet, justo nulla ultricies orci, vitae rutrum est felis in metus."
            ),
            DishItem(
                "Kokomo",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean pulvinar, dui ac pharetra laoreet, justo nulla ultricies orci, vitae rutrum est felis in metus."
            ),
            DishItem(
                "City Eats NYC",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean pulvinar, dui ac pharetra laoreet, justo nulla ultricies orci, vitae rutrum est felis in metus."
            ),
            DishItem(
                "Le Bernardian",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean pulvinar, dui ac pharetra laoreet, justo nulla ultricies orci, vitae rutrum est felis in metus."
            ),
            DishItem(
                "Toyo Eatery",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean pulvinar, dui ac pharetra laoreet, justo nulla ultricies orci, vitae rutrum est felis in metus."
            ),
            DishItem(
                "Kokomo",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean pulvinar, dui ac pharetra laoreet, justo nulla ultricies orci, vitae rutrum est felis in metus."
            ),
            DishItem(
                "City Eats NYC",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean pulvinar, dui ac pharetra laoreet, justo nulla ultricies orci, vitae rutrum est felis in metus."
            ),
            DishItem(
                "Le Bernardian",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean pulvinar, dui ac pharetra laoreet, justo nulla ultricies orci, vitae rutrum est felis in metus."
            ),
        );

        var dishesAdapter = DishItemAdapter(dishes);
        binding.dishesList.adapter = dishesAdapter;
        binding.dishesList.layoutManager = LinearLayoutManager(this);

    }
}
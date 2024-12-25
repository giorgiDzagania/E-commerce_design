package com.example.ecommercedesign.data

import com.example.ecommercedesign.R

data class Item(
    val id: Int,
    val image: Int,
    val itemName: String,
    val itemDescription: String,
    val itemPrice: String
)

class ItemRepository {
    val itemList = listOf(
        Item(
            id = 1,
            image = R.drawable.model_one,
            itemName = "Yellow Jacket",
            itemDescription = "Warm and trendy jacket.",
            itemPrice = "$110.00"
        ),
        Item(
            id = 2,
            image = R.drawable.model_two,
            itemName = "Black T-Shirt",
            itemDescription = "Soft and breathable everyday t-shirt.",
            itemPrice = "$99.99"
        ),
        Item(
            id = 3,
            image = R.drawable.model_three,
            itemName = "Designer Jeans",
            itemDescription = "Comfortable and fashionable jeans.",
            itemPrice = "$110.00"
        ),
        Item(
            id = 4,
            image = R.drawable.model_four,
            itemName = "Fashionable White Coat",
            itemDescription = "A stylish, high-end white coat, modern look.",
            itemPrice = "$299.00"
        )
    )
}
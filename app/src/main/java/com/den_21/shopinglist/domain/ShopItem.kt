package com.den_21.shopinglist.domain

data class ShopItem(
    val title: String,
    val quantity: Int,
    val isEnabled: Boolean,
    var id: Int = UNDEFINED_ID
) {
    companion object {
        //to avoid magical numbers anti pattern
        const val UNDEFINED_ID = -1
    }
}

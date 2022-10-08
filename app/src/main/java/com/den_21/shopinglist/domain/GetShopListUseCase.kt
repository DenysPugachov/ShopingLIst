package com.den_21.shopinglist.domain

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList() {
        shopListRepository.getShopList()
    }
}
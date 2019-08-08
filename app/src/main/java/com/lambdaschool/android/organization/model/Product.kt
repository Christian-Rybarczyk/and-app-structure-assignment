package com.lambdaschool.android.organization.model

data class Product(val productName: String = "Hockey Puck",
              val productDescription: String = "Rubber puck",
              val productPrice: Double = 3.0,
              val productTax: Double = productPrice * 0.085,
              val productDiscount: Double = .10)
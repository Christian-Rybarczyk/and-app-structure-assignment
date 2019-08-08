package com.lambdaschool.android.organization.util

import java.text.NumberFormat

class TextUtils {
    companion object {
        fun formatCurrency(price : Double) : String {
            return NumberFormat.getCurrencyInstance().format(price)
        }

        fun formatPercent(discount : Double) : String {
            return "${NumberFormat.getPercentInstance().format(discount)} discount"
        }
    }
}
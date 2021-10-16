package com.david.calculadormvp.interfaces

interface OperationPresenter {
    fun showResult(toString: String)
    fun invalidOperation()
    fun add(num1: Int, num2: Int)
    fun substract(num1: Int, num2: Int)
    fun multiply(num1: Int, num2: Int)
    fun divide(num1: Int, num2: Int)
}
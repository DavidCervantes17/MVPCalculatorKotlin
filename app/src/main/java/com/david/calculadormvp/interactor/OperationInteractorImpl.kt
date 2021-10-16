package com.david.calculadormvp.interactor

import com.david.calculadormvp.interfaces.OperationInteractor
import com.david.calculadormvp.interfaces.OperationPresenter

class OperationInteractorImpl(var operationPresenter: OperationPresenter): OperationInteractor {

    private var result = 0

    override fun add(num1: Int, num2: Int) {
        result =  num1 + num2;
        operationPresenter.showResult(Integer.toString(result))
    }

    override fun substract(num1: Int, num2: Int) {
        result =  num1 - num2;
        operationPresenter.showResult(Integer.toString(result))
    }

    override fun multiply(num1: Int, num2: Int) {
        result =  num1 * num2;

        operationPresenter.showResult(Integer.toString(result))
    }

    override fun divide(num1: Int, num2: Int) {
        if(num2 != 0){
            result =  num1 / num2;
            operationPresenter.showResult(Integer.toString(result))
        } else {
            operationPresenter.invalidOperation()
        }

    }

}
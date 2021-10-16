package com.david.calculadormvp.presenters

import com.david.calculadormvp.interactor.OperationInteractorImpl
import com.david.calculadormvp.interfaces.OperationPresenter
import com.david.calculadormvp.interfaces.OperationView
import com.david.calculadormvp.views.OperationActivityView
import com.david.calculadormvp.interfaces.OperationInteractor




class OperationPresenterImpl(var view: OperationView) : OperationPresenter {

    private val interactor: OperationInteractor = OperationInteractorImpl(this)

    override fun showResult(result: String) {
        view?.showResult(result);
    }

    override fun invalidOperation() {
        view?.invalidOperation();

    }

    override fun add(num1: Int, num2: Int) {
        interactor?.add(num1, num2);
    }

    override fun substract(num1: Int, num2: Int) {
        interactor?.substract(num1, num2);
    }

    override fun multiply(num1: Int, num2: Int) {
        interactor?.multiply(num1, num2);
    }

    override fun divide(num1: Int, num2: Int) {
        interactor?.divide(num1, num2);
    }
}
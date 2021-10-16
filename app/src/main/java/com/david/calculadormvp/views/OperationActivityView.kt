package com.david.calculadormvp.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.david.calculadormvp.R
import com.david.calculadormvp.interfaces.OperationView
import android.widget.TextView

import android.widget.EditText
import com.david.calculadormvp.interfaces.OperationPresenter
import com.david.calculadormvp.presenters.OperationPresenterImpl


class OperationActivityView : AppCompatActivity(), OperationView {

    private var number1: EditText? = null
    private var number2: EditText? = null
    private var txtResult: TextView? = null
    private var presenter: OperationPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operation)

        number1 = findViewById(R.id.txtNumber1);
        number2 = findViewById(R.id.txtNumber2);
        txtResult = findViewById(R.id.txtResult);
        presenter =  OperationPresenterImpl(this);

    }

    fun doAdd(view: View){
        try {
            val num1 = number1?.text.toString().toInt()
            val num2 = number2?.text.toString().toInt()
            presenter?.add(num1, num2)
        } catch (e: NumberFormatException) {
            invalidOperation()
        }
    }

    fun doSubstract(view: View){
        try {
            val num1 = number1?.text.toString().toInt()
            val num2 = number2?.text.toString().toInt()
            presenter?.substract(num1, num2)
        } catch (e: NumberFormatException) {
            invalidOperation()
        }
    }

    fun doMultiply(view: View){
        try {
            val num1 = number1?.text.toString().toInt()
            val num2 = number2?.text.toString().toInt()
            presenter?.multiply(num1, num2)
        } catch (e: NumberFormatException) {
            invalidOperation()
        }
    }

    fun doDivide(view: View){
        try {
            val num1 = number1?.text.toString().toInt()
            val num2 = number2?.text.toString().toInt()
            presenter?.divide(num1, num2)
        } catch (e: NumberFormatException) {
            invalidOperation()
        }
    }

    override fun showResult(result: String) {
        txtResult?.setText(result);
    }

    override fun invalidOperation() {
        Toast.makeText(this, "Invalid operation", Toast.LENGTH_SHORT).show();
    }
}
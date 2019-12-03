package com.com.expenseManager.ExpenseManagerAPI.repositories;

import com.expenseManager.ExpenseManagerAPI.domain.Expense;

import java.util.ArrayList;
import java.util.List;

public class ExpenseRepository {

    List<Expense> expenseList = new ArrayList<>();

    public void addExpense(Expense expense){
        expenseList.add(expense);
    }

    public void deleteExpense(Expense expense){
        expenseList.remove(expense);
    }

    public void updateExpense(Expense toBeUpdated, Expense updatedWith){
        int index = expenseList.indexOf(toBeUpdated);
        expenseList.add(index,updatedWith);
    }

    public List<Expense> getElements(){
        return expenseList;
    }

}


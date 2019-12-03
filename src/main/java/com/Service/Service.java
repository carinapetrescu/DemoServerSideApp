package com.Service;


import com.com.expenseManager.ExpenseManagerAPI.repositories.ExpenseRepository;
import com.expenseManager.ExpenseManagerAPI.domain.Expense;

import java.util.List;

public class Service {
    ExpenseRepository expenseRepository;

    public List<Expense> getElements(){
        return expenseRepository.getElements();
    }
    public void addExpense(Expense e){
        expenseRepository.addExpense(e);
    }

    public void deleteExpense(Expense e){
        expenseRepository.deleteExpense(e);
    }

    public void updateExpense(Expense tobeUpdated,Expense updatedWith){
        expenseRepository.updateExpense(tobeUpdated,updatedWith);
    }
}

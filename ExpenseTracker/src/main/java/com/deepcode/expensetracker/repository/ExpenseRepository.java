package com.deepcode.expensetracker.repository;

import com.deepcode.expensetracker.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    @Query("""
SELECT e.category,
       SUM(e.amount)
FROM Expense e
GROUP BY e.category
""")
    List<Object[]> getCategoryAnalysis();
}
package com.educandoweb.course.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.educandoweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	@Query("""
		    SELECT DISTINCT o
		    FROM Order o
		    LEFT JOIN FETCH o.items i
		    LEFT JOIN FETCH i.id.product p
		    LEFT JOIN FETCH p.categories
		""")
		List<Order> findOrdersWithItems();
}
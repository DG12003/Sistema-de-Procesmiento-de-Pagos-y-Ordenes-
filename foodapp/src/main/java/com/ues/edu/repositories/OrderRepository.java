package com.ues.edu.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ues.edu.entities.Orders;
import com.ues.edu.entities.User;
import org.springframework.stereotype.Repository;
@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer>
{
	List<Orders> findOrdersByUser(User user);
}
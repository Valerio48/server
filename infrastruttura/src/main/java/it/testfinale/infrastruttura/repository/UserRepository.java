package it.testfinale.infrastruttura.repository;

import it.testfinale.infrastruttura.object.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

import it.testfinale.infrastruttura.object.model.User;   // Import per User
import it.testfinale.infrastruttura.object.model.Order;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}

@Repository
interface ProductRepository extends JpaRepository<Product, Long> {}

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {}

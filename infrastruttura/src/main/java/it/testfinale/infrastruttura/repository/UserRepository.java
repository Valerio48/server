package it.testfinale.infrastruttura.repository;

import it.testfinale.infrastruttura.object.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {}

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {}

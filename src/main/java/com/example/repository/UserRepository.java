package com.example.repository;

        import com.example.model.User;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{

//    public List<User> findAllByName(String name);

    User findByName(String name);

}

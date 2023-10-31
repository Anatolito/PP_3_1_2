package ru.anatolito.PP_3_1_2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.anatolito.PP_3_1_2.models.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}

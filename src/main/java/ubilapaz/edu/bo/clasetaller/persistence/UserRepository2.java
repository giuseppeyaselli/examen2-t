package ubilapaz.edu.bo.clasetaller.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ubilapaz.edu.bo.clasetaller.domain.User;
import ubilapaz.edu.bo.clasetaller.dto.UserDto;

import java.util.List;

@Repository
public interface UserRepository2 extends JpaRepository<User,Integer> {
    @Query(value = "SELECT new ubilapaz.edu.bo.clasetaller.dto.UserDto(r.username, r.password, r.nombre) FROM User r order by id desc")
    List<UserDto> obtenerLista();


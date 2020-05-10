package ru.mail.sheingrisha.gritter.repos;

import org.springframework.data.repository.CrudRepository;
import ru.mail.sheingrisha.gritter.domain.Message;

/**
 * Created by Shein G.A. at 29.04.20
 **/
public interface MessageRepo extends CrudRepository<Message, Long> {
}

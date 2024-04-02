package rocketseat.com.passin.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import rocketseat.com.passin.domain.attendee.Attendee;

import java.util.List;

public interface AttendeeRepository extends JpaRepository<Attendee, String> {

    List<Attendee> findByEventId(String eventId);
}

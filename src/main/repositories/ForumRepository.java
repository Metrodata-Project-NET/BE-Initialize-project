import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ForumRepository extends JpaRepository<Forum, UUID> {
    // Anda dapat menambahkan metode pencarian kustom di sini jika diperlukan
}

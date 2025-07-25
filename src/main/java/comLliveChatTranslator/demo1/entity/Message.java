package comLliveChatTranslator.demo1.entity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "messages")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long senderId;
    private Long receiverId;
    private String originalText;
    private String translatedText;
    private LocalDateTime timestamp;
}

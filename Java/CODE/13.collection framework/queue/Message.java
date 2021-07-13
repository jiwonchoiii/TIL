package queue;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Message {
 public String command;
 public String to;
}

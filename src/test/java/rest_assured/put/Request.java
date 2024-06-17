package rest_assured.put;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {
    private String name;
    private String job;
    private String updatedAt;
}

package rest_assured.post;

import lombok.Data;

@Data
public class Create {
    private final String name;
    private final String job;
    private final String id;
    private final String createdAt;
}

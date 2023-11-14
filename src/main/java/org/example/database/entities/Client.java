
package org.example.database.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Data
@Entity
@Table(name = "client")
public class Client {

    private static final Logger LOG = LogManager.getLogger(Client.class);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name_", length = 200, nullable = false)
    private String name;


//     A callback method that logs when a new client is persisted to the database.

    @PostPersist
    public void logNewClientPersisted() {
        LOG.info("Persisted client: '{}'", name);
    }

    /**
     * A callback method that logs when a client is loaded from the database.
     */
    @PostLoad
    public void logUserLoad() {
        LOG.info("Loaded client: '{}'", name);
    }

    /**
     * A callback method that logs when a client is updated in the database.
     */
    @PostUpdate
    public void logUserUpdated() {
        LOG.info("Updated client: '{}'", name);
    }

    /**
     * A callback method that logs when a client is removed from the database.
     */
    @PostRemove
    public void logClientRemoval() {
        LOG.info("Deleted client: '{}'", name);
    }
}
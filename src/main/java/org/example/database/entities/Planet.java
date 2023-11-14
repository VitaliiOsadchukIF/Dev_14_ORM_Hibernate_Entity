
package org.example.database.entities;

import lombok.Data;
import jakarta.persistence.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Data
@Entity
@Table(name = "planet")
public class Planet {

    private static final Logger LOG = LogManager.getLogger(Planet.class);

    @Id
    @Column(name = "id", length = 10)
    private String id;

    @Column(name = "name_", length = 500, nullable = false)
    private String name;

//    A callback method that logs when a new planet is persisted to the database.

    @PostPersist
    public void logNewClientPersisted() {
        LOG.info("Persisted planet: '{}'", name);
    }

//    A callback method that logs when a planet is loaded from the database.

    @PostLoad
    public void logUserLoad() {
        LOG.info("Loaded planet: '{}'", name);
    }

//    A callback method that logs when a planet is updated in the database.

    @PostUpdate
    public void logUserUpdate() {
        LOG.info("Updated planet: '{}'", name);
    }

//    A callback method that logs when a planet is removed from the database.

    @PostRemove
    public void logPlanetRemove() {
        LOG.info("Deleted planet: '{}'", name);
    }

}
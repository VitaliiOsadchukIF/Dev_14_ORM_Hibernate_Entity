
package org.example;


//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
import org.example.database.entities.Client;
import org.example.database.entities.Planet;
import org.example.database.entities.Ticket;
import org.example.database.repositories.ClientCrud;
import org.example.database.repositories.PlanetCrud;
import org.example.database.repositories.TicketCrud;
import org.example.database.utils.FlywayMigration;
import org.example.database.utils.HibernateUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Timestamp;
import java.time.LocalDateTime;


public class App {

    private static final Logger LOG = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        LOG.info("The program has started");

        FlywayMigration.migrateDatabase();

        ClientCrud clientCrud = new ClientCrud();

        Client newClient = new Client();
        newClient.setName("Oleg");
        clientCrud.persist(newClient);

        Client client = clientCrud.getById(2);

        client.setName("Eve");

        clientCrud.merge(client);

        clientCrud.remove(client);


        PlanetCrud planetCrud = new PlanetCrud();

        Planet newPlanet = new Planet();
        newPlanet.setId("SIRI");
        newPlanet.setName("Siri");
        planetCrud.persist(newPlanet);

        Planet planet = planetCrud.getById("SATURN");

        planet.setId("EAR");
        planet.setName("Earth");
        planetCrud.merge(planet);

        planetCrud.remove(planet);




        TicketCrud ticketCrud = new TicketCrud();


        Planet fromPlanet = planetCrud.getById("VENUS");
        Planet toPlanet = planetCrud.getById("JUPITER");
        Client client1 = clientCrud.getById(5);

        Ticket newTicket = new Ticket();

        newTicket.setFromPlanet(fromPlanet);
        newTicket.setToPlanet(toPlanet);
        newTicket.setClient(client1);
        newTicket.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));
        ticketCrud.persist(newTicket);

        Ticket ticket = ticketCrud.getById(5);

        ticket.setToPlanet(toPlanet);
        ticketCrud.merge(ticket);

        ticketCrud.remove(ticket);

        HibernateUtil.getInstance().close();

        LOG.info("The program has finished");

    }
}
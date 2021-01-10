package ru.rsatu;

import ru.rsatu.model.TestEntity;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello-resteasy")
public class GreetingResource {

    @Inject
    EntityManager em;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Transactional
    public String hello() {
        TestEntity testEntity = new TestEntity();
        testEntity.setName("some name");
        em.persist(testEntity);
        return "Hello RESTEasy";
    }
}
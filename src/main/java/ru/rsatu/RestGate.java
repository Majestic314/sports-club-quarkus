package ru.rsatu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.rsatu.model.request.SaveVisitsRequest;
import ru.rsatu.model.response.GetClientList;
import ru.rsatu.model.response.GetCoachList;
import ru.rsatu.model.response.GetGroupList;
import ru.rsatu.model.response.GetSubscriptionList;
import ru.rsatu.services.ClientService;
import ru.rsatu.services.CoachService;
import ru.rsatu.services.GroupService;
import ru.rsatu.services.SubscriptionService;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/rest")
public class RestGate {

    private static final Logger logger = LoggerFactory.getLogger(RestGate.class.getName());

    @Inject
    GroupService groupService;

    @Inject
    CoachService coachService;

    @Inject
    ClientService clientService;

    @Inject
    SubscriptionService subscriptionService;

    /**
     * Метод для вывода всех групп.
     */
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getGroupList")
    public Response getGroupList() {
        GetGroupList result = null;
        try {
            result = this.groupService.getGroupList();
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
        return Response.ok(result.getGroupList()).build();
    }

    /**
     * Метод для вывода всех тренеров.
     */
    @GET
    @RolesAllowed("coach")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getCoachList")
    public Response getCoachList() {
        GetCoachList result = null;
        try {
            result = this.coachService.getCoachList();
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
        return Response.ok(result.getCoachList()).build();
    }

    /**
     * Метод для вывода всех клиентов, занимающихся у данного тренера.
     * @param coachId id тренера
     */
    @GET
    @RolesAllowed("coach")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getClientList")
    public Response getClientList(@QueryParam(value = "coachId") long coachId) {
        GetClientList result = null;
        try {
            result = this.clientService.getClientList(coachId);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
        return Response.ok(result.getClientList()).build();
    }

    /**
     * Метод для вывода всех подписок.
     */
    @GET
    @RolesAllowed("manager")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getSubscriptionList")
    public Response getSubscriptionList(@QueryParam(value = "groupId") long groupId) {
        GetSubscriptionList result = null;
        try {
            result = this.subscriptionService.getSubscriptionList(groupId);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
        return Response.ok(result.getSubscriptionList()).build();
    }

    /**
     * Метод для вычета посещений у клиентов.
     * @param request список клиентов
     */
    @POST
    @RolesAllowed("coach")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/saveVisits")
    public Response saveVisits(SaveVisitsRequest request) {
        try {
            subscriptionService.saveVisits(request.getClients());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
        return Response.ok().build();
    }
}

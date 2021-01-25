package ru.rsatu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.rsatu.model.response.GetGroupList;
import ru.rsatu.model.response.GetSubscriptionList;
import ru.rsatu.services.GroupService;
import ru.rsatu.services.SubscriptionService;

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
     * Метод для вывода всех подписок.
     */
    @GET
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
        return Response.ok(result).build();
    }

}

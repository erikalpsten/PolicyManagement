package com.mypackage;  

import java.util.List;

import javax.crypto.spec.SecretKeySpec;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.xml.bind.DatatypeConverter;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.security.Key;
import java.security.SignatureException;

@Path("/PolicyService") 

public class PolicyService {  
    @GET 
    @Path("/policies") 
    @Produces("application/json") 
    public List<Policy> getPolicies(){ 
    	return PolicyServer.getPolicies(); 
    }  
    
    /*
    @GET
    @Path("/policies/{policyID}")
    @Produces("application/json")
    public Policy getPolicy(@PathParam("policyID") String policyID){
    	List<Policy> policies = PolicyServer.getPolicies();
    	for(Policy policy : policies){
    		// check for matching policyID
    	}
    	
    } 
    */
}
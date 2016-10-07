package org.mitre.springboot.oauth2.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.transaction.Transactional;

import org.junit.Test;
import org.mitre.oauth2.web.IntrospectionEndpoint;

@Transactional
public class TokenEndpointAuthorizationTests extends OAuthAuthorizationTestsBase {
	
	//TODO verify ClientCredentialsTokenEndpointFilter type of access with client_id and client_secret on the URI rather than basic auth
	//TODO verify JWT access via JWTBearerClientAssertionTokenEndpointFilter rather than basic auth
	//TODO token tests
	
	@Test
	public void anonymousGetIntrospectEndpointUnauthenticated() throws Exception {
		mockMvc.perform(
			get("/"+IntrospectionEndpoint.URL))
			.andExpect(status().is(401))
			;
	}
}

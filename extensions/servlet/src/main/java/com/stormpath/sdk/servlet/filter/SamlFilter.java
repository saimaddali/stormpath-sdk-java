package com.stormpath.sdk.servlet.filter;

import com.stormpath.sdk.servlet.filter.mvc.ControllerFilter;

import javax.servlet.ServletException;

/**
 * @since 1.0.0
 */
public class SamlFilter extends ControllerFilter {

    @Override
    protected void onInit() throws ServletException {
        /* TODO SAML is currently broken
        SubdomainResolver subdomainResolver = new SubdomainResolver();
        subdomainResolver.setBaseDomainName(getConfig().get("stormpath.web.application.domain"));

        DefaultOrganizationNameKeyResolver organizationNameKeyResolver = new DefaultOrganizationNameKeyResolver();
        organizationNameKeyResolver.setSubdomainResolver(subdomainResolver);

        DefaultSamlOrganizationResolver samlOrganizationResolver = new DefaultSamlOrganizationResolver();
        samlOrganizationResolver.setOrganizationNameKeyResolver(organizationNameKeyResolver);

        SamlController controller = new SamlController();
        controller.setServerUriResolver(new DefaultServerUriResolver());
        controller.setSamlUri("/");
        controller.setCallbackUri(getConfig().get("stormpath.web.saml.result.uri"));
        controller.setAlreadyLoggedInUri(getConfig().getLoginControllerConfig().getNextUri());
        controller.setSamlOrganizationResolver(samlOrganizationResolver);
        controller.init();

        setController(controller);
        */
        super.onInit();
    }
}

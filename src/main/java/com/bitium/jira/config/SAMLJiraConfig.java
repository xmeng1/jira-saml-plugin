package com.bitium.jira.config;

import com.bitium.saml.config.SAMLConfig;

public class SAMLJiraConfig extends SAMLConfig {
	public static final String DEFAULT_AUTOCREATE_USER_GROUP = "jira-users";

	public String getAlias() {
		return "jiraSAML";
	}
}

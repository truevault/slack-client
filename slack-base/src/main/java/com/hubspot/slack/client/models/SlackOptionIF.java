package com.hubspot.slack.client.models;

import org.immutables.value.Value.Immutable;

import com.hubspot.immutables.style.HubSpotStyle;

@Immutable
@HubSpotStyle
public interface SlackOptionIF {
  String getValue();
}

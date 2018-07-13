package com.hubspot.slack.client.models;

import java.util.List;

import org.immutables.value.Value.Immutable;

import com.hubspot.immutables.style.HubSpotStyle;

@Immutable
@HubSpotStyle
public interface SlackOptionsListIF {
  List<SlackOption> getOptions();
}
